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
 * This class is a wrapper for {@link RequirementData}.
 * </p>
 *
 * @author Rakshansh
 * @see RequirementData
 * @generated
 */
@ProviderType
public class RequirementDataWrapper
	extends BaseModelWrapper<RequirementData>
	implements RequirementData, ModelWrapper<RequirementData> {

	public RequirementDataWrapper(RequirementData requirementData) {
		super(requirementData);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("requirementDataId", getRequirementDataId());
		attributes.put("skillSetId", getSkillSetId());
		attributes.put("experience", getExperience());
		attributes.put("jd", getJd());
		attributes.put("budget", getBudget());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());
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

		Long requirementDataId = (Long)attributes.get("requirementDataId");

		if (requirementDataId != null) {
			setRequirementDataId(requirementDataId);
		}

		String skillSetId = (String)attributes.get("skillSetId");

		if (skillSetId != null) {
			setSkillSetId(skillSetId);
		}

		Long experience = (Long)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		String jd = (String)attributes.get("jd");

		if (jd != null) {
			setJd(jd);
		}

		Long budget = (Long)attributes.get("budget");

		if (budget != null) {
			setBudget(budget);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	 * Returns the budget of this requirement data.
	 *
	 * @return the budget of this requirement data
	 */
	@Override
	public long getBudget() {
		return model.getBudget();
	}

	/**
	 * Returns the create date of this requirement data.
	 *
	 * @return the create date of this requirement data
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the experience of this requirement data.
	 *
	 * @return the experience of this requirement data
	 */
	@Override
	public long getExperience() {
		return model.getExperience();
	}

	/**
	 * Returns the group ID of this requirement data.
	 *
	 * @return the group ID of this requirement data
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jd of this requirement data.
	 *
	 * @return the jd of this requirement data
	 */
	@Override
	public String getJd() {
		return model.getJd();
	}

	/**
	 * Returns the modified date of this requirement data.
	 *
	 * @return the modified date of this requirement data
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this requirement data.
	 *
	 * @return the primary key of this requirement data
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this requirement data.
	 *
	 * @return the remarks of this requirement data
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the requirement data ID of this requirement data.
	 *
	 * @return the requirement data ID of this requirement data
	 */
	@Override
	public long getRequirementDataId() {
		return model.getRequirementDataId();
	}

	/**
	 * Returns the skill set ID of this requirement data.
	 *
	 * @return the skill set ID of this requirement data
	 */
	@Override
	public String getSkillSetId() {
		return model.getSkillSetId();
	}

	/**
	 * Returns the status of this requirement data.
	 *
	 * @return the status of this requirement data
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this requirement data.
	 *
	 * @return the user ID of this requirement data
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this requirement data.
	 *
	 * @return the user uuid of this requirement data
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this requirement data.
	 *
	 * @return the uuid of this requirement data
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
	 * Sets the budget of this requirement data.
	 *
	 * @param budget the budget of this requirement data
	 */
	@Override
	public void setBudget(long budget) {
		model.setBudget(budget);
	}

	/**
	 * Sets the create date of this requirement data.
	 *
	 * @param createDate the create date of this requirement data
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the experience of this requirement data.
	 *
	 * @param experience the experience of this requirement data
	 */
	@Override
	public void setExperience(long experience) {
		model.setExperience(experience);
	}

	/**
	 * Sets the group ID of this requirement data.
	 *
	 * @param groupId the group ID of this requirement data
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jd of this requirement data.
	 *
	 * @param jd the jd of this requirement data
	 */
	@Override
	public void setJd(String jd) {
		model.setJd(jd);
	}

	/**
	 * Sets the modified date of this requirement data.
	 *
	 * @param modifiedDate the modified date of this requirement data
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this requirement data.
	 *
	 * @param primaryKey the primary key of this requirement data
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this requirement data.
	 *
	 * @param remarks the remarks of this requirement data
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the requirement data ID of this requirement data.
	 *
	 * @param requirementDataId the requirement data ID of this requirement data
	 */
	@Override
	public void setRequirementDataId(long requirementDataId) {
		model.setRequirementDataId(requirementDataId);
	}

	/**
	 * Sets the skill set ID of this requirement data.
	 *
	 * @param skillSetId the skill set ID of this requirement data
	 */
	@Override
	public void setSkillSetId(String skillSetId) {
		model.setSkillSetId(skillSetId);
	}

	/**
	 * Sets the status of this requirement data.
	 *
	 * @param status the status of this requirement data
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this requirement data.
	 *
	 * @param userId the user ID of this requirement data
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this requirement data.
	 *
	 * @param userUuid the user uuid of this requirement data
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this requirement data.
	 *
	 * @param uuid the uuid of this requirement data
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected RequirementDataWrapper wrap(RequirementData requirementData) {
		return new RequirementDataWrapper(requirementData);
	}

}