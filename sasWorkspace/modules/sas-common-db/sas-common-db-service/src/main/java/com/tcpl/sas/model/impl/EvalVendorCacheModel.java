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

import com.tcpl.sas.model.EvalVendor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing EvalVendor in entity cache.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class EvalVendorCacheModel
	implements CacheModel<EvalVendor>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EvalVendorCacheModel)) {
			return false;
		}

		EvalVendorCacheModel evalVendorCacheModel = (EvalVendorCacheModel)obj;

		if (evalVendorId == evalVendorCacheModel.evalVendorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, evalVendorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{evalVendorId=");
		sb.append(evalVendorId);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", empEmail=");
		sb.append(empEmail);
		sb.append(", audioId=");
		sb.append(audioId);
		sb.append(", audioPath=");
		sb.append(audioPath);
		sb.append(", videoId=");
		sb.append(videoId);
		sb.append(", videoPath=");
		sb.append(videoPath);
		sb.append(", imageId=");
		sb.append(imageId);
		sb.append(", imagePath=");
		sb.append(imagePath);
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
	public EvalVendor toEntityModel() {
		EvalVendorImpl evalVendorImpl = new EvalVendorImpl();

		evalVendorImpl.setEvalVendorId(evalVendorId);

		if (empName == null) {
			evalVendorImpl.setEmpName("");
		}
		else {
			evalVendorImpl.setEmpName(empName);
		}

		if (empEmail == null) {
			evalVendorImpl.setEmpEmail("");
		}
		else {
			evalVendorImpl.setEmpEmail(empEmail);
		}

		evalVendorImpl.setAudioId(audioId);

		if (audioPath == null) {
			evalVendorImpl.setAudioPath("");
		}
		else {
			evalVendorImpl.setAudioPath(audioPath);
		}

		evalVendorImpl.setVideoId(videoId);

		if (videoPath == null) {
			evalVendorImpl.setVideoPath("");
		}
		else {
			evalVendorImpl.setVideoPath(videoPath);
		}

		evalVendorImpl.setImageId(imageId);

		if (imagePath == null) {
			evalVendorImpl.setImagePath("");
		}
		else {
			evalVendorImpl.setImagePath(imagePath);
		}

		evalVendorImpl.setGroupId(groupId);
		evalVendorImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			evalVendorImpl.setCreateDate(null);
		}
		else {
			evalVendorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			evalVendorImpl.setModifiedDate(null);
		}
		else {
			evalVendorImpl.setModifiedDate(new Date(modifiedDate));
		}

		evalVendorImpl.resetOriginalValues();

		return evalVendorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		evalVendorId = objectInput.readLong();
		empName = objectInput.readUTF();
		empEmail = objectInput.readUTF();

		audioId = objectInput.readLong();
		audioPath = objectInput.readUTF();

		videoId = objectInput.readLong();
		videoPath = objectInput.readUTF();

		imageId = objectInput.readLong();
		imagePath = objectInput.readUTF();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(evalVendorId);

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

		objectOutput.writeLong(audioId);

		if (audioPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(audioPath);
		}

		objectOutput.writeLong(videoId);

		if (videoPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(videoPath);
		}

		objectOutput.writeLong(imageId);

		if (imagePath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imagePath);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long evalVendorId;
	public String empName;
	public String empEmail;
	public long audioId;
	public String audioPath;
	public long videoId;
	public String videoPath;
	public long imageId;
	public String imagePath;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;

}