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

import com.tcpl.sas.model.SkillSet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing SkillSet in entity cache.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class SkillSetCacheModel
	implements CacheModel<SkillSet>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SkillSetCacheModel)) {
			return false;
		}

		SkillSetCacheModel skillSetCacheModel = (SkillSetCacheModel)obj;

		if (skillSetId == skillSetCacheModel.skillSetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, skillSetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", skillSetId=");
		sb.append(skillSetId);
		sb.append(", skillSetName=");
		sb.append(skillSetName);
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
	public SkillSet toEntityModel() {
		SkillSetImpl skillSetImpl = new SkillSetImpl();

		if (uuid == null) {
			skillSetImpl.setUuid("");
		}
		else {
			skillSetImpl.setUuid(uuid);
		}

		skillSetImpl.setSkillSetId(skillSetId);

		if (skillSetName == null) {
			skillSetImpl.setSkillSetName("");
		}
		else {
			skillSetImpl.setSkillSetName(skillSetName);
		}

		skillSetImpl.setGroupId(groupId);
		skillSetImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			skillSetImpl.setCreateDate(null);
		}
		else {
			skillSetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			skillSetImpl.setModifiedDate(null);
		}
		else {
			skillSetImpl.setModifiedDate(new Date(modifiedDate));
		}

		skillSetImpl.resetOriginalValues();

		return skillSetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		skillSetId = objectInput.readLong();
		skillSetName = objectInput.readUTF();

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

		objectOutput.writeLong(skillSetId);

		if (skillSetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(skillSetName);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long skillSetId;
	public String skillSetName;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;

}