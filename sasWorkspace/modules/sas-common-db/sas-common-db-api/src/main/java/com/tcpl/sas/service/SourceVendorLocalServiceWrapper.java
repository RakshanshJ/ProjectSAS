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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link SourceVendorLocalService}.
 *
 * @author Rakshansh
 * @see SourceVendorLocalService
 * @generated
 */
@ProviderType
public class SourceVendorLocalServiceWrapper
	implements SourceVendorLocalService,
			   ServiceWrapper<SourceVendorLocalService> {

	public SourceVendorLocalServiceWrapper(
		SourceVendorLocalService sourceVendorLocalService) {

		_sourceVendorLocalService = sourceVendorLocalService;
	}

	/**
	 * Adds the source vendor to the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was added
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor addSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return _sourceVendorLocalService.addSourceVendor(sourceVendor);
	}

	/**
	 * Creates a new source vendor with the primary key. Does not add the source vendor to the database.
	 *
	 * @param sourceVendorId the primary key for the new source vendor
	 * @return the new source vendor
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor createSourceVendor(
		long sourceVendorId) {

		return _sourceVendorLocalService.createSourceVendor(sourceVendorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourceVendorLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws PortalException if a source vendor with the primary key could not be found
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor deleteSourceVendor(
			long sourceVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourceVendorLocalService.deleteSourceVendor(sourceVendorId);
	}

	/**
	 * Deletes the source vendor from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was removed
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor deleteSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return _sourceVendorLocalService.deleteSourceVendor(sourceVendor);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sourceVendorLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sourceVendorLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sourceVendorLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sourceVendorLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sourceVendorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sourceVendorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.tcpl.sas.model.SourceVendor fetchSourceVendor(
		long sourceVendorId) {

		return _sourceVendorLocalService.fetchSourceVendor(sourceVendorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sourceVendorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sourceVendorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sourceVendorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourceVendorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the source vendor with the primary key.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor
	 * @throws PortalException if a source vendor with the primary key could not be found
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor getSourceVendor(long sourceVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourceVendorLocalService.getSourceVendor(sourceVendorId);
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
	@Override
	public java.util.List<com.tcpl.sas.model.SourceVendor> getSourceVendors(
		int start, int end) {

		return _sourceVendorLocalService.getSourceVendors(start, end);
	}

	/**
	 * Returns the number of source vendors.
	 *
	 * @return the number of source vendors
	 */
	@Override
	public int getSourceVendorsCount() {
		return _sourceVendorLocalService.getSourceVendorsCount();
	}

	/**
	 * Updates the source vendor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendor the source vendor
	 * @return the source vendor that was updated
	 */
	@Override
	public com.tcpl.sas.model.SourceVendor updateSourceVendor(
		com.tcpl.sas.model.SourceVendor sourceVendor) {

		return _sourceVendorLocalService.updateSourceVendor(sourceVendor);
	}

	@Override
	public SourceVendorLocalService getWrappedService() {
		return _sourceVendorLocalService;
	}

	@Override
	public void setWrappedService(
		SourceVendorLocalService sourceVendorLocalService) {

		_sourceVendorLocalService = sourceVendorLocalService;
	}

	private SourceVendorLocalService _sourceVendorLocalService;

}