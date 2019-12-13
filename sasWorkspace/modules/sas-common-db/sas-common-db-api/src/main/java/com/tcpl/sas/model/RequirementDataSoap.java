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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.tcpl.sas.service.http.RequirementDataServiceSoap}.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class RequirementDataSoap implements Serializable {

	public static RequirementDataSoap toSoapModel(RequirementData model) {
		RequirementDataSoap soapModel = new RequirementDataSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRequirementDataId(model.getRequirementDataId());
		soapModel.setSkillSetId(model.getSkillSetId());
		soapModel.setExperience(model.getExperience());
		soapModel.setJd(model.getJd());
		soapModel.setBudget(model.getBudget());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setStatus(model.getStatus());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static RequirementDataSoap[] toSoapModels(RequirementData[] models) {
		RequirementDataSoap[] soapModels =
			new RequirementDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RequirementDataSoap[][] toSoapModels(
		RequirementData[][] models) {

		RequirementDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RequirementDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RequirementDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RequirementDataSoap[] toSoapModels(
		List<RequirementData> models) {

		List<RequirementDataSoap> soapModels =
			new ArrayList<RequirementDataSoap>(models.size());

		for (RequirementData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RequirementDataSoap[soapModels.size()]);
	}

	public RequirementDataSoap() {
	}

	public long getPrimaryKey() {
		return _requirementDataId;
	}

	public void setPrimaryKey(long pk) {
		setRequirementDataId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRequirementDataId() {
		return _requirementDataId;
	}

	public void setRequirementDataId(long requirementDataId) {
		_requirementDataId = requirementDataId;
	}

	public String getSkillSetId() {
		return _skillSetId;
	}

	public void setSkillSetId(String skillSetId) {
		_skillSetId = skillSetId;
	}

	public long getExperience() {
		return _experience;
	}

	public void setExperience(long experience) {
		_experience = experience;
	}

	public String getJd() {
		return _jd;
	}

	public void setJd(String jd) {
		_jd = jd;
	}

	public long getBudget() {
		return _budget;
	}

	public void setBudget(long budget) {
		_budget = budget;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _requirementDataId;
	private String _skillSetId;
	private long _experience;
	private String _jd;
	private long _budget;
	private String _remarks;
	private String _status;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;

}