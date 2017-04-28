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

import com.vietnamobile.model.QuestionEntry;
import com.vietnamobile.model.QuestionEntryModel;
import com.vietnamobile.model.QuestionEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QuestionEntry service. Represents a row in the &quot;iskools_QuestionEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vietnamobile.model.QuestionEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuestionEntryImpl}.
 * </p>
 *
 * @author duymb
 * @see QuestionEntryImpl
 * @see com.vietnamobile.model.QuestionEntry
 * @see com.vietnamobile.model.QuestionEntryModel
 * @generated
 */
@JSON(strict = true)
public class QuestionEntryModelImpl extends BaseModelImpl<QuestionEntry>
	implements QuestionEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a question entry model instance should use the {@link com.vietnamobile.model.QuestionEntry} interface instead.
	 */
	public static final String TABLE_NAME = "iskools_QuestionEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "questionEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "subject", Types.VARCHAR },
			{ "levelQuestion", Types.DOUBLE },
			{ "answer", Types.VARCHAR },
			{ "score", Types.DOUBLE },
			{ "questionContent", Types.VARCHAR },
			{ "a", Types.VARCHAR },
			{ "b", Types.VARCHAR },
			{ "c", Types.VARCHAR },
			{ "d", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "selection1", Types.VARCHAR },
			{ "selection2", Types.VARCHAR },
			{ "selection3", Types.VARCHAR },
			{ "selection4", Types.VARCHAR },
			{ "typeExam", Types.VARCHAR },
			{ "inExam", Types.INTEGER },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table iskools_QuestionEntry (questionEntryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,subject VARCHAR(75) null,levelQuestion DOUBLE,answer VARCHAR(75) null,score DOUBLE,questionContent STRING null,a STRING null,b STRING null,c STRING null,d STRING null,title VARCHAR(75) null,selection1 VARCHAR(75) null,selection2 VARCHAR(75) null,selection3 VARCHAR(75) null,selection4 VARCHAR(75) null,typeExam VARCHAR(75) null,inExam INTEGER,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table iskools_QuestionEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY questionEntry.questionEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY iskools_QuestionEntry.questionEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vietnamobile.model.QuestionEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vietnamobile.model.QuestionEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QuestionEntry toModel(QuestionEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QuestionEntry model = new QuestionEntryImpl();

		model.setQuestionEntryId(soapModel.getQuestionEntryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setSubject(soapModel.getSubject());
		model.setLevelQuestion(soapModel.getLevelQuestion());
		model.setAnswer(soapModel.getAnswer());
		model.setScore(soapModel.getScore());
		model.setQuestionContent(soapModel.getQuestionContent());
		model.setA(soapModel.getA());
		model.setB(soapModel.getB());
		model.setC(soapModel.getC());
		model.setD(soapModel.getD());
		model.setTitle(soapModel.getTitle());
		model.setSelection1(soapModel.getSelection1());
		model.setSelection2(soapModel.getSelection2());
		model.setSelection3(soapModel.getSelection3());
		model.setSelection4(soapModel.getSelection4());
		model.setTypeExam(soapModel.getTypeExam());
		model.setInExam(soapModel.getInExam());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QuestionEntry> toModels(QuestionEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QuestionEntry> models = new ArrayList<QuestionEntry>(soapModels.length);

		for (QuestionEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vietnamobile.model.QuestionEntry"));

	public QuestionEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _questionEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuestionEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _questionEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuestionEntry.class;
	}

	@Override
	public String getModelClassName() {
		return QuestionEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionEntryId", getQuestionEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subject", getSubject());
		attributes.put("levelQuestion", getLevelQuestion());
		attributes.put("answer", getAnswer());
		attributes.put("score", getScore());
		attributes.put("questionContent", getQuestionContent());
		attributes.put("a", getA());
		attributes.put("b", getB());
		attributes.put("c", getC());
		attributes.put("d", getD());
		attributes.put("title", getTitle());
		attributes.put("selection1", getSelection1());
		attributes.put("selection2", getSelection2());
		attributes.put("selection3", getSelection3());
		attributes.put("selection4", getSelection4());
		attributes.put("typeExam", getTypeExam());
		attributes.put("inExam", getInExam());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionEntryId = (Long)attributes.get("questionEntryId");

		if (questionEntryId != null) {
			setQuestionEntryId(questionEntryId);
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

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		Double levelQuestion = (Double)attributes.get("levelQuestion");

		if (levelQuestion != null) {
			setLevelQuestion(levelQuestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Double score = (Double)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		String questionContent = (String)attributes.get("questionContent");

		if (questionContent != null) {
			setQuestionContent(questionContent);
		}

		String a = (String)attributes.get("a");

		if (a != null) {
			setA(a);
		}

		String b = (String)attributes.get("b");

		if (b != null) {
			setB(b);
		}

		String c = (String)attributes.get("c");

		if (c != null) {
			setC(c);
		}

		String d = (String)attributes.get("d");

		if (d != null) {
			setD(d);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String selection1 = (String)attributes.get("selection1");

		if (selection1 != null) {
			setSelection1(selection1);
		}

		String selection2 = (String)attributes.get("selection2");

		if (selection2 != null) {
			setSelection2(selection2);
		}

		String selection3 = (String)attributes.get("selection3");

		if (selection3 != null) {
			setSelection3(selection3);
		}

		String selection4 = (String)attributes.get("selection4");

		if (selection4 != null) {
			setSelection4(selection4);
		}

		String typeExam = (String)attributes.get("typeExam");

		if (typeExam != null) {
			setTypeExam(typeExam);
		}

		Integer inExam = (Integer)attributes.get("inExam");

		if (inExam != null) {
			setInExam(inExam);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
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
	public double getLevelQuestion() {
		return _levelQuestion;
	}

	@Override
	public void setLevelQuestion(double levelQuestion) {
		_levelQuestion = levelQuestion;
	}

	@JSON
	@Override
	public String getAnswer() {
		if (_answer == null) {
			return StringPool.BLANK;
		}
		else {
			return _answer;
		}
	}

	@Override
	public void setAnswer(String answer) {
		_answer = answer;
	}

	@JSON
	@Override
	public double getScore() {
		return _score;
	}

	@Override
	public void setScore(double score) {
		_score = score;
	}

	@JSON
	@Override
	public String getQuestionContent() {
		if (_questionContent == null) {
			return StringPool.BLANK;
		}
		else {
			return _questionContent;
		}
	}

	@Override
	public void setQuestionContent(String questionContent) {
		_questionContent = questionContent;
	}

	@JSON
	@Override
	public String getA() {
		if (_a == null) {
			return StringPool.BLANK;
		}
		else {
			return _a;
		}
	}

	@Override
	public void setA(String a) {
		_a = a;
	}

	@JSON
	@Override
	public String getB() {
		if (_b == null) {
			return StringPool.BLANK;
		}
		else {
			return _b;
		}
	}

	@Override
	public void setB(String b) {
		_b = b;
	}

	@JSON
	@Override
	public String getC() {
		if (_c == null) {
			return StringPool.BLANK;
		}
		else {
			return _c;
		}
	}

	@Override
	public void setC(String c) {
		_c = c;
	}

	@JSON
	@Override
	public String getD() {
		if (_d == null) {
			return StringPool.BLANK;
		}
		else {
			return _d;
		}
	}

	@Override
	public void setD(String d) {
		_d = d;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getSelection1() {
		if (_selection1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _selection1;
		}
	}

	@Override
	public void setSelection1(String selection1) {
		_selection1 = selection1;
	}

	@JSON
	@Override
	public String getSelection2() {
		if (_selection2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _selection2;
		}
	}

	@Override
	public void setSelection2(String selection2) {
		_selection2 = selection2;
	}

	@JSON
	@Override
	public String getSelection3() {
		if (_selection3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _selection3;
		}
	}

	@Override
	public void setSelection3(String selection3) {
		_selection3 = selection3;
	}

	@JSON
	@Override
	public String getSelection4() {
		if (_selection4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _selection4;
		}
	}

	@Override
	public void setSelection4(String selection4) {
		_selection4 = selection4;
	}

	@JSON
	@Override
	public String getTypeExam() {
		if (_typeExam == null) {
			return StringPool.BLANK;
		}
		else {
			return _typeExam;
		}
	}

	@Override
	public void setTypeExam(String typeExam) {
		_typeExam = typeExam;
	}

	@JSON
	@Override
	public int getInExam() {
		return _inExam;
	}

	@Override
	public void setInExam(int inExam) {
		_inExam = inExam;
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
			QuestionEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuestionEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QuestionEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QuestionEntryImpl questionEntryImpl = new QuestionEntryImpl();

		questionEntryImpl.setQuestionEntryId(getQuestionEntryId());
		questionEntryImpl.setGroupId(getGroupId());
		questionEntryImpl.setCompanyId(getCompanyId());
		questionEntryImpl.setUserId(getUserId());
		questionEntryImpl.setUserName(getUserName());
		questionEntryImpl.setCreateDate(getCreateDate());
		questionEntryImpl.setModifiedDate(getModifiedDate());
		questionEntryImpl.setSubject(getSubject());
		questionEntryImpl.setLevelQuestion(getLevelQuestion());
		questionEntryImpl.setAnswer(getAnswer());
		questionEntryImpl.setScore(getScore());
		questionEntryImpl.setQuestionContent(getQuestionContent());
		questionEntryImpl.setA(getA());
		questionEntryImpl.setB(getB());
		questionEntryImpl.setC(getC());
		questionEntryImpl.setD(getD());
		questionEntryImpl.setTitle(getTitle());
		questionEntryImpl.setSelection1(getSelection1());
		questionEntryImpl.setSelection2(getSelection2());
		questionEntryImpl.setSelection3(getSelection3());
		questionEntryImpl.setSelection4(getSelection4());
		questionEntryImpl.setTypeExam(getTypeExam());
		questionEntryImpl.setInExam(getInExam());
		questionEntryImpl.setStatus(getStatus());

		questionEntryImpl.resetOriginalValues();

		return questionEntryImpl;
	}

	@Override
	public int compareTo(QuestionEntry questionEntry) {
		long primaryKey = questionEntry.getPrimaryKey();

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

		if (!(obj instanceof QuestionEntry)) {
			return false;
		}

		QuestionEntry questionEntry = (QuestionEntry)obj;

		long primaryKey = questionEntry.getPrimaryKey();

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
	public CacheModel<QuestionEntry> toCacheModel() {
		QuestionEntryCacheModel questionEntryCacheModel = new QuestionEntryCacheModel();

		questionEntryCacheModel.questionEntryId = getQuestionEntryId();

		questionEntryCacheModel.groupId = getGroupId();

		questionEntryCacheModel.companyId = getCompanyId();

		questionEntryCacheModel.userId = getUserId();

		questionEntryCacheModel.userName = getUserName();

		String userName = questionEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			questionEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			questionEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			questionEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			questionEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			questionEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		questionEntryCacheModel.subject = getSubject();

		String subject = questionEntryCacheModel.subject;

		if ((subject != null) && (subject.length() == 0)) {
			questionEntryCacheModel.subject = null;
		}

		questionEntryCacheModel.levelQuestion = getLevelQuestion();

		questionEntryCacheModel.answer = getAnswer();

		String answer = questionEntryCacheModel.answer;

		if ((answer != null) && (answer.length() == 0)) {
			questionEntryCacheModel.answer = null;
		}

		questionEntryCacheModel.score = getScore();

		questionEntryCacheModel.questionContent = getQuestionContent();

		String questionContent = questionEntryCacheModel.questionContent;

		if ((questionContent != null) && (questionContent.length() == 0)) {
			questionEntryCacheModel.questionContent = null;
		}

		questionEntryCacheModel.a = getA();

		String a = questionEntryCacheModel.a;

		if ((a != null) && (a.length() == 0)) {
			questionEntryCacheModel.a = null;
		}

		questionEntryCacheModel.b = getB();

		String b = questionEntryCacheModel.b;

		if ((b != null) && (b.length() == 0)) {
			questionEntryCacheModel.b = null;
		}

		questionEntryCacheModel.c = getC();

		String c = questionEntryCacheModel.c;

		if ((c != null) && (c.length() == 0)) {
			questionEntryCacheModel.c = null;
		}

		questionEntryCacheModel.d = getD();

		String d = questionEntryCacheModel.d;

		if ((d != null) && (d.length() == 0)) {
			questionEntryCacheModel.d = null;
		}

		questionEntryCacheModel.title = getTitle();

		String title = questionEntryCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			questionEntryCacheModel.title = null;
		}

		questionEntryCacheModel.selection1 = getSelection1();

		String selection1 = questionEntryCacheModel.selection1;

		if ((selection1 != null) && (selection1.length() == 0)) {
			questionEntryCacheModel.selection1 = null;
		}

		questionEntryCacheModel.selection2 = getSelection2();

		String selection2 = questionEntryCacheModel.selection2;

		if ((selection2 != null) && (selection2.length() == 0)) {
			questionEntryCacheModel.selection2 = null;
		}

		questionEntryCacheModel.selection3 = getSelection3();

		String selection3 = questionEntryCacheModel.selection3;

		if ((selection3 != null) && (selection3.length() == 0)) {
			questionEntryCacheModel.selection3 = null;
		}

		questionEntryCacheModel.selection4 = getSelection4();

		String selection4 = questionEntryCacheModel.selection4;

		if ((selection4 != null) && (selection4.length() == 0)) {
			questionEntryCacheModel.selection4 = null;
		}

		questionEntryCacheModel.typeExam = getTypeExam();

		String typeExam = questionEntryCacheModel.typeExam;

		if ((typeExam != null) && (typeExam.length() == 0)) {
			questionEntryCacheModel.typeExam = null;
		}

		questionEntryCacheModel.inExam = getInExam();

		questionEntryCacheModel.status = getStatus();

		return questionEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{questionEntryId=");
		sb.append(getQuestionEntryId());
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
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", levelQuestion=");
		sb.append(getLevelQuestion());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append(", score=");
		sb.append(getScore());
		sb.append(", questionContent=");
		sb.append(getQuestionContent());
		sb.append(", a=");
		sb.append(getA());
		sb.append(", b=");
		sb.append(getB());
		sb.append(", c=");
		sb.append(getC());
		sb.append(", d=");
		sb.append(getD());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", selection1=");
		sb.append(getSelection1());
		sb.append(", selection2=");
		sb.append(getSelection2());
		sb.append(", selection3=");
		sb.append(getSelection3());
		sb.append(", selection4=");
		sb.append(getSelection4());
		sb.append(", typeExam=");
		sb.append(getTypeExam());
		sb.append(", inExam=");
		sb.append(getInExam());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.QuestionEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>questionEntryId</column-name><column-value><![CDATA[");
		sb.append(getQuestionEntryId());
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
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>levelQuestion</column-name><column-value><![CDATA[");
		sb.append(getLevelQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionContent</column-name><column-value><![CDATA[");
		sb.append(getQuestionContent());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>a</column-name><column-value><![CDATA[");
		sb.append(getA());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>b</column-name><column-value><![CDATA[");
		sb.append(getB());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>c</column-name><column-value><![CDATA[");
		sb.append(getC());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>d</column-name><column-value><![CDATA[");
		sb.append(getD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection1</column-name><column-value><![CDATA[");
		sb.append(getSelection1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection2</column-name><column-value><![CDATA[");
		sb.append(getSelection2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection3</column-name><column-value><![CDATA[");
		sb.append(getSelection3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection4</column-name><column-value><![CDATA[");
		sb.append(getSelection4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeExam</column-name><column-value><![CDATA[");
		sb.append(getTypeExam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inExam</column-name><column-value><![CDATA[");
		sb.append(getInExam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QuestionEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QuestionEntry.class
		};
	private long _questionEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _subject;
	private double _levelQuestion;
	private String _answer;
	private double _score;
	private String _questionContent;
	private String _a;
	private String _b;
	private String _c;
	private String _d;
	private String _title;
	private String _selection1;
	private String _selection2;
	private String _selection3;
	private String _selection4;
	private String _typeExam;
	private int _inExam;
	private int _status;
	private QuestionEntry _escapedModel;
}