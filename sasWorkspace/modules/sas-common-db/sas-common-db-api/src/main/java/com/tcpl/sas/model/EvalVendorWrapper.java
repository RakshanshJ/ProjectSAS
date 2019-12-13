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
 * This class is a wrapper for {@link EvalVendor}.
 * </p>
 *
 * @author Rakshansh
 * @see EvalVendor
 * @generated
 */
@ProviderType
public class EvalVendorWrapper
	extends BaseModelWrapper<EvalVendor>
	implements EvalVendor, ModelWrapper<EvalVendor> {

	public EvalVendorWrapper(EvalVendor evalVendor) {
		super(evalVendor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evalVendorId", getEvalVendorId());
		attributes.put("empName", getEmpName());
		attributes.put("empEmail", getEmpEmail());
		attributes.put("audioId", getAudioId());
		attributes.put("audioPath", getAudioPath());
		attributes.put("videoId", getVideoId());
		attributes.put("videoPath", getVideoPath());
		attributes.put("imageId", getImageId());
		attributes.put("imagePath", getImagePath());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evalVendorId = (Long)attributes.get("evalVendorId");

		if (evalVendorId != null) {
			setEvalVendorId(evalVendorId);
		}

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String empEmail = (String)attributes.get("empEmail");

		if (empEmail != null) {
			setEmpEmail(empEmail);
		}

		Long audioId = (Long)attributes.get("audioId");

		if (audioId != null) {
			setAudioId(audioId);
		}

		String audioPath = (String)attributes.get("audioPath");

		if (audioPath != null) {
			setAudioPath(audioPath);
		}

		Long videoId = (Long)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		String videoPath = (String)attributes.get("videoPath");

		if (videoPath != null) {
			setVideoPath(videoPath);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		String imagePath = (String)attributes.get("imagePath");

		if (imagePath != null) {
			setImagePath(imagePath);
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
	 * Returns the audio ID of this eval vendor.
	 *
	 * @return the audio ID of this eval vendor
	 */
	@Override
	public long getAudioId() {
		return model.getAudioId();
	}

	/**
	 * Returns the audio path of this eval vendor.
	 *
	 * @return the audio path of this eval vendor
	 */
	@Override
	public String getAudioPath() {
		return model.getAudioPath();
	}

	/**
	 * Returns the create date of this eval vendor.
	 *
	 * @return the create date of this eval vendor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the emp email of this eval vendor.
	 *
	 * @return the emp email of this eval vendor
	 */
	@Override
	public String getEmpEmail() {
		return model.getEmpEmail();
	}

	/**
	 * Returns the emp name of this eval vendor.
	 *
	 * @return the emp name of this eval vendor
	 */
	@Override
	public String getEmpName() {
		return model.getEmpName();
	}

	/**
	 * Returns the eval vendor ID of this eval vendor.
	 *
	 * @return the eval vendor ID of this eval vendor
	 */
	@Override
	public long getEvalVendorId() {
		return model.getEvalVendorId();
	}

	/**
	 * Returns the group ID of this eval vendor.
	 *
	 * @return the group ID of this eval vendor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the image ID of this eval vendor.
	 *
	 * @return the image ID of this eval vendor
	 */
	@Override
	public long getImageId() {
		return model.getImageId();
	}

	/**
	 * Returns the image path of this eval vendor.
	 *
	 * @return the image path of this eval vendor
	 */
	@Override
	public String getImagePath() {
		return model.getImagePath();
	}

	/**
	 * Returns the modified date of this eval vendor.
	 *
	 * @return the modified date of this eval vendor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this eval vendor.
	 *
	 * @return the primary key of this eval vendor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this eval vendor.
	 *
	 * @return the user ID of this eval vendor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this eval vendor.
	 *
	 * @return the user uuid of this eval vendor
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the video ID of this eval vendor.
	 *
	 * @return the video ID of this eval vendor
	 */
	@Override
	public long getVideoId() {
		return model.getVideoId();
	}

	/**
	 * Returns the video path of this eval vendor.
	 *
	 * @return the video path of this eval vendor
	 */
	@Override
	public String getVideoPath() {
		return model.getVideoPath();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the audio ID of this eval vendor.
	 *
	 * @param audioId the audio ID of this eval vendor
	 */
	@Override
	public void setAudioId(long audioId) {
		model.setAudioId(audioId);
	}

	/**
	 * Sets the audio path of this eval vendor.
	 *
	 * @param audioPath the audio path of this eval vendor
	 */
	@Override
	public void setAudioPath(String audioPath) {
		model.setAudioPath(audioPath);
	}

	/**
	 * Sets the create date of this eval vendor.
	 *
	 * @param createDate the create date of this eval vendor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the emp email of this eval vendor.
	 *
	 * @param empEmail the emp email of this eval vendor
	 */
	@Override
	public void setEmpEmail(String empEmail) {
		model.setEmpEmail(empEmail);
	}

	/**
	 * Sets the emp name of this eval vendor.
	 *
	 * @param empName the emp name of this eval vendor
	 */
	@Override
	public void setEmpName(String empName) {
		model.setEmpName(empName);
	}

	/**
	 * Sets the eval vendor ID of this eval vendor.
	 *
	 * @param evalVendorId the eval vendor ID of this eval vendor
	 */
	@Override
	public void setEvalVendorId(long evalVendorId) {
		model.setEvalVendorId(evalVendorId);
	}

	/**
	 * Sets the group ID of this eval vendor.
	 *
	 * @param groupId the group ID of this eval vendor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the image ID of this eval vendor.
	 *
	 * @param imageId the image ID of this eval vendor
	 */
	@Override
	public void setImageId(long imageId) {
		model.setImageId(imageId);
	}

	/**
	 * Sets the image path of this eval vendor.
	 *
	 * @param imagePath the image path of this eval vendor
	 */
	@Override
	public void setImagePath(String imagePath) {
		model.setImagePath(imagePath);
	}

	/**
	 * Sets the modified date of this eval vendor.
	 *
	 * @param modifiedDate the modified date of this eval vendor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this eval vendor.
	 *
	 * @param primaryKey the primary key of this eval vendor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this eval vendor.
	 *
	 * @param userId the user ID of this eval vendor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this eval vendor.
	 *
	 * @param userUuid the user uuid of this eval vendor
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the video ID of this eval vendor.
	 *
	 * @param videoId the video ID of this eval vendor
	 */
	@Override
	public void setVideoId(long videoId) {
		model.setVideoId(videoId);
	}

	/**
	 * Sets the video path of this eval vendor.
	 *
	 * @param videoPath the video path of this eval vendor
	 */
	@Override
	public void setVideoPath(String videoPath) {
		model.setVideoPath(videoPath);
	}

	@Override
	protected EvalVendorWrapper wrap(EvalVendor evalVendor) {
		return new EvalVendorWrapper(evalVendor);
	}

}