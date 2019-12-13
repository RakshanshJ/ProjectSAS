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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tcpl.sas.exception.NoSuchRequirementDataException;
import com.tcpl.sas.model.RequirementData;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the requirement data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see RequirementDataUtil
 * @generated
 */
@ProviderType
public interface RequirementDataPersistence
	extends BasePersistence<RequirementData> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RequirementDataUtil} to access the requirement data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the requirement datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching requirement datas
	 */
	public java.util.List<RequirementData> findByUuid(String uuid);

	/**
	 * Returns a range of all the requirement datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @return the range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the requirement datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requirement datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
				orderByComparator)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the first requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns the last requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
				orderByComparator)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the last requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns the requirement datas before and after the current requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param requirementDataId the primary key of the current requirement data
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next requirement data
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	public RequirementData[] findByUuid_PrevAndNext(
			long requirementDataId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
				orderByComparator)
		throws NoSuchRequirementDataException;

	/**
	 * Removes all the requirement datas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of requirement datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching requirement datas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByUUID_G(String uuid, long groupId)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the requirement data where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the requirement data that was removed
	 */
	public RequirementData removeByUUID_G(String uuid, long groupId)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the number of requirement datas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching requirement datas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the requirement datas where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @return the matching requirement datas
	 */
	public java.util.List<RequirementData> findByFindByReqId(
		long requirementDataId);

	/**
	 * Returns a range of all the requirement datas where requirementDataId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requirementDataId the requirement data ID
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @return the range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end);

	/**
	 * Returns an ordered range of all the requirement datas where requirementDataId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requirementDataId the requirement data ID
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requirement datas where requirementDataId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requirementDataId the requirement data ID
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching requirement datas
	 */
	public java.util.List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByFindByReqId_First(
			long requirementDataId,
			com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
				orderByComparator)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the first requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByFindByReqId_First(
		long requirementDataId,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns the last requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByFindByReqId_Last(
			long requirementDataId,
			com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
				orderByComparator)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the last requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByFindByReqId_Last(
		long requirementDataId,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Removes all the requirement datas where requirementDataId = &#63; from the database.
	 *
	 * @param requirementDataId the requirement data ID
	 */
	public void removeByFindByReqId(long requirementDataId);

	/**
	 * Returns the number of requirement datas where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @return the number of matching requirement datas
	 */
	public int countByFindByReqId(long requirementDataId);

	/**
	 * Returns the requirement data where status = &#63; or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param status the status
	 * @return the matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	public RequirementData findByStatus(String status)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the requirement data where status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByStatus(String status);

	/**
	 * Returns the requirement data where status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	public RequirementData fetchByStatus(
		String status, boolean retrieveFromCache);

	/**
	 * Removes the requirement data where status = &#63; from the database.
	 *
	 * @param status the status
	 * @return the requirement data that was removed
	 */
	public RequirementData removeByStatus(String status)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the number of requirement datas where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching requirement datas
	 */
	public int countByStatus(String status);

	/**
	 * Caches the requirement data in the entity cache if it is enabled.
	 *
	 * @param requirementData the requirement data
	 */
	public void cacheResult(RequirementData requirementData);

	/**
	 * Caches the requirement datas in the entity cache if it is enabled.
	 *
	 * @param requirementDatas the requirement datas
	 */
	public void cacheResult(java.util.List<RequirementData> requirementDatas);

	/**
	 * Creates a new requirement data with the primary key. Does not add the requirement data to the database.
	 *
	 * @param requirementDataId the primary key for the new requirement data
	 * @return the new requirement data
	 */
	public RequirementData create(long requirementDataId);

	/**
	 * Removes the requirement data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data that was removed
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	public RequirementData remove(long requirementDataId)
		throws NoSuchRequirementDataException;

	public RequirementData updateImpl(RequirementData requirementData);

	/**
	 * Returns the requirement data with the primary key or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	public RequirementData findByPrimaryKey(long requirementDataId)
		throws NoSuchRequirementDataException;

	/**
	 * Returns the requirement data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data, or <code>null</code> if a requirement data with the primary key could not be found
	 */
	public RequirementData fetchByPrimaryKey(long requirementDataId);

	/**
	 * Returns all the requirement datas.
	 *
	 * @return the requirement datas
	 */
	public java.util.List<RequirementData> findAll();

	/**
	 * Returns a range of all the requirement datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @return the range of requirement datas
	 */
	public java.util.List<RequirementData> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the requirement datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of requirement datas
	 */
	public java.util.List<RequirementData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requirement datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RequirementDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requirement datas
	 * @param end the upper bound of the range of requirement datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of requirement datas
	 */
	public java.util.List<RequirementData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequirementData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the requirement datas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of requirement datas.
	 *
	 * @return the number of requirement datas
	 */
	public int countAll();

}