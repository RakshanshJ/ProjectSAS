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
 * This class is used by SOAP remote services, specifically {@link com.tcpl.sas.service.http.SourceVendorServiceSoap}.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class SourceVendorSoap implements Serializable {

	public static SourceVendorSoap toSoapModel(SourceVendor model) {
		SourceVendorSoap soapModel = new SourceVendorSoap();

		soapModel.setSourceVendorId(model.getSourceVendorId());
		soapModel.setEmpName(model.getEmpName());
		soapModel.setEmpEmail(model.getEmpEmail());
		soapModel.setEmpMobile(model.getEmpMobile());
		soapModel.setEmpDob(model.getEmpDob());
		soapModel.setEmpExperience(model.getEmpExperience());
		soapModel.setEmpLocation(model.getEmpLocation());
		soapModel.setCvId(model.getCvId());
		soapModel.setCvPath(model.getCvPath());
		soapModel.setStatusByCustomer(model.getStatusByCustomer());
		soapModel.setStatusByRM(model.getStatusByRM());
		soapModel.setDeployedOnCustomer(model.getDeployedOnCustomer());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static SourceVendorSoap[] toSoapModels(SourceVendor[] models) {
		SourceVendorSoap[] soapModels = new SourceVendorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SourceVendorSoap[][] toSoapModels(SourceVendor[][] models) {
		SourceVendorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SourceVendorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SourceVendorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SourceVendorSoap[] toSoapModels(List<SourceVendor> models) {
		List<SourceVendorSoap> soapModels = new ArrayList<SourceVendorSoap>(
			models.size());

		for (SourceVendor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SourceVendorSoap[soapModels.size()]);
	}

	public SourceVendorSoap() {
	}

	public long getPrimaryKey() {
		return _sourceVendorId;
	}

	public void setPrimaryKey(long pk) {
		setSourceVendorId(pk);
	}

	public long getSourceVendorId() {
		return _sourceVendorId;
	}

	public void setSourceVendorId(long sourceVendorId) {
		_sourceVendorId = sourceVendorId;
	}

	public String getEmpName() {
		return _empName;
	}

	public void setEmpName(String empName) {
		_empName = empName;
	}

	public String getEmpEmail() {
		return _empEmail;
	}

	public void setEmpEmail(String empEmail) {
		_empEmail = empEmail;
	}

	public String getEmpMobile() {
		return _empMobile;
	}

	public void setEmpMobile(String empMobile) {
		_empMobile = empMobile;
	}

	public Date getEmpDob() {
		return _empDob;
	}

	public void setEmpDob(Date empDob) {
		_empDob = empDob;
	}

	public long getEmpExperience() {
		return _empExperience;
	}

	public void setEmpExperience(long empExperience) {
		_empExperience = empExperience;
	}

	public String getEmpLocation() {
		return _empLocation;
	}

	public void setEmpLocation(String empLocation) {
		_empLocation = empLocation;
	}

	public long getCvId() {
		return _cvId;
	}

	public void setCvId(long cvId) {
		_cvId = cvId;
	}

	public String getCvPath() {
		return _cvPath;
	}

	public void setCvPath(String cvPath) {
		_cvPath = cvPath;
	}

	public String getStatusByCustomer() {
		return _statusByCustomer;
	}

	public void setStatusByCustomer(String statusByCustomer) {
		_statusByCustomer = statusByCustomer;
	}

	public Boolean getStatusByRM() {
		return _statusByRM;
	}

	public void setStatusByRM(Boolean statusByRM) {
		_statusByRM = statusByRM;
	}

	public Boolean getDeployedOnCustomer() {
		return _deployedOnCustomer;
	}

	public void setDeployedOnCustomer(Boolean deployedOnCustomer) {
		_deployedOnCustomer = deployedOnCustomer;
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

	private long _sourceVendorId;
	private String _empName;
	private String _empEmail;
	private String _empMobile;
	private Date _empDob;
	private long _empExperience;
	private String _empLocation;
	private long _cvId;
	private String _cvPath;
	private String _statusByCustomer;
	private Boolean _statusByRM;
	private Boolean _deployedOnCustomer;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;

}