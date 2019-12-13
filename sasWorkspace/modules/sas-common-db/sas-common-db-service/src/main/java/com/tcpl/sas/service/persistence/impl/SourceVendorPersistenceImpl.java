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

import com.tcpl.sas.exception.NoSuchSourceVendorException;
import com.tcpl.sas.model.SourceVendor;
import com.tcpl.sas.model.impl.SourceVendorImpl;
import com.tcpl.sas.model.impl.SourceVendorModelImpl;
import com.tcpl.sas.service.persistence.SourceVendorPersistence;
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
 * The persistence implementation for the source vendor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @generated
 */
@Component(service = SourceVendorPersistence.class)
@ProviderType
public class SourceVendorPersistenceImpl
	extends BasePersistenceImpl<SourceVendor>
	implements SourceVendorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SourceVendorUtil</code> to access the source vendor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SourceVendorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public SourceVendorPersistenceImpl() {
		setModelClass(SourceVendor.class);

		setModelImplClass(SourceVendorImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the source vendor in the entity cache if it is enabled.
	 *
	 * @param sourceVendor the source vendor
	 */
	@Override
	public void cacheResult(SourceVendor sourceVendor) {
		entityCache.putResult(
			entityCacheEnabled, SourceVendorImpl.class,
			sourceVendor.getPrimaryKey(), sourceVendor);

		sourceVendor.resetOriginalValues();
	}

	/**
	 * Caches the source vendors in the entity cache if it is enabled.
	 *
	 * @param sourceVendors the source vendors
	 */
	@Override
	public void cacheResult(List<SourceVendor> sourceVendors) {
		for (SourceVendor sourceVendor : sourceVendors) {
			if (entityCache.getResult(
					entityCacheEnabled, SourceVendorImpl.class,
					sourceVendor.getPrimaryKey()) == null) {

				cacheResult(sourceVendor);
			}
			else {
				sourceVendor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all source vendors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SourceVendorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the source vendor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SourceVendor sourceVendor) {
		entityCache.removeResult(
			entityCacheEnabled, SourceVendorImpl.class,
			sourceVendor.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SourceVendor> sourceVendors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SourceVendor sourceVendor : sourceVendors) {
			entityCache.removeResult(
				entityCacheEnabled, SourceVendorImpl.class,
				sourceVendor.getPrimaryKey());
		}
	}

	/**
	 * Creates a new source vendor with the primary key. Does not add the source vendor to the database.
	 *
	 * @param sourceVendorId the primary key for the new source vendor
	 * @return the new source vendor
	 */
	@Override
	public SourceVendor create(long sourceVendorId) {
		SourceVendor sourceVendor = new SourceVendorImpl();

		sourceVendor.setNew(true);
		sourceVendor.setPrimaryKey(sourceVendorId);

		return sourceVendor;
	}

	/**
	 * Removes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	@Override
	public SourceVendor remove(long sourceVendorId)
		throws NoSuchSourceVendorException {

		return remove((Serializable)sourceVendorId);
	}

	/**
	 * Removes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	@Override
	public SourceVendor remove(Serializable primaryKey)
		throws NoSuchSourceVendorException {

		Session session = null;

		try {
			session = openSession();

			SourceVendor sourceVendor = (SourceVendor)session.get(
				SourceVendorImpl.class, primaryKey);

			if (sourceVendor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSourceVendorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sourceVendor);
		}
		catch (NoSuchSourceVendorException nsee) {
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
	protected SourceVendor removeImpl(SourceVendor sourceVendor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sourceVendor)) {
				sourceVendor = (SourceVendor)session.get(
					SourceVendorImpl.class, sourceVendor.getPrimaryKeyObj());
			}

			if (sourceVendor != null) {
				session.delete(sourceVendor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sourceVendor != null) {
			clearCache(sourceVendor);
		}

		return sourceVendor;
	}

	@Override
	public SourceVendor updateImpl(SourceVendor sourceVendor) {
		boolean isNew = sourceVendor.isNew();

		if (!(sourceVendor instanceof SourceVendorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sourceVendor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sourceVendor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sourceVendor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SourceVendor implementation " +
					sourceVendor.getClass());
		}

		SourceVendorModelImpl sourceVendorModelImpl =
			(SourceVendorModelImpl)sourceVendor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (sourceVendor.getCreateDate() == null)) {
			if (serviceContext == null) {
				sourceVendor.setCreateDate(now);
			}
			else {
				sourceVendor.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!sourceVendorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sourceVendor.setModifiedDate(now);
			}
			else {
				sourceVendor.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (sourceVendor.isNew()) {
				session.save(sourceVendor);

				sourceVendor.setNew(false);
			}
			else {
				sourceVendor = (SourceVendor)session.merge(sourceVendor);
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
			entityCacheEnabled, SourceVendorImpl.class,
			sourceVendor.getPrimaryKey(), sourceVendor, false);

		sourceVendor.resetOriginalValues();

		return sourceVendor;
	}

	/**
	 * Returns the source vendor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the source vendor
	 * @return the source vendor
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	@Override
	public SourceVendor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSourceVendorException {

		SourceVendor sourceVendor = fetchByPrimaryKey(primaryKey);

		if (sourceVendor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSourceVendorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sourceVendor;
	}

	/**
	 * Returns the source vendor with the primary key or throws a <code>NoSuchSourceVendorException</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	@Override
	public SourceVendor findByPrimaryKey(long sourceVendorId)
		throws NoSuchSourceVendorException {

		return findByPrimaryKey((Serializable)sourceVendorId);
	}

	/**
	 * Returns the source vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor, or <code>null</code> if a source vendor with the primary key could not be found
	 */
	@Override
	public SourceVendor fetchByPrimaryKey(long sourceVendorId) {
		return fetchByPrimaryKey((Serializable)sourceVendorId);
	}

	/**
	 * Returns all the source vendors.
	 *
	 * @return the source vendors
	 */
	@Override
	public List<SourceVendor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @return the range of source vendors
	 */
	@Override
	public List<SourceVendor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of source vendors
	 */
	@Override
	public List<SourceVendor> findAll(
		int start, int end, OrderByComparator<SourceVendor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of source vendors
	 */
	@Override
	public List<SourceVendor> findAll(
		int start, int end, OrderByComparator<SourceVendor> orderByComparator,
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

		List<SourceVendor> list = null;

		if (retrieveFromCache) {
			list = (List<SourceVendor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SOURCEVENDOR);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOURCEVENDOR;

				if (pagination) {
					sql = sql.concat(SourceVendorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SourceVendor>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SourceVendor>)QueryUtil.list(
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
	 * Removes all the source vendors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SourceVendor sourceVendor : findAll()) {
			remove(sourceVendor);
		}
	}

	/**
	 * Returns the number of source vendors.
	 *
	 * @return the number of source vendors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SOURCEVENDOR);

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
		return "sourceVendorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SOURCEVENDOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SourceVendorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the source vendor persistence.
	 */
	@Activate
	public void activate() {
		SourceVendorModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		SourceVendorModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SourceVendorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SourceVendorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(SourceVendorImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.tcpl.sas.model.SourceVendor"),
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

	private static final String _SQL_SELECT_SOURCEVENDOR =
		"SELECT sourceVendor FROM SourceVendor sourceVendor";

	private static final String _SQL_COUNT_SOURCEVENDOR =
		"SELECT COUNT(sourceVendor) FROM SourceVendor sourceVendor";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sourceVendor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SourceVendor exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		SourceVendorPersistenceImpl.class);

}