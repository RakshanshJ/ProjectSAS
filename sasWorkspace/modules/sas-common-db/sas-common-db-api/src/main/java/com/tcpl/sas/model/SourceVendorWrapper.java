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
 * This class is a wrapper for {@link SourceVendor}.
 * </p>
 *
 * @author Rakshansh
 * @see SourceVendor
 * @generated
 */
@ProviderType
public class SourceVendorWrapper
	extends BaseModelWrapper<SourceVendor>
	implements SourceVendor, ModelWrapper<SourceVendor> {

	public SourceVendorWrapper(SourceVendor sourceVendor) {
		super(sourceVendor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sourceVendorId", getSourceVendorId());
		attributes.put("empName", getEmpName());
		attributes.put("empEmail", getEmpEmail());
		attributes.put("empMobile", getEmpMobile());
		attributes.put("empDob", getEmpDob());
		attributes.put("empExperience", getEmpExperience());
		attributes.put("empLocation", getEmpLocation());
		attributes.put("cvId", getCvId());
		attributes.put("cvPath", getCvPath());
		attributes.put("statusByCustomer", getStatusByCustomer());
		attributes.put("statusByRM", getStatusByRM());
		attributes.put("deployedOnCustomer", getDeployedOnCustomer());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sourceVendorId = (Long)attributes.get("sourceVendorId");

		if (sourceVendorId != null) {
			setSourceVendorId(sourceVendorId);
		}

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String empEmail = (String)attributes.get("empEmail");

		if (empEmail != null) {
			setEmpEmail(empEmail);
		}

		String empMobile = (String)attributes.get("empMobile");

		if (empMobile != null) {
			setEmpMobile(empMobile);
		}

		Date empDob = (Date)attributes.get("empDob");

		if (empDob != null) {
			setEmpDob(empDob);
		}

		Long empExperience = (Long)attributes.get("empExperience");

		if (empExperience != null) {
			setEmpExperience(empExperience);
		}

		String empLocation = (String)attributes.get("empLocation");

		if (empLocation != null) {
			setEmpLocation(empLocation);
		}

		Long cvId = (Long)attributes.get("cvId");

		if (cvId != null) {
			setCvId(cvId);
		}

		String cvPath = (String)attributes.get("cvPath");

		if (cvPath != null) {
			setCvPath(cvPath);
		}

		String statusByCustomer = (String)attributes.get("statusByCustomer");

		if (statusByCustomer != null) {
			setStatusByCustomer(statusByCustomer);
		}

		Boolean statusByRM = (Boolean)attributes.get("statusByRM");

		if (statusByRM != null) {
			setStatusByRM(statusByRM);
		}

		Boolean deployedOnCustomer = (Boolean)attributes.get(
			"deployedOnCustomer");

		if (deployedOnCustomer != null) {
			setDeployedOnCustomer(deployedOnCustomer);
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
	 * Returns the create date of this source vendor.
	 *
	 * @return the create date of this source vendor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the cv ID of this source vendor.
	 *
	 * @return the cv ID of this source vendor
	 */
	@Override
	public long getCvId() {
		return model.getCvId();
	}

	/**
	 * Returns the cv path of this source vendor.
	 *
	 * @return the cv path of this source vendor
	 */
	@Override
	public String getCvPath() {
		return model.getCvPath();
	}

	/**
	 * Returns the deployed on customer of this source vendor.
	 *
	 * @return the deployed on customer of this source vendor
	 */
	@Override
	public Boolean getDeployedOnCustomer() {
		return model.getDeployedOnCustomer();
	}

	/**
	 * Returns the emp dob of this source vendor.
	 *
	 * @return the emp dob of this source vendor
	 */
	@Override
	public Date getEmpDob() {
		return model.getEmpDob();
	}

	/**
	 * Returns the emp email of this source vendor.
	 *
	 * @return the emp email of this source vendor
	 */
	@Override
	public String getEmpEmail() {
		return model.getEmpEmail();
	}

	/**
	 * Returns the emp experience of this source vendor.
	 *
	 * @return the emp experience of this source vendor
	 */
	@Override
	public long getEmpExperience() {
		return model.getEmpExperience();
	}

	/**
	 * Returns the emp location of this source vendor.
	 *
	 * @return the emp location of this source vendor
	 */
	@Override
	public String getEmpLocation() {
		return model.getEmpLocation();
	}

	/**
	 * Returns the emp mobile of this source vendor.
	 *
	 * @return the emp mobile of this source vendor
	 */
	@Override
	public String getEmpMobile() {
		return model.getEmpMobile();
	}

	/**
	 * Returns the emp name of this source vendor.
	 *
	 * @return the emp name of this source vendor
	 */
	@Override
	public String getEmpName() {
		return model.getEmpName();
	}

	/**
	 * Returns the group ID of this source vendor.
	 *
	 * @return the group ID of this source vendor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this source vendor.
	 *
	 * @return the modified date of this source vendor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this source vendor.
	 *
	 * @return the primary key of this source vendor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the source vendor ID of this source vendor.
	 *
	 * @return the source vendor ID of this source vendor
	 */
	@Override
	public long getSourceVendorId() {
		return model.getSourceVendorId();
	}

	/**
	 * Returns the status by customer of this source vendor.
	 *
	 * @return the status by customer of this source vendor
	 */
	@Override
	public String getStatusByCustomer() {
		return model.getStatusByCustomer();
	}

	/**
	 * Returns the status by rm of this source vendor.
	 *
	 * @return the status by rm of this source vendor
	 */
	@Override
	public Boolean getStatusByRM() {
		return model.getStatusByRM();
	}

	/**
	 * Returns the user ID of this source vendor.
	 *
	 * @return the user ID of this source vendor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this source vendor.
	 *
	 * @return the user uuid of this source vendor
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the create date of this source vendor.
	 *
	 * @param createDate the create date of this source vendor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the cv ID of this source vendor.
	 *
	 * @param cvId the cv ID of this source vendor
	 */
	@Override
	public void setCvId(long cvId) {
		model.setCvId(cvId);
	}

	/**
	 * Sets the cv path of this source vendor.
	 *
	 * @param cvPath the cv path of this source vendor
	 */
	@Override
	public void setCvPath(String cvPath) {
		model.setCvPath(cvPath);
	}

	/**
	 * Sets the deployed on customer of this source vendor.
	 *
	 * @param deployedOnCustomer the deployed on customer of this source vendor
	 */
	@Override
	public void setDeployedOnCustomer(Boolean deployedOnCustomer) {
		model.setDeployedOnCustomer(deployedOnCustomer);
	}

	/**
	 * Sets the emp dob of this source vendor.
	 *
	 * @param empDob the emp dob of this source vendor
	 */
	@Override
	public void setEmpDob(Date empDob) {
		model.setEmpDob(empDob);
	}

	/**
	 * Sets the emp email of this source vendor.
	 *
	 * @param empEmail the emp email of this source vendor
	 */
	@Override
	public void setEmpEmail(String empEmail) {
		model.setEmpEmail(empEmail);
	}

	/**
	 * Sets the emp experience of this source vendor.
	 *
	 * @param empExperience the emp experience of this source vendor
	 */
	@Override
	public void setEmpExperience(long empExperience) {
		model.setEmpExperience(empExperience);
	}

	/**
	 * Sets the emp location of this source vendor.
	 *
	 * @param empLocation the emp location of this source vendor
	 */
	@Override
	public void setEmpLocation(String empLocation) {
		model.setEmpLocation(empLocation);
	}

	/**
	 * Sets the emp mobile of this source vendor.
	 *
	 * @param empMobile the emp mobile of this source vendor
	 */
	@Override
	public void setEmpMobile(String empMobile) {
		model.setEmpMobile(empMobile);
	}

	/**
	 * Sets the emp name of this source vendor.
	 *
	 * @param empName the emp name of this source vendor
	 */
	@Override
	public void setEmpName(String empName) {
		model.setEmpName(empName);
	}

	/**
	 * Sets the group ID of this source vendor.
	 *
	 * @param groupId the group ID of this source vendor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this source vendor.
	 *
	 * @param modifiedDate the modified date of this source vendor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this source vendor.
	 *
	 * @param primaryKey the primary key of this source vendor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the source vendor ID of this source vendor.
	 *
	 * @param sourceVendorId the source vendor ID of this source vendor
	 */
	@Override
	public void setSourceVendorId(long sourceVendorId) {
		model.setSourceVendorId(sourceVendorId);
	}

	/**
	 * Sets the status by customer of this source vendor.
	 *
	 * @param statusByCustomer the status by customer of this source vendor
	 */
	@Override
	public void setStatusByCustomer(String statusByCustomer) {
		model.setStatusByCustomer(statusByCustomer);
	}

	/**
	 * Sets the status by rm of this source vendor.
	 *
	 * @param statusByRM the status by rm of this source vendor
	 */
	@Override
	public void setStatusByRM(Boolean statusByRM) {
		model.setStatusByRM(statusByRM);
	}

	/**
	 * Sets the user ID of this source vendor.
	 *
	 * @param userId the user ID of this source vendor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this source vendor.
	 *
	 * @param userUuid the user uuid of this source vendor
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected SourceVendorWrapper wrap(SourceVendor sourceVendor) {
		return new SourceVendorWrapper(sourceVendor);
	}

}