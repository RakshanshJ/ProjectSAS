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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.tcpl.sas.exception.NoSuchRequirementDataException;
import com.tcpl.sas.model.RequirementData;
import com.tcpl.sas.model.impl.RequirementDataImpl;
import com.tcpl.sas.model.impl.RequirementDataModelImpl;
import com.tcpl.sas.service.persistence.RequirementDataPersistence;
import com.tcpl.sas.service.persistence.impl.constants.sasPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the requirement data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @generated
 */
@Component(service = RequirementDataPersistence.class)
@ProviderType
public class RequirementDataPersistenceImpl
	extends BasePersistenceImpl<RequirementData>
	implements RequirementDataPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RequirementDataUtil</code> to access the requirement data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RequirementDataImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the requirement datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching requirement datas
	 */
	@Override
	public List<RequirementData> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<RequirementData> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<RequirementData> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequirementData> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<RequirementData> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequirementData> orderByComparator,
		boolean retrieveFromCache) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid;
			finderArgs = new Object[] {uuid};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<RequirementData> list = null;

		if (retrieveFromCache) {
			list = (List<RequirementData>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RequirementData requirementData : list) {
					if (!uuid.equals(requirementData.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_REQUIREMENTDATA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(RequirementDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<RequirementData>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RequirementData>)QueryUtil.list(
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
	 * Returns the first requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByUuid_First(
			String uuid, OrderByComparator<RequirementData> orderByComparator)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByUuid_First(
			uuid, orderByComparator);

		if (requirementData != null) {
			return requirementData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchRequirementDataException(msg.toString());
	}

	/**
	 * Returns the first requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByUuid_First(
		String uuid, OrderByComparator<RequirementData> orderByComparator) {

		List<RequirementData> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByUuid_Last(
			String uuid, OrderByComparator<RequirementData> orderByComparator)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByUuid_Last(
			uuid, orderByComparator);

		if (requirementData != null) {
			return requirementData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchRequirementDataException(msg.toString());
	}

	/**
	 * Returns the last requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByUuid_Last(
		String uuid, OrderByComparator<RequirementData> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<RequirementData> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the requirement datas before and after the current requirement data in the ordered set where uuid = &#63;.
	 *
	 * @param requirementDataId the primary key of the current requirement data
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next requirement data
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData[] findByUuid_PrevAndNext(
			long requirementDataId, String uuid,
			OrderByComparator<RequirementData> orderByComparator)
		throws NoSuchRequirementDataException {

		uuid = Objects.toString(uuid, "");

		RequirementData requirementData = findByPrimaryKey(requirementDataId);

		Session session = null;

		try {
			session = openSession();

			RequirementData[] array = new RequirementDataImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, requirementData, uuid, orderByComparator, true);

			array[1] = requirementData;

			array[2] = getByUuid_PrevAndNext(
				session, requirementData, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RequirementData getByUuid_PrevAndNext(
		Session session, RequirementData requirementData, String uuid,
		OrderByComparator<RequirementData> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REQUIREMENTDATA_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(RequirementDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						requirementData)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<RequirementData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the requirement datas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (RequirementData requirementData :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(requirementData);
		}
	}

	/**
	 * Returns the number of requirement datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching requirement datas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUIREMENTDATA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"requirementData.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(requirementData.uuid IS NULL OR requirementData.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByUUID_G(String uuid, long groupId)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByUUID_G(uuid, groupId);

		if (requirementData == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchRequirementDataException(msg.toString());
		}

		return requirementData;
	}

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the requirement data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof RequirementData) {
			RequirementData requirementData = (RequirementData)result;

			if (!Objects.equals(uuid, requirementData.getUuid()) ||
				(groupId != requirementData.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_REQUIREMENTDATA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<RequirementData> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					RequirementData requirementData = list.get(0);

					result = requirementData;

					cacheResult(requirementData);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(_finderPathFetchByUUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (RequirementData)result;
		}
	}

	/**
	 * Removes the requirement data where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the requirement data that was removed
	 */
	@Override
	public RequirementData removeByUUID_G(String uuid, long groupId)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = findByUUID_G(uuid, groupId);

		return remove(requirementData);
	}

	/**
	 * Returns the number of requirement datas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching requirement datas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_REQUIREMENTDATA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"requirementData.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(requirementData.uuid IS NULL OR requirementData.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"requirementData.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByFindByReqId;
	private FinderPath _finderPathWithoutPaginationFindByFindByReqId;
	private FinderPath _finderPathCountByFindByReqId;

	/**
	 * Returns all the requirement datas where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @return the matching requirement datas
	 */
	@Override
	public List<RequirementData> findByFindByReqId(long requirementDataId) {
		return findByFindByReqId(
			requirementDataId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end) {

		return findByFindByReqId(requirementDataId, start, end, null);
	}

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
	@Override
	public List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end,
		OrderByComparator<RequirementData> orderByComparator) {

		return findByFindByReqId(
			requirementDataId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<RequirementData> findByFindByReqId(
		long requirementDataId, int start, int end,
		OrderByComparator<RequirementData> orderByComparator,
		boolean retrieveFromCache) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByFindByReqId;
			finderArgs = new Object[] {requirementDataId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByFindByReqId;
			finderArgs = new Object[] {
				requirementDataId, start, end, orderByComparator
			};
		}

		List<RequirementData> list = null;

		if (retrieveFromCache) {
			list = (List<RequirementData>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RequirementData requirementData : list) {
					if ((requirementDataId !=
							requirementData.getRequirementDataId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_REQUIREMENTDATA_WHERE);

			query.append(_FINDER_COLUMN_FINDBYREQID_REQUIREMENTDATAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(RequirementDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requirementDataId);

				if (!pagination) {
					list = (List<RequirementData>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RequirementData>)QueryUtil.list(
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
	 * Returns the first requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByFindByReqId_First(
			long requirementDataId,
			OrderByComparator<RequirementData> orderByComparator)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByFindByReqId_First(
			requirementDataId, orderByComparator);

		if (requirementData != null) {
			return requirementData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requirementDataId=");
		msg.append(requirementDataId);

		msg.append("}");

		throw new NoSuchRequirementDataException(msg.toString());
	}

	/**
	 * Returns the first requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByFindByReqId_First(
		long requirementDataId,
		OrderByComparator<RequirementData> orderByComparator) {

		List<RequirementData> list = findByFindByReqId(
			requirementDataId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByFindByReqId_Last(
			long requirementDataId,
			OrderByComparator<RequirementData> orderByComparator)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByFindByReqId_Last(
			requirementDataId, orderByComparator);

		if (requirementData != null) {
			return requirementData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requirementDataId=");
		msg.append(requirementDataId);

		msg.append("}");

		throw new NoSuchRequirementDataException(msg.toString());
	}

	/**
	 * Returns the last requirement data in the ordered set where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByFindByReqId_Last(
		long requirementDataId,
		OrderByComparator<RequirementData> orderByComparator) {

		int count = countByFindByReqId(requirementDataId);

		if (count == 0) {
			return null;
		}

		List<RequirementData> list = findByFindByReqId(
			requirementDataId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the requirement datas where requirementDataId = &#63; from the database.
	 *
	 * @param requirementDataId the requirement data ID
	 */
	@Override
	public void removeByFindByReqId(long requirementDataId) {
		for (RequirementData requirementData :
				findByFindByReqId(
					requirementDataId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(requirementData);
		}
	}

	/**
	 * Returns the number of requirement datas where requirementDataId = &#63;.
	 *
	 * @param requirementDataId the requirement data ID
	 * @return the number of matching requirement datas
	 */
	@Override
	public int countByFindByReqId(long requirementDataId) {
		FinderPath finderPath = _finderPathCountByFindByReqId;

		Object[] finderArgs = new Object[] {requirementDataId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUIREMENTDATA_WHERE);

			query.append(_FINDER_COLUMN_FINDBYREQID_REQUIREMENTDATAID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requirementDataId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FINDBYREQID_REQUIREMENTDATAID_2 =
		"requirementData.requirementDataId = ?";

	private FinderPath _finderPathFetchByStatus;
	private FinderPath _finderPathCountByStatus;

	/**
	 * Returns the requirement data where status = &#63; or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param status the status
	 * @return the matching requirement data
	 * @throws NoSuchRequirementDataException if a matching requirement data could not be found
	 */
	@Override
	public RequirementData findByStatus(String status)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByStatus(status);

		if (requirementData == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchRequirementDataException(msg.toString());
		}

		return requirementData;
	}

	/**
	 * Returns the requirement data where status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByStatus(String status) {
		return fetchByStatus(status, true);
	}

	/**
	 * Returns the requirement data where status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching requirement data, or <code>null</code> if a matching requirement data could not be found
	 */
	@Override
	public RequirementData fetchByStatus(
		String status, boolean retrieveFromCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = new Object[] {status};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(
				_finderPathFetchByStatus, finderArgs, this);
		}

		if (result instanceof RequirementData) {
			RequirementData requirementData = (RequirementData)result;

			if (!Objects.equals(status, requirementData.getStatus())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_REQUIREMENTDATA_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				List<RequirementData> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByStatus, finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"RequirementDataPersistenceImpl.fetchByStatus(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RequirementData requirementData = list.get(0);

					result = requirementData;

					cacheResult(requirementData);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(_finderPathFetchByStatus, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (RequirementData)result;
		}
	}

	/**
	 * Removes the requirement data where status = &#63; from the database.
	 *
	 * @param status the status
	 * @return the requirement data that was removed
	 */
	@Override
	public RequirementData removeByStatus(String status)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = findByStatus(status);

		return remove(requirementData);
	}

	/**
	 * Returns the number of requirement datas where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching requirement datas
	 */
	@Override
	public int countByStatus(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUIREMENTDATA_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 =
		"requirementData.status = ?";

	private static final String _FINDER_COLUMN_STATUS_STATUS_3 =
		"(requirementData.status IS NULL OR requirementData.status = '')";

	public RequirementDataPersistenceImpl() {
		setModelClass(RequirementData.class);

		setModelImplClass(RequirementDataImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the requirement data in the entity cache if it is enabled.
	 *
	 * @param requirementData the requirement data
	 */
	@Override
	public void cacheResult(RequirementData requirementData) {
		entityCache.putResult(
			entityCacheEnabled, RequirementDataImpl.class,
			requirementData.getPrimaryKey(), requirementData);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				requirementData.getUuid(), requirementData.getGroupId()
			},
			requirementData);

		finderCache.putResult(
			_finderPathFetchByStatus,
			new Object[] {requirementData.getStatus()}, requirementData);

		requirementData.resetOriginalValues();
	}

	/**
	 * Caches the requirement datas in the entity cache if it is enabled.
	 *
	 * @param requirementDatas the requirement datas
	 */
	@Override
	public void cacheResult(List<RequirementData> requirementDatas) {
		for (RequirementData requirementData : requirementDatas) {
			if (entityCache.getResult(
					entityCacheEnabled, RequirementDataImpl.class,
					requirementData.getPrimaryKey()) == null) {

				cacheResult(requirementData);
			}
			else {
				requirementData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all requirement datas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RequirementDataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the requirement data.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RequirementData requirementData) {
		entityCache.removeResult(
			entityCacheEnabled, RequirementDataImpl.class,
			requirementData.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(RequirementDataModelImpl)requirementData, true);
	}

	@Override
	public void clearCache(List<RequirementData> requirementDatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RequirementData requirementData : requirementDatas) {
			entityCache.removeResult(
				entityCacheEnabled, RequirementDataImpl.class,
				requirementData.getPrimaryKey());

			clearUniqueFindersCache(
				(RequirementDataModelImpl)requirementData, true);
		}
	}

	protected void cacheUniqueFindersCache(
		RequirementDataModelImpl requirementDataModelImpl) {

		Object[] args = new Object[] {
			requirementDataModelImpl.getUuid(),
			requirementDataModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, requirementDataModelImpl, false);

		args = new Object[] {requirementDataModelImpl.getStatus()};

		finderCache.putResult(
			_finderPathCountByStatus, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByStatus, args, requirementDataModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		RequirementDataModelImpl requirementDataModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				requirementDataModelImpl.getUuid(),
				requirementDataModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((requirementDataModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				requirementDataModelImpl.getOriginalUuid(),
				requirementDataModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {requirementDataModelImpl.getStatus()};

			finderCache.removeResult(_finderPathCountByStatus, args);
			finderCache.removeResult(_finderPathFetchByStatus, args);
		}

		if ((requirementDataModelImpl.getColumnBitmask() &
			 _finderPathFetchByStatus.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				requirementDataModelImpl.getOriginalStatus()
			};

			finderCache.removeResult(_finderPathCountByStatus, args);
			finderCache.removeResult(_finderPathFetchByStatus, args);
		}
	}

	/**
	 * Creates a new requirement data with the primary key. Does not add the requirement data to the database.
	 *
	 * @param requirementDataId the primary key for the new requirement data
	 * @return the new requirement data
	 */
	@Override
	public RequirementData create(long requirementDataId) {
		RequirementData requirementData = new RequirementDataImpl();

		requirementData.setNew(true);
		requirementData.setPrimaryKey(requirementDataId);

		String uuid = PortalUUIDUtil.generate();

		requirementData.setUuid(uuid);

		return requirementData;
	}

	/**
	 * Removes the requirement data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data that was removed
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData remove(long requirementDataId)
		throws NoSuchRequirementDataException {

		return remove((Serializable)requirementDataId);
	}

	/**
	 * Removes the requirement data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the requirement data
	 * @return the requirement data that was removed
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData remove(Serializable primaryKey)
		throws NoSuchRequirementDataException {

		Session session = null;

		try {
			session = openSession();

			RequirementData requirementData = (RequirementData)session.get(
				RequirementDataImpl.class, primaryKey);

			if (requirementData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRequirementDataException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(requirementData);
		}
		catch (NoSuchRequirementDataException nsee) {
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
	protected RequirementData removeImpl(RequirementData requirementData) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(requirementData)) {
				requirementData = (RequirementData)session.get(
					RequirementDataImpl.class,
					requirementData.getPrimaryKeyObj());
			}

			if (requirementData != null) {
				session.delete(requirementData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (requirementData != null) {
			clearCache(requirementData);
		}

		return requirementData;
	}

	@Override
	public RequirementData updateImpl(RequirementData requirementData) {
		boolean isNew = requirementData.isNew();

		if (!(requirementData instanceof RequirementDataModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(requirementData.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					requirementData);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in requirementData proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RequirementData implementation " +
					requirementData.getClass());
		}

		RequirementDataModelImpl requirementDataModelImpl =
			(RequirementDataModelImpl)requirementData;

		if (Validator.isNull(requirementData.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			requirementData.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (requirementData.getCreateDate() == null)) {
			if (serviceContext == null) {
				requirementData.setCreateDate(now);
			}
			else {
				requirementData.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!requirementDataModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				requirementData.setModifiedDate(now);
			}
			else {
				requirementData.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (requirementData.isNew()) {
				session.save(requirementData);

				requirementData.setNew(false);
			}
			else {
				requirementData = (RequirementData)session.merge(
					requirementData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {requirementDataModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				requirementDataModelImpl.getRequirementDataId()
			};

			finderCache.removeResult(_finderPathCountByFindByReqId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByFindByReqId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((requirementDataModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					requirementDataModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {requirementDataModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((requirementDataModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByFindByReqId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					requirementDataModelImpl.getOriginalRequirementDataId()
				};

				finderCache.removeResult(_finderPathCountByFindByReqId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByFindByReqId, args);

				args = new Object[] {
					requirementDataModelImpl.getRequirementDataId()
				};

				finderCache.removeResult(_finderPathCountByFindByReqId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByFindByReqId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, RequirementDataImpl.class,
			requirementData.getPrimaryKey(), requirementData, false);

		clearUniqueFindersCache(requirementDataModelImpl, false);
		cacheUniqueFindersCache(requirementDataModelImpl);

		requirementData.resetOriginalValues();

		return requirementData;
	}

	/**
	 * Returns the requirement data with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the requirement data
	 * @return the requirement data
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRequirementDataException {

		RequirementData requirementData = fetchByPrimaryKey(primaryKey);

		if (requirementData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRequirementDataException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return requirementData;
	}

	/**
	 * Returns the requirement data with the primary key or throws a <code>NoSuchRequirementDataException</code> if it could not be found.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data
	 * @throws NoSuchRequirementDataException if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData findByPrimaryKey(long requirementDataId)
		throws NoSuchRequirementDataException {

		return findByPrimaryKey((Serializable)requirementDataId);
	}

	/**
	 * Returns the requirement data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requirementDataId the primary key of the requirement data
	 * @return the requirement data, or <code>null</code> if a requirement data with the primary key could not be found
	 */
	@Override
	public RequirementData fetchByPrimaryKey(long requirementDataId) {
		return fetchByPrimaryKey((Serializable)requirementDataId);
	}

	/**
	 * Returns all the requirement datas.
	 *
	 * @return the requirement datas
	 */
	@Override
	public List<RequirementData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<RequirementData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<RequirementData> findAll(
		int start, int end,
		OrderByComparator<RequirementData> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<RequirementData> findAll(
		int start, int end,
		OrderByComparator<RequirementData> orderByComparator,
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

		List<RequirementData> list = null;

		if (retrieveFromCache) {
			list = (List<RequirementData>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REQUIREMENTDATA);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REQUIREMENTDATA;

				if (pagination) {
					sql = sql.concat(RequirementDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RequirementData>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RequirementData>)QueryUtil.list(
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
	 * Removes all the requirement datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RequirementData requirementData : findAll()) {
			remove(requirementData);
		}
	}

	/**
	 * Returns the number of requirement datas.
	 *
	 * @return the number of requirement datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REQUIREMENTDATA);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "requirementDataId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_REQUIREMENTDATA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RequirementDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the requirement data persistence.
	 */
	@Activate
	public void activate() {
		RequirementDataModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		RequirementDataModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			RequirementDataModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			RequirementDataModelImpl.UUID_COLUMN_BITMASK |
			RequirementDataModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByFindByReqId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFindByReqId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByFindByReqId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFindByReqId",
			new String[] {Long.class.getName()},
			RequirementDataModelImpl.REQUIREMENTDATAID_COLUMN_BITMASK);

		_finderPathCountByFindByReqId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFindByReqId",
			new String[] {Long.class.getName()});

		_finderPathFetchByStatus = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RequirementDataImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByStatus",
			new String[] {String.class.getName()},
			RequirementDataModelImpl.STATUS_COLUMN_BITMASK);

		_finderPathCountByStatus = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(RequirementDataImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.tcpl.sas.model.RequirementData"),
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

	private static final String _SQL_SELECT_REQUIREMENTDATA =
		"SELECT requirementData FROM RequirementData requirementData";

	private static final String _SQL_SELECT_REQUIREMENTDATA_WHERE =
		"SELECT requirementData FROM RequirementData requirementData WHERE ";

	private static final String _SQL_COUNT_REQUIREMENTDATA =
		"SELECT COUNT(requirementData) FROM RequirementData requirementData";

	private static final String _SQL_COUNT_REQUIREMENTDATA_WHERE =
		"SELECT COUNT(requirementData) FROM RequirementData requirementData WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "requirementData.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RequirementData exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RequirementData exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RequirementDataPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}