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

package com.vietnamobile.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vietnamobile.model.VnmOnlintestReportEntry;
import com.vietnamobile.model.VnmOnlintestReportEntryModel;
import com.vietnamobile.model.VnmOnlintestReportEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VnmOnlintestReportEntry service. Represents a row in the &quot;iskools_VnmOnlintestReportEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vietnamobile.model.VnmOnlintestReportEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VnmOnlintestReportEntryImpl}.
 * </p>
 *
 * @author duymb
 * @see VnmOnlintestReportEntryImpl
 * @see com.vietnamobile.model.VnmOnlintestReportEntry
 * @see com.vietnamobile.model.VnmOnlintestReportEntryModel
 * @generated
 */
@JSON(strict = true)
public class VnmOnlintestReportEntryModelImpl extends BaseModelImpl<VnmOnlintestReportEntry>
	implements VnmOnlintestReportEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vnm onlintest report entry model instance should use the {@link com.vietnamobile.model.VnmOnlintestReportEntry} interface instead.
	 */
	public static final String TABLE_NAME = "iskools_VnmOnlintestReportEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "vnmOnlintestReportEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "onlinetestEntryId", Types.BIGINT },
			{ "questionEntryId", Types.BIGINT },
			{ "correctTime", Types.INTEGER },
			{ "wrongTime", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table iskools_VnmOnlintestReportEntry (vnmOnlintestReportEntryId LONG not null primary key,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,onlinetestEntryId LONG,questionEntryId LONG,correctTime INTEGER,wrongTime INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table iskools_VnmOnlintestReportEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY vnmOnlintestReportEntry.vnmOnlintestReportEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY iskools_VnmOnlintestReportEntry.vnmOnlintestReportEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vietnamobile.model.VnmOnlintestReportEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vietnamobile.model.VnmOnlintestReportEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VnmOnlintestReportEntry toModel(
		VnmOnlintestReportEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VnmOnlintestReportEntry model = new VnmOnlintestReportEntryImpl();

		model.setVnmOnlintestReportEntryId(soapModel.getVnmOnlintestReportEntryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setOnlinetestEntryId(soapModel.getOnlinetestEntryId());
		model.setQuestionEntryId(soapModel.getQuestionEntryId());
		model.setCorrectTime(soapModel.getCorrectTime());
		model.setWrongTime(soapModel.getWrongTime());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VnmOnlintestReportEntry> toModels(
		VnmOnlintestReportEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VnmOnlintestReportEntry> models = new ArrayList<VnmOnlintestReportEntry>(soapModels.length);

		for (VnmOnlintestReportEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vietnamobile.model.VnmOnlintestReportEntry"));

	public VnmOnlintestReportEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVnmOnlintestReportEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VnmOnlintestReportEntry.class;
	}

	@Override
	public String getModelClassName() {
		return VnmOnlintestReportEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vnmOnlintestReportEntryId",
			getVnmOnlintestReportEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("onlinetestEntryId", getOnlinetestEntryId());
		attributes.put("questionEntryId", getQuestionEntryId());
		attributes.put("correctTime", getCorrectTime());
		attributes.put("wrongTime", getWrongTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vnmOnlintestReportEntryId = (Long)attributes.get(
				"vnmOnlintestReportEntryId");

		if (vnmOnlintestReportEntryId != null) {
			setVnmOnlintestReportEntryId(vnmOnlintestReportEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long onlinetestEntryId = (Long)attributes.get("onlinetestEntryId");

		if (onlinetestEntryId != null) {
			setOnlinetestEntryId(onlinetestEntryId);
		}

		Long questionEntryId = (Long)attributes.get("questionEntryId");

		if (questionEntryId != null) {
			setQuestionEntryId(questionEntryId);
		}

		Integer correctTime = (Integer)attributes.get("correctTime");

		if (correctTime != null) {
			setCorrectTime(correctTime);
		}

		Integer wrongTime = (Integer)attributes.get("wrongTime");

		if (wrongTime != null) {
			setWrongTime(wrongTime);
		}
	}

	@JSON
	@Override
	public long getVnmOnlintestReportEntryId() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setVnmOnlintestReportEntryId(long vnmOnlintestReportEntryId) {
		_vnmOnlintestReportEntryId = vnmOnlintestReportEntryId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getOnlinetestEntryId() {
		return _onlinetestEntryId;
	}

	@Override
	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntryId = onlinetestEntryId;
	}

	@JSON
	@Override
	public long getQuestionEntryId() {
		return _questionEntryId;
	}

	@Override
	public void setQuestionEntryId(long questionEntryId) {
		_questionEntryId = questionEntryId;
	}

	@JSON
	@Override
	public int getCorrectTime() {
		return _correctTime;
	}

	@Override
	public void setCorrectTime(int correctTime) {
		_correctTime = correctTime;
	}

	@JSON
	@Override
	public int getWrongTime() {
		return _wrongTime;
	}

	@Override
	public void setWrongTime(int wrongTime) {
		_wrongTime = wrongTime;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			VnmOnlintestReportEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VnmOnlintestReportEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VnmOnlintestReportEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VnmOnlintestReportEntryImpl vnmOnlintestReportEntryImpl = new VnmOnlintestReportEntryImpl();

		vnmOnlintestReportEntryImpl.setVnmOnlintestReportEntryId(getVnmOnlintestReportEntryId());
		vnmOnlintestReportEntryImpl.setGroupId(getGroupId());
		vnmOnlintestReportEntryImpl.setCompanyId(getCompanyId());
		vnmOnlintestReportEntryImpl.setCreateDate(getCreateDate());
		vnmOnlintestReportEntryImpl.setModifiedDate(getModifiedDate());
		vnmOnlintestReportEntryImpl.setOnlinetestEntryId(getOnlinetestEntryId());
		vnmOnlintestReportEntryImpl.setQuestionEntryId(getQuestionEntryId());
		vnmOnlintestReportEntryImpl.setCorrectTime(getCorrectTime());
		vnmOnlintestReportEntryImpl.setWrongTime(getWrongTime());

		vnmOnlintestReportEntryImpl.resetOriginalValues();

		return vnmOnlintestReportEntryImpl;
	}

	@Override
	public int compareTo(VnmOnlintestReportEntry vnmOnlintestReportEntry) {
		long primaryKey = vnmOnlintestReportEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VnmOnlintestReportEntry)) {
			return false;
		}

		VnmOnlintestReportEntry vnmOnlintestReportEntry = (VnmOnlintestReportEntry)obj;

		long primaryKey = vnmOnlintestReportEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<VnmOnlintestReportEntry> toCacheModel() {
		VnmOnlintestReportEntryCacheModel vnmOnlintestReportEntryCacheModel = new VnmOnlintestReportEntryCacheModel();

		vnmOnlintestReportEntryCacheModel.vnmOnlintestReportEntryId = getVnmOnlintestReportEntryId();

		vnmOnlintestReportEntryCacheModel.groupId = getGroupId();

		vnmOnlintestReportEntryCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			vnmOnlintestReportEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			vnmOnlintestReportEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vnmOnlintestReportEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vnmOnlintestReportEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vnmOnlintestReportEntryCacheModel.onlinetestEntryId = getOnlinetestEntryId();

		vnmOnlintestReportEntryCacheModel.questionEntryId = getQuestionEntryId();

		vnmOnlintestReportEntryCacheModel.correctTime = getCorrectTime();

		vnmOnlintestReportEntryCacheModel.wrongTime = getWrongTime();

		return vnmOnlintestReportEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{vnmOnlintestReportEntryId=");
		sb.append(getVnmOnlintestReportEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", onlinetestEntryId=");
		sb.append(getOnlinetestEntryId());
		sb.append(", questionEntryId=");
		sb.append(getQuestionEntryId());
		sb.append(", correctTime=");
		sb.append(getCorrectTime());
		sb.append(", wrongTime=");
		sb.append(getWrongTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.VnmOnlintestReportEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vnmOnlintestReportEntryId</column-name><column-value><![CDATA[");
		sb.append(getVnmOnlintestReportEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onlinetestEntryId</column-name><column-value><![CDATA[");
		sb.append(getOnlinetestEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionEntryId</column-name><column-value><![CDATA[");
		sb.append(getQuestionEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correctTime</column-name><column-value><![CDATA[");
		sb.append(getCorrectTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wrongTime</column-name><column-value><![CDATA[");
		sb.append(getWrongTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VnmOnlintestReportEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			VnmOnlintestReportEntry.class
		};
	private long _vnmOnlintestReportEntryId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _onlinetestEntryId;
	private long _questionEntryId;
	private int _correctTime;
	private int _wrongTime;
	private VnmOnlintestReportEntry _escapedModel;
}