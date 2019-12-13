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
 * Provides the local service utility for RequirementData. This utility wraps
 * <code>com.tcpl.sas.service.impl.RequirementDataLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Rakshansh
 * @see RequirementDataLocalService
 * @generated
 */
@ProviderType
public class RequirementDataLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.tcpl.sas.service.impl.RequirementDataLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the requirement data to the database. Also notifies the appropriate model listeners.
	 *
	 * @param requirementData the requirement data
	 * @return the requirement data that was added
	 */
	public static com.tcpl.sas.model.RequirementData addRequirementData(
		com.tcpl.sas.model.RequirementData requirementData) {

		return getService().addRequirementData(requirementData);
	}

	/**
	 * Creates a new requirement data with the primary key. Does not add the requirement data to the database.
	 *
	 * @param requirementDataId the primary key for the new requirement data
	 * @return the new requirement data
	 */
	public static com.tcpl.sas.model.RequirementData createRequirementData(
		long requirementDataId) {

		return getService().createRequirementData(requirementDataId);
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
	 * Deletes the requirement data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data that was removed
	 * @throws PortalException if a requirement data with the primary key could not be found
	 */
	public static com.tcpl.sas.model.RequirementData deleteRequirementData(
			long requirementDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRequirementData(requirementDataId);
	}

	/**
	 * Deletes the requirement data from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requirementData the requirement data
	 * @return the requirement data that was removed
	 */
	public static com.tcpl.sas.model.RequirementData deleteRequirementData(
		com.tcpl.sas.model.RequirementData requirementData) {

		return getService().deleteRequirementData(requirementData);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.tcpl.sas.model.RequirementData fetchRequirementData(
		long requirementDataId) {

		return getService().fetchRequirementData(requirementDataId);
	}

	/**
	 * Returns the requirement data matching the UUID and group.
	 *
	 * @param uuid the requirement data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public static com.tcpl.sas.model.RequirementData
		fetchRequirementDataByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchRequirementDataByUuidAndGroupId(uuid, groupId);
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
	 * Returns the requirement data with the primary key.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data
	 * @throws PortalException if a requirement data with the primary key could not be found
	 */
	public static com.tcpl.sas.model.RequirementData getRequirementData(
			long requirementDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRequirementData(requirementDataId);
	}

	/**
	 * Returns the requirement data matching the UUID and group.
	 *
	 * @param uuid the requirement data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching requirement data
	 * @throws PortalException if a matching requirement data could not be found
	 */
	public static com.tcpl.sas.model.RequirementData
			getRequirementDataByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRequirementDataByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the requirement datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @return the range of requirement datas
	 */
	public static java.util.List<com.tcpl.sas.model.RequirementData>
		getRequirementDatas(int start, int end) {

		return getService().getRequirementDatas(start, end);
	}

	/**
	 * Returns the number of requirement datas.
	 *
	 * @return the number of requirement datas
	 */
	public static int getRequirementDatasCount() {
		return getService().getRequirementDatasCount();
	}

	/**
	 * Updates the requirement data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param requirementData the requirement data
	 * @return the requirement data that was updated
	 */
	public static com.tcpl.sas.model.RequirementData updateRequirementData(
		com.tcpl.sas.model.RequirementData requirementData) {

		return getService().updateRequirementData(requirementData);
	}

	public static RequirementDataLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RequirementDataLocalService, RequirementDataLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RequirementDataLocalService.class);

		ServiceTracker<RequirementDataLocalService, RequirementDataLocalService>
			serviceTracker =
				new ServiceTracker
					<RequirementDataLocalService, RequirementDataLocalService>(
						bundle.getBundleContext(),
						RequirementDataLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}