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

package com.tcpl.sas.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SourceVendor. This utility wraps
 * <code>com.tcpl.sas.service.impl.SourceVendorLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Rakshansh
 * @see SourceVendorLocalService
 * @generated
 */
@ProviderType
public class SourceVendorLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.tcpl.sas.service.impl.SourceVendorLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the source vendor to the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was added
	 */
	public static com.tcpl.sas.model.SourceVendor addSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return getService().addSourceVendor(sourceVendor);
	}

	/**
	 * Creates a new source vendor with the primary key. Does not add the source vendor to the database.
	 *
	 * @param sourceVendorId the primary key for the new source vendor
	 * @return the new source vendor
	 */
	public static com.tcpl.sas.model.SourceVendor createSourceVendor(
		long sourceVendorId) {

		return getService().createSourceVendor(sourceVendorId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws PortalException if a source vendor with the primary key could not be found
	 */
	public static com.tcpl.sas.model.SourceVendor deleteSourceVendor(
			long sourceVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSourceVendor(sourceVendorId);
	}

	/**
	 * Deletes the source vendor from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was removed
	 */
	public static com.tcpl.sas.model.SourceVendor deleteSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return getService().deleteSourceVendor(sourceVendor);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.tcpl.sas.model.SourceVendor fetchSourceVendor(
		long sourceVendorId) {

		return getService().fetchSourceVendor(sourceVendorId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the source vendor with the primary key.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor
	 * @throws PortalException if a source vendor with the primary key could not be found
	 */
	public static com.tcpl.sas.model.SourceVendor getSourceVendor(
			long sourceVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSourceVendor(sourceVendorId);
	}

	/**
	 * Returns a range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @return the range of source vendors
	 */
	public static java.util.List<com.tcpl.sas.model.SourceVendor>
		getSourceVendors(int start, int end) {

		return getService().getSourceVendors(start, end);
	}

	/**
	 * Returns the number of source vendors.
	 *
	 * @return the number of source vendors
	 */
	public static int getSourceVendorsCount() {
		return getService().getSourceVendorsCount();
	}

	/**
	 * Updates the source vendor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was updated
	 */
	public static com.tcpl.sas.model.SourceVendor updateSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return getService().updateSourceVendor(sourceVendor);
	}

	public static SourceVendorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SourceVendorLocalService, SourceVendorLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SourceVendorLocalService.class);

		ServiceTracker<SourceVendorLocalService, SourceVendorLocalService>
			serviceTracker =
				new ServiceTracker
					<SourceVendorLocalService, SourceVendorLocalService>(
						bundle.getBundleContext(),
						SourceVendorLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}