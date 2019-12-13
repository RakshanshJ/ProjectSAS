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

package com.tcpl.sas.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link SkillSet}.
 * </p>
 *
 * @author Rakshansh
 * @see SkillSet
 * @generated
 */
@ProviderType
public class SkillSetWrapper
	extends BaseModelWrapper<SkillSet>
	implements SkillSet, ModelWrapper<SkillSet> {

	public SkillSetWrapper(SkillSet skillSet) {
		super(skillSet);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("skillSetId", getSkillSetId());
		attributes.put("skillSetName", getSkillSetName());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long skillSetId = (Long)attributes.get("skillSetId");

		if (skillSetId != null) {
			setSkillSetId(skillSetId);
		}

		String skillSetName = (String)attributes.get("skillSetName");

		if (skillSetName != null) {
			setSkillSetName(skillSetName);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	 * Returns the create date of this skill set.
	 *
	 * @return the create date of this skill set
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this skill set.
	 *
	 * @return the group ID of this skill set
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this skill set.
	 *
	 * @return the modified date of this skill set
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this skill set.
	 *
	 * @return the primary key of this skill set
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the skill set ID of this skill set.
	 *
	 * @return the skill set ID of this skill set
	 */
	@Override
	public long getSkillSetId() {
		return model.getSkillSetId();
	}

	/**
	 * Returns the skill set name of this skill set.
	 *
	 * @return the skill set name of this skill set
	 */
	@Override
	public String getSkillSetName() {
		return model.getSkillSetName();
	}

	/**
	 * Returns the user ID of this skill set.
	 *
	 * @return the user ID of this skill set
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this skill set.
	 *
	 * @return the user uuid of this skill set
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this skill set.
	 *
	 * @return the uuid of this skill set
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the create date of this skill set.
	 *
	 * @param createDate the create date of this skill set
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this skill set.
	 *
	 * @param groupId the group ID of this skill set
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this skill set.
	 *
	 * @param modifiedDate the modified date of this skill set
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this skill set.
	 *
	 * @param primaryKey the primary key of this skill set
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the skill set ID of this skill set.
	 *
	 * @param skillSetId the skill set ID of this skill set
	 */
	@Override
	public void setSkillSetId(long skillSetId) {
		model.setSkillSetId(skillSetId);
	}

	/**
	 * Sets the skill set name of this skill set.
	 *
	 * @param skillSetName the skill set name of this skill set
	 */
	@Override
	public void setSkillSetName(String skillSetName) {
		model.setSkillSetName(skillSetName);
	}

	/**
	 * Sets the user ID of this skill set.
	 *
	 * @param userId the user ID of this skill set
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this skill set.
	 *
	 * @param userUuid the user uuid of this skill set
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this skill set.
	 *
	 * @param uuid the uuid of this skill set
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected SkillSetWrapper wrap(SkillSet skillSet) {
		return new SkillSetWrapper(skillSet);
	}

}