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

package com.tcpl.sas.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tcpl.sas.model.EvalVendor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the eval vendor service. This utility wraps <code>com.tcpl.sas.service.persistence.impl.EvalVendorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see EvalVendorPersistence
 * @generated
 */
@ProviderType
public class EvalVendorUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EvalVendor evalVendor) {
		getPersistence().clearCache(evalVendor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, EvalVendor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EvalVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EvalVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EvalVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EvalVendor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EvalVendor update(EvalVendor evalVendor) {
		return getPersistence().update(evalVendor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EvalVendor update(
		EvalVendor evalVendor, ServiceContext serviceContext) {

		return getPersistence().update(evalVendor, serviceContext);
	}

	/**
	 * Caches the eval vendor in the entity cache if it is enabled.
	 *
	 * @param evalVendor the eval vendor
	 */
	public static void cacheResult(EvalVendor evalVendor) {
		getPersistence().cacheResult(evalVendor);
	}

	/**
	 * Caches the eval vendors in the entity cache if it is enabled.
	 *
	 * @param evalVendors the eval vendors
	 */
	public static void cacheResult(List<EvalVendor> evalVendors) {
		getPersistence().cacheResult(evalVendors);
	}

	/**
	 * Creates a new eval vendor with the primary key. Does not add the eval vendor to the database.
	 *
	 * @param evalVendorId the primary key for the new eval vendor
	 * @return the new eval vendor
	 */
	public static EvalVendor create(long evalVendorId) {
		return getPersistence().create(evalVendorId);
	}

	/**
	 * Removes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	public static EvalVendor remove(long evalVendorId)
		throws com.tcpl.sas.exception.NoSuchEvalVendorException {

		return getPersistence().remove(evalVendorId);
	}

	public static EvalVendor updateImpl(EvalVendor evalVendor) {
		return getPersistence().updateImpl(evalVendor);
	}

	/**
	 * Returns the eval vendor with the primary key or throws a <code>NoSuchEvalVendorException</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	public static EvalVendor findByPrimaryKey(long evalVendorId)
		throws com.tcpl.sas.exception.NoSuchEvalVendorException {

		return getPersistence().findByPrimaryKey(evalVendorId);
	}

	/**
	 * Returns the eval vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor, or <code>null</code> if a eval vendor with the primary key could not be found
	 */
	public static EvalVendor fetchByPrimaryKey(long evalVendorId) {
		return getPersistence().fetchByPrimaryKey(evalVendorId);
	}

	/**
	 * Returns all the eval vendors.
	 *
	 * @return the eval vendors
	 */
	public static List<EvalVendor> findAll() {
		return getPersistence().findAll();
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
	public static List<EvalVendor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<EvalVendor> findAll(
		int start, int end, OrderByComparator<EvalVendor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<EvalVendor> findAll(
		int start, int end, OrderByComparator<EvalVendor> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the eval vendors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of eval vendors.
	 *
	 * @return the number of eval vendors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EvalVendorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EvalVendorPersistence, EvalVendorPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EvalVendorPersistence.class);

		ServiceTracker<EvalVendorPersistence, EvalVendorPersistence>
			serviceTracker =
				new ServiceTracker
					<EvalVendorPersistence, EvalVendorPersistence>(
						bundle.getBundleContext(), EvalVendorPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}