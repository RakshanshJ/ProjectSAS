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

package com.tcpl.sas.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.tcpl.sas.model.SourceVendor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing SourceVendor in entity cache.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class SourceVendorCacheModel
	implements CacheModel<SourceVendor>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SourceVendorCacheModel)) {
			return false;
		}

		SourceVendorCacheModel sourceVendorCacheModel =
			(SourceVendorCacheModel)obj;

		if (sourceVendorId == sourceVendorCacheModel.sourceVendorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sourceVendorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{sourceVendorId=");
		sb.append(sourceVendorId);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", empEmail=");
		sb.append(empEmail);
		sb.append(", empMobile=");
		sb.append(empMobile);
		sb.append(", empDob=");
		sb.append(empDob);
		sb.append(", empExperience=");
		sb.append(empExperience);
		sb.append(", empLocation=");
		sb.append(empLocation);
		sb.append(", cvId=");
		sb.append(cvId);
		sb.append(", cvPath=");
		sb.append(cvPath);
		sb.append(", statusByCustomer=");
		sb.append(statusByCustomer);
		sb.append(", statusByRM=");
		sb.append(statusByRM);
		sb.append(", deployedOnCustomer=");
		sb.append(deployedOnCustomer);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SourceVendor toEntityModel() {
		SourceVendorImpl sourceVendorImpl = new SourceVendorImpl();

		sourceVendorImpl.setSourceVendorId(sourceVendorId);

		if (empName == null) {
			sourceVendorImpl.setEmpName("");
		}
		else {
			sourceVendorImpl.setEmpName(empName);
		}

		if (empEmail == null) {
			sourceVendorImpl.setEmpEmail("");
		}
		else {
			sourceVendorImpl.setEmpEmail(empEmail);
		}

		if (empMobile == null) {
			sourceVendorImpl.setEmpMobile("");
		}
		else {
			sourceVendorImpl.setEmpMobile(empMobile);
		}

		if (empDob == Long.MIN_VALUE) {
			sourceVendorImpl.setEmpDob(null);
		}
		else {
			sourceVendorImpl.setEmpDob(new Date(empDob));
		}

		sourceVendorImpl.setEmpExperience(empExperience);

		if (empLocation == null) {
			sourceVendorImpl.setEmpLocation("");
		}
		else {
			sourceVendorImpl.setEmpLocation(empLocation);
		}

		sourceVendorImpl.setCvId(cvId);

		if (cvPath == null) {
			sourceVendorImpl.setCvPath("");
		}
		else {
			sourceVendorImpl.setCvPath(cvPath);
		}

		if (statusByCustomer == null) {
			sourceVendorImpl.setStatusByCustomer("");
		}
		else {
			sourceVendorImpl.setStatusByCustomer(statusByCustomer);
		}

		sourceVendorImpl.setStatusByRM(statusByRM);
		sourceVendorImpl.setDeployedOnCustomer(deployedOnCustomer);
		sourceVendorImpl.setGroupId(groupId);
		sourceVendorImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			sourceVendorImpl.setCreateDate(null);
		}
		else {
			sourceVendorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sourceVendorImpl.setModifiedDate(null);
		}
		else {
			sourceVendorImpl.setModifiedDate(new Date(modifiedDate));
		}

		sourceVendorImpl.resetOriginalValues();

		return sourceVendorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sourceVendorId = objectInput.readLong();
		empName = objectInput.readUTF();
		empEmail = objectInput.readUTF();
		empMobile = objectInput.readUTF();
		empDob = objectInput.readLong();

		empExperience = objectInput.readLong();
		empLocation = objectInput.readUTF();

		cvId = objectInput.readLong();
		cvPath = objectInput.readUTF();
		statusByCustomer = objectInput.readUTF();

		statusByRM = objectInput.readBoolean();

		deployedOnCustomer = objectInput.readBoolean();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sourceVendorId);

		if (empName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empName);
		}

		if (empEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empEmail);
		}

		if (empMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empMobile);
		}

		objectOutput.writeLong(empDob);

		objectOutput.writeLong(empExperience);

		if (empLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empLocation);
		}

		objectOutput.writeLong(cvId);

		if (cvPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cvPath);
		}

		if (statusByCustomer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByCustomer);
		}

		objectOutput.writeBoolean(statusByRM);

		objectOutput.writeBoolean(deployedOnCustomer);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long sourceVendorId;
	public String empName;
	public String empEmail;
	public String empMobile;
	public long empDob;
	public long empExperience;
	public String empLocation;
	public long cvId;
	public String cvPath;
	public String statusByCustomer;
	public boolean statusByRM;
	public boolean deployedOnCustomer;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;

}