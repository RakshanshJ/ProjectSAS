/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tcpl.sas.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.tcpl.sas.exception.NoSuchEvalVendorException;
import com.tcpl.sas.model.EvalVendor;
import com.tcpl.sas.model.impl.EvalVendorImpl;
import com.tcpl.sas.model.impl.EvalVendorModelImpl;
import com.tcpl.sas.service.persistence.EvalVendorPersistence;
import com.tcpl.sas.service.persistence.impl.constants.sasPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the eval vendor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @generated
 */
@Component(service = EvalVendorPersistence.class)
@ProviderType
public class EvalVendorPersistenceImpl
	extends BasePersistenceImpl<EvalVendor> implements EvalVendorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EvalVendorUtil</code> to access the eval vendor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EvalVendorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public EvalVendorPersistenceImpl() {
		setModelClass(EvalVendor.class);

		setModelImplClass(EvalVendorImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the eval vendor in the entity cache if it is enabled.
	 *
	 * @param evalVendor the eval vendor
	 */
	@Override
	public void cacheResult(EvalVendor evalVendor) {
		entityCache.putResult(
			entityCacheEnabled, EvalVendorImpl.class,
			evalVendor.getPrimaryKey(), evalVendor);

		evalVendor.resetOriginalValues();
	}

	/**
	 * Caches the eval vendors in the entity cache if it is enabled.
	 *
	 * @param evalVendors the eval vendors
	 */
	@Override
	public void cacheResult(List<EvalVendor> evalVendors) {
		for (EvalVendor evalVendor : evalVendors) {
			if (entityCache.getResult(
					entityCacheEnabled, EvalVendorImpl.class,
					evalVendor.getPrimaryKey()) == null) {

				cacheResult(evalVendor);
			}
			else {
				evalVendor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all eval vendors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EvalVendorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the eval vendor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EvalVendor evalVendor) {
		entityCache.removeResult(
			entityCacheEnabled, EvalVendorImpl.class,
			evalVendor.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EvalVendor> evalVendors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EvalVendor evalVendor : evalVendors) {
			entityCache.removeResult(
				entityCacheEnabled, EvalVendorImpl.class,
				evalVendor.getPrimaryKey());
		}
	}

	/**
	 * Creates a new eval vendor with the primary key. Does not add the eval vendor to the database.
	 *
	 * @param evalVendorId the primary key for the new eval vendor
	 * @return the new eval vendor
	 */
	@Override
	public EvalVendor create(long evalVendorId) {
		EvalVendor evalVendor = new EvalVendorImpl();

		evalVendor.setNew(true);
		evalVendor.setPrimaryKey(evalVendorId);

		return evalVendor;
	}

	/**
	 * Removes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor remove(long evalVendorId)
		throws NoSuchEvalVendorException {

		return remove((Serializable)evalVendorId);
	}

	/**
	 * Removes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor remove(Serializable primaryKey)
		throws NoSuchEvalVendorException {

		Session session = null;

		try {
			session = openSession();

			EvalVendor evalVendor = (EvalVendor)session.get(
				EvalVendorImpl.class, primaryKey);

			if (evalVendor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEvalVendorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evalVendor);
		}
		catch (NoSuchEvalVendorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EvalVendor removeImpl(EvalVendor evalVendor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evalVendor)) {
				evalVendor = (EvalVendor)session.get(
					EvalVendorImpl.class, evalVendor.getPrimaryKeyObj());
			}

			if (evalVendor != null) {
				session.delete(evalVendor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (evalVendor != null) {
			clearCache(evalVendor);
		}

		return evalVendor;
	}

	@Override
	public EvalVendor updateImpl(EvalVendor evalVendor) {
		boolean isNew = evalVendor.isNew();

		if (!(evalVendor instanceof EvalVendorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evalVendor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(evalVendor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evalVendor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EvalVendor implementation " +
					evalVendor.getClass());
		}

		EvalVendorModelImpl evalVendorModelImpl =
			(EvalVendorModelImpl)evalVendor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (evalVendor.getCreateDate() == null)) {
			if (serviceContext == null) {
				evalVendor.setCreateDate(now);
			}
			else {
				evalVendor.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!evalVendorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evalVendor.setModifiedDate(now);
			}
			else {
				evalVendor.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (evalVendor.isNew()) {
				session.save(evalVendor);

				evalVendor.setNew(false);
			}
			else {
				evalVendor = (EvalVendor)session.merge(evalVendor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, EvalVendorImpl.class,
			evalVendor.getPrimaryKey(), evalVendor, false);

		evalVendor.resetOriginalValues();

		return evalVendor;
	}

	/**
	 * Returns the eval vendor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEvalVendorException {

		EvalVendor evalVendor = fetchByPrimaryKey(primaryKey);

		if (evalVendor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEvalVendorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evalVendor;
	}

	/**
	 * Returns the eval vendor with the primary key or throws a <code>NoSuchEvalVendorException</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor findByPrimaryKey(long evalVendorId)
		throws NoSuchEvalVendorException {

		return findByPrimaryKey((Serializable)evalVendorId);
	}

	/**
	 * Returns the eval vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor, or <code>null</code> if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor fetchByPrimaryKey(long evalVendorId) {
		return fetchByPrimaryKey((Serializable)evalVendorId);
	}

	/**
	 * Returns all the eval vendors.
	 *
	 * @return the eval vendors
	 */
	@Override
	public List<EvalVendor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @return the range of eval vendors
	 */
	@Override
	public List<EvalVendor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of eval vendors
	 */
	@Override
	public List<EvalVendor> findAll(
		int start, int end, OrderByComparator<EvalVendor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of eval vendors
	 */
	@Override
	public List<EvalVendor> findAll(
		int start, int end, OrderByComparator<EvalVendor> orderByComparator,
		boolean retrieveFromCache) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<EvalVendor> list = null;

		if (retrieveFromCache) {
			list = (List<EvalVendor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EVALVENDOR);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EVALVENDOR;

				if (pagination) {
					sql = sql.concat(EvalVendorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EvalVendor>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EvalVendor>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the eval vendors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EvalVendor evalVendor : findAll()) {
			remove(evalVendor);
		}
	}

	/**
	 * Returns the number of eval vendors.
	 *
	 * @return the number of eval vendors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EVALVENDOR);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "evalVendorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVALVENDOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EvalVendorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the eval vendor persistence.
	 */
	@Activate
	public void activate() {
		EvalVendorModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		EvalVendorModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EvalVendorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EvalVendorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EvalVendorImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = sasPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.tcpl.sas.model.EvalVendor"),
			true);
	}

	@Override
	@Reference(
		target = sasPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = sasPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EVALVENDOR =
		"SELECT evalVendor FROM EvalVendor evalVendor";

	private static final String _SQL_COUNT_EVALVENDOR =
		"SELECT COUNT(evalVendor) FROM EvalVendor evalVendor";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evalVendor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EvalVendor exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		EvalVendorPersistenceImpl.class);

}