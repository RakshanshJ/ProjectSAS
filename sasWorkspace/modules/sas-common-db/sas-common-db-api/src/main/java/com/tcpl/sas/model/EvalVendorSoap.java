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
 * This class is used by SOAP remote services, specifically {@link com.tcpl.sas.service.http.EvalVendorServiceSoap}.
 *
 * @author Rakshansh
 * @generated
 */
@ProviderType
public class EvalVendorSoap implements Serializable {

	public static EvalVendorSoap toSoapModel(EvalVendor model) {
		EvalVendorSoap soapModel = new EvalVendorSoap();

		soapModel.setEvalVendorId(model.getEvalVendorId());
		soapModel.setEmpName(model.getEmpName());
		soapModel.setEmpEmail(model.getEmpEmail());
		soapModel.setAudioId(model.getAudioId());
		soapModel.setAudioPath(model.getAudioPath());
		soapModel.setVideoId(model.getVideoId());
		soapModel.setVideoPath(model.getVideoPath());
		soapModel.setImageId(model.getImageId());
		soapModel.setImagePath(model.getImagePath());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static EvalVendorSoap[] toSoapModels(EvalVendor[] models) {
		EvalVendorSoap[] soapModels = new EvalVendorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EvalVendorSoap[][] toSoapModels(EvalVendor[][] models) {
		EvalVendorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EvalVendorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EvalVendorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EvalVendorSoap[] toSoapModels(List<EvalVendor> models) {
		List<EvalVendorSoap> soapModels = new ArrayList<EvalVendorSoap>(
			models.size());

		for (EvalVendor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EvalVendorSoap[soapModels.size()]);
	}

	public EvalVendorSoap() {
	}

	public long getPrimaryKey() {
		return _evalVendorId;
	}

	public void setPrimaryKey(long pk) {
		setEvalVendorId(pk);
	}

	public long getEvalVendorId() {
		return _evalVendorId;
	}

	public void setEvalVendorId(long evalVendorId) {
		_evalVendorId = evalVendorId;
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

	public long getAudioId() {
		return _audioId;
	}

	public void setAudioId(long audioId) {
		_audioId = audioId;
	}

	public String getAudioPath() {
		return _audioPath;
	}

	public void setAudioPath(String audioPath) {
		_audioPath = audioPath;
	}

	public long getVideoId() {
		return _videoId;
	}

	public void setVideoId(long videoId) {
		_videoId = videoId;
	}

	public String getVideoPath() {
		return _videoPath;
	}

	public void setVideoPath(String videoPath) {
		_videoPath = videoPath;
	}

	public long getImageId() {
		return _imageId;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public String getImagePath() {
		return _imagePath;
	}

	public void setImagePath(String imagePath) {
		_imagePath = imagePath;
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

	private long _evalVendorId;
	private String _empName;
	private String _empEmail;
	private long _audioId;
	private String _audioPath;
	private long _videoId;
	private String _videoPath;
	private long _imageId;
	private String _imagePath;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;

}