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
 * This class is used by SOAP remote services, specifically {@link com.tcpl.sas.service.http.SkillSetServiceSoap}.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class SkillSetSoap implements Serializable {

	public static SkillSetSoap toSoapModel(SkillSet model) {
		SkillSetSoap soapModel = new SkillSetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSkillSetId(model.getSkillSetId());
		soapModel.setSkillSetName(model.getSkillSetName());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static SkillSetSoap[] toSoapModels(SkillSet[] models) {
		SkillSetSoap[] soapModels = new SkillSetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SkillSetSoap[][] toSoapModels(SkillSet[][] models) {
		SkillSetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SkillSetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SkillSetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SkillSetSoap[] toSoapModels(List<SkillSet> models) {
		List<SkillSetSoap> soapModels = new ArrayList<SkillSetSoap>(
			models.size());

		for (SkillSet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SkillSetSoap[soapModels.size()]);
	}

	public SkillSetSoap() {
	}

	public long getPrimaryKey() {
		return _skillSetId;
	}

	public void setPrimaryKey(long pk) {
		setSkillSetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSkillSetId() {
		return _skillSetId;
	}

	public void setSkillSetId(long skillSetId) {
		_skillSetId = skillSetId;
	}

	public String getSkillSetName() {
		return _skillSetName;
	}

	public void setSkillSetName(String skillSetName) {
		_skillSetName = skillSetName;
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
	private long _skillSetId;
	private String _skillSetName;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;

}