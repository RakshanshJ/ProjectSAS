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

import com.tcpl.sas.model.RequirementData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing RequirementData in entity cache.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class RequirementDataCacheModel
	implements CacheModel<RequirementData>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequirementDataCacheModel)) {
			return false;
		}

		RequirementDataCacheModel requirementDataCacheModel =
			(RequirementDataCacheModel)obj;

		if (requirementDataId == requirementDataCacheModel.requirementDataId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, requirementDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", requirementDataId=");
		sb.append(requirementDataId);
		sb.append(", skillSetId=");
		sb.append(skillSetId);
		sb.append(", experience=");
		sb.append(experience);
		sb.append(", jd=");
		sb.append(jd);
		sb.append(", budget=");
		sb.append(budget);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
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
	public RequirementData toEntityModel() {
		RequirementDataImpl requirementDataImpl = new RequirementDataImpl();

		if (uuid == null) {
			requirementDataImpl.setUuid("");
		}
		else {
			requirementDataImpl.setUuid(uuid);
		}

		requirementDataImpl.setRequirementDataId(requirementDataId);

		if (skillSetId == null) {
			requirementDataImpl.setSkillSetId("");
		}
		else {
			requirementDataImpl.setSkillSetId(skillSetId);
		}

		requirementDataImpl.setExperience(experience);

		if (jd == null) {
			requirementDataImpl.setJd("");
		}
		else {
			requirementDataImpl.setJd(jd);
		}

		requirementDataImpl.setBudget(budget);

		if (remarks == null) {
			requirementDataImpl.setRemarks("");
		}
		else {
			requirementDataImpl.setRemarks(remarks);
		}

		if (status == null) {
			requirementDataImpl.setStatus("");
		}
		else {
			requirementDataImpl.setStatus(status);
		}

		requirementDataImpl.setGroupId(groupId);
		requirementDataImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			requirementDataImpl.setCreateDate(null);
		}
		else {
			requirementDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			requirementDataImpl.setModifiedDate(null);
		}
		else {
			requirementDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		requirementDataImpl.resetOriginalValues();

		return requirementDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		requirementDataId = objectInput.readLong();
		skillSetId = objectInput.readUTF();

		experience = objectInput.readLong();
		jd = objectInput.readUTF();

		budget = objectInput.readLong();
		remarks = objectInput.readUTF();
		status = objectInput.readUTF();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(requirementDataId);

		if (skillSetId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(skillSetId);
		}

		objectOutput.writeLong(experience);

		if (jd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jd);
		}

		objectOutput.writeLong(budget);

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long requirementDataId;
	public String skillSetId;
	public long experience;
	public String jd;
	public long budget;
	public String remarks;
	public String status;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;

}