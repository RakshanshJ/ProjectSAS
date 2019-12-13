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

import com.tcpl.sas.model.SourceVendor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the source vendor service. This utility wraps <code>com.tcpl.sas.service.persistence.impl.SourceVendorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see SourceVendorPersistence
 * @generated
 */
@ProviderType
public class SourceVendorUtil {

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
	public static void clearCache(SourceVendor sourceVendor) {
		getPersistence().clearCache(sourceVendor);
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
	public static Map<Serializable, SourceVendor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SourceVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SourceVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SourceVendor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SourceVendor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SourceVendor update(SourceVendor sourceVendor) {
		return getPersistence().update(sourceVendor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SourceVendor update(
		SourceVendor sourceVendor, ServiceContext serviceContext) {

		return getPersistence().update(sourceVendor, serviceContext);
	}

	/**
	 * Caches the source vendor in the entity cache if it is enabled.
	 *
	 * @param sourceVendor the source vendor
	 */
	public static void cacheResult(SourceVendor sourceVendor) {
		getPersistence().cacheResult(sourceVendor);
	}

	/**
	 * Caches the source vendors in the entity cache if it is enabled.
	 *
	 * @param sourceVendors the source vendors
	 */
	public static void cacheResult(List<SourceVendor> sourceVendors) {
		getPersistence().cacheResult(sourceVendors);
	}

	/**
	 * Creates a new source vendor with the primary key. Does not add the source vendor to the database.
	 *
	 * @param sourceVendorId the primary key for the new source vendor
	 * @return the new source vendor
	 */
	public static SourceVendor create(long sourceVendorId) {
		return getPersistence().create(sourceVendorId);
	}

	/**
	 * Removes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	public static SourceVendor remove(long sourceVendorId)
		throws com.tcpl.sas.exception.NoSuchSourceVendorException {

		return getPersistence().remove(sourceVendorId);
	}

	public static SourceVendor updateImpl(SourceVendor sourceVendor) {
		return getPersistence().updateImpl(sourceVendor);
	}

	/**
	 * Returns the source vendor with the primary key or throws a <code>NoSuchSourceVendorException</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	public static SourceVendor findByPrimaryKey(long sourceVendorId)
		throws com.tcpl.sas.exception.NoSuchSourceVendorException {

		return getPersistence().findByPrimaryKey(sourceVendorId);
	}

	/**
	 * Returns the source vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor, or <code>null</code> if a source vendor with the primary key could not be found
	 */
	public static SourceVendor fetchByPrimaryKey(long sourceVendorId) {
		return getPersistence().fetchByPrimaryKey(sourceVendorId);
	}

	/**
	 * Returns all the source vendors.
	 *
	 * @return the source vendors
	 */
	public static List<SourceVendor> findAll() {
		return getPersistence().findAll();
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
	public static List<SourceVendor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<SourceVendor> findAll(
		int start, int end, OrderByComparator<SourceVendor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<SourceVendor> findAll(
		int start, int end, OrderByComparator<SourceVendor> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the source vendors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of source vendors.
	 *
	 * @return the number of source vendors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SourceVendorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SourceVendorPersistence, SourceVendorPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SourceVendorPersistence.class);

		ServiceTracker<SourceVendorPersistence, SourceVendorPersistence>
			serviceTracker =
				new ServiceTracker
					<SourceVendorPersistence, SourceVendorPersistence>(
						bundle.getBundleContext(),
						SourceVendorPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}