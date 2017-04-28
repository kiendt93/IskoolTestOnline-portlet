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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vietnamobile.model.SubjectEntry;
import com.vietnamobile.model.SubjectEntryModel;
import com.vietnamobile.model.SubjectEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SubjectEntry service. Represents a row in the &quot;iskools_SubjectEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vietnamobile.model.SubjectEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubjectEntryImpl}.
 * </p>
 *
 * @author duymb
 * @see SubjectEntryImpl
 * @see com.vietnamobile.model.SubjectEntry
 * @see com.vietnamobile.model.SubjectEntryModel
 * @generated
 */
@JSON(strict = true)
public class SubjectEntryModelImpl extends BaseModelImpl<SubjectEntry>
	implements SubjectEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a subject entry model instance should use the {@link com.vietnamobile.model.SubjectEntry} interface instead.
	 */
	public static final String TABLE_NAME = "iskools_SubjectEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "subjectEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "course", Types.VARCHAR },
			{ "subject", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "examType", Types.VARCHAR },
			{ "totalQuestion", Types.INTEGER },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table iskools_SubjectEntry (subjectEntryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,course VARCHAR(75) null,subject VARCHAR(75) null,description VARCHAR(75) null,examType VARCHAR(75) null,totalQuestion INTEGER,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table iskools_SubjectEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY subjectEntry.subjectEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY iskools_SubjectEntry.subjectEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vietnamobile.model.SubjectEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vietnamobile.model.SubjectEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SubjectEntry toModel(SubjectEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SubjectEntry model = new SubjectEntryImpl();

		model.setSubjectEntryId(soapModel.getSubjectEntryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCourse(soapModel.getCourse());
		model.setSubject(soapModel.getSubject());
		model.setDescription(soapModel.getDescription());
		model.setExamType(soapModel.getExamType());
		model.setTotalQuestion(soapModel.getTotalQuestion());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SubjectEntry> toModels(SubjectEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SubjectEntry> models = new ArrayList<SubjectEntry>(soapModels.length);

		for (SubjectEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vietnamobile.model.SubjectEntry"));

	public SubjectEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _subjectEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubjectEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subjectEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SubjectEntry.class;
	}

	@Override
	public String getModelClassName() {
		return SubjectEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subjectEntryId", getSubjectEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("course", getCourse());
		attributes.put("subject", getSubject());
		attributes.put("description", getDescription());
		attributes.put("examType", getExamType());
		attributes.put("totalQuestion", getTotalQuestion());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subjectEntryId = (Long)attributes.get("subjectEntryId");

		if (subjectEntryId != null) {
			setSubjectEntryId(subjectEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String examType = (String)attributes.get("examType");

		if (examType != null) {
			setExamType(examType);
		}

		Integer totalQuestion = (Integer)attributes.get("totalQuestion");

		if (totalQuestion != null) {
			setTotalQuestion(totalQuestion);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getSubjectEntryId() {
		return _subjectEntryId;
	}

	@Override
	public void setSubjectEntryId(long subjectEntryId) {
		_subjectEntryId = subjectEntryId;
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
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
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
	public String getCourse() {
		if (_course == null) {
			return StringPool.BLANK;
		}
		else {
			return _course;
		}
	}

	@Override
	public void setCourse(String course) {
		_course = course;
	}

	@JSON
	@Override
	public String getSubject() {
		if (_subject == null) {
			return StringPool.BLANK;
		}
		else {
			return _subject;
		}
	}

	@Override
	public void setSubject(String subject) {
		_subject = subject;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getExamType() {
		if (_examType == null) {
			return StringPool.BLANK;
		}
		else {
			return _examType;
		}
	}

	@Override
	public void setExamType(String examType) {
		_examType = examType;
	}

	@JSON
	@Override
	public int getTotalQuestion() {
		return _totalQuestion;
	}

	@Override
	public void setTotalQuestion(int totalQuestion) {
		_totalQuestion = totalQuestion;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SubjectEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SubjectEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SubjectEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SubjectEntryImpl subjectEntryImpl = new SubjectEntryImpl();

		subjectEntryImpl.setSubjectEntryId(getSubjectEntryId());
		subjectEntryImpl.setGroupId(getGroupId());
		subjectEntryImpl.setCompanyId(getCompanyId());
		subjectEntryImpl.setUserId(getUserId());
		subjectEntryImpl.setUserName(getUserName());
		subjectEntryImpl.setCreateDate(getCreateDate());
		subjectEntryImpl.setModifiedDate(getModifiedDate());
		subjectEntryImpl.setCourse(getCourse());
		subjectEntryImpl.setSubject(getSubject());
		subjectEntryImpl.setDescription(getDescription());
		subjectEntryImpl.setExamType(getExamType());
		subjectEntryImpl.setTotalQuestion(getTotalQuestion());
		subjectEntryImpl.setStatus(getStatus());

		subjectEntryImpl.resetOriginalValues();

		return subjectEntryImpl;
	}

	@Override
	public int compareTo(SubjectEntry subjectEntry) {
		long primaryKey = subjectEntry.getPrimaryKey();

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

		if (!(obj instanceof SubjectEntry)) {
			return false;
		}

		SubjectEntry subjectEntry = (SubjectEntry)obj;

		long primaryKey = subjectEntry.getPrimaryKey();

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
	public CacheModel<SubjectEntry> toCacheModel() {
		SubjectEntryCacheModel subjectEntryCacheModel = new SubjectEntryCacheModel();

		subjectEntryCacheModel.subjectEntryId = getSubjectEntryId();

		subjectEntryCacheModel.groupId = getGroupId();

		subjectEntryCacheModel.companyId = getCompanyId();

		subjectEntryCacheModel.userId = getUserId();

		subjectEntryCacheModel.userName = getUserName();

		String userName = subjectEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			subjectEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			subjectEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			subjectEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			subjectEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			subjectEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		subjectEntryCacheModel.course = getCourse();

		String course = subjectEntryCacheModel.course;

		if ((course != null) && (course.length() == 0)) {
			subjectEntryCacheModel.course = null;
		}

		subjectEntryCacheModel.subject = getSubject();

		String subject = subjectEntryCacheModel.subject;

		if ((subject != null) && (subject.length() == 0)) {
			subjectEntryCacheModel.subject = null;
		}

		subjectEntryCacheModel.description = getDescription();

		String description = subjectEntryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			subjectEntryCacheModel.description = null;
		}

		subjectEntryCacheModel.examType = getExamType();

		String examType = subjectEntryCacheModel.examType;

		if ((examType != null) && (examType.length() == 0)) {
			subjectEntryCacheModel.examType = null;
		}

		subjectEntryCacheModel.totalQuestion = getTotalQuestion();

		subjectEntryCacheModel.status = getStatus();

		return subjectEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{subjectEntryId=");
		sb.append(getSubjectEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", course=");
		sb.append(getCourse());
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", examType=");
		sb.append(getExamType());
		sb.append(", totalQuestion=");
		sb.append(getTotalQuestion());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.SubjectEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subjectEntryId</column-name><column-value><![CDATA[");
		sb.append(getSubjectEntryId());
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>course</column-name><column-value><![CDATA[");
		sb.append(getCourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>examType</column-name><column-value><![CDATA[");
		sb.append(getExamType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalQuestion</column-name><column-value><![CDATA[");
		sb.append(getTotalQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SubjectEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SubjectEntry.class
		};
	private long _subjectEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _course;
	private String _subject;
	private String _description;
	private String _examType;
	private int _totalQuestion;
	private int _status;
	private SubjectEntry _escapedModel;
}