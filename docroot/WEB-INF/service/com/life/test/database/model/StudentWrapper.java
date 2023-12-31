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

package com.life.test.database.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author ThinBa
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("studentName", getStudentName());
		attributes.put("studentGrade", getStudentGrade());
		attributes.put("Gender", getGender());
		attributes.put("age", getAge());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
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

		String studentName = (String)attributes.get("studentName");

		if (studentName != null) {
			setStudentName(studentName);
		}

		String studentGrade = (String)attributes.get("studentGrade");

		if (studentGrade != null) {
			setStudentGrade(studentGrade);
		}

		String Gender = (String)attributes.get("Gender");

		if (Gender != null) {
			setGender(Gender);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}
	}

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this student.
	*
	* @return the student ID of this student
	*/
	@Override
	public long getStudentId() {
		return _student.getStudentId();
	}

	/**
	* Sets the student ID of this student.
	*
	* @param studentId the student ID of this student
	*/
	@Override
	public void setStudentId(long studentId) {
		_student.setStudentId(studentId);
	}

	/**
	* Returns the group ID of this student.
	*
	* @return the group ID of this student
	*/
	@Override
	public long getGroupId() {
		return _student.getGroupId();
	}

	/**
	* Sets the group ID of this student.
	*
	* @param groupId the group ID of this student
	*/
	@Override
	public void setGroupId(long groupId) {
		_student.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this student.
	*
	* @return the company ID of this student
	*/
	@Override
	public long getCompanyId() {
		return _student.getCompanyId();
	}

	/**
	* Sets the company ID of this student.
	*
	* @param companyId the company ID of this student
	*/
	@Override
	public void setCompanyId(long companyId) {
		_student.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this student.
	*
	* @return the user ID of this student
	*/
	@Override
	public long getUserId() {
		return _student.getUserId();
	}

	/**
	* Sets the user ID of this student.
	*
	* @param userId the user ID of this student
	*/
	@Override
	public void setUserId(long userId) {
		_student.setUserId(userId);
	}

	/**
	* Returns the user uuid of this student.
	*
	* @return the user uuid of this student
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _student.getUserUuid();
	}

	/**
	* Sets the user uuid of this student.
	*
	* @param userUuid the user uuid of this student
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_student.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this student.
	*
	* @return the user name of this student
	*/
	@Override
	public java.lang.String getUserName() {
		return _student.getUserName();
	}

	/**
	* Sets the user name of this student.
	*
	* @param userName the user name of this student
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_student.setUserName(userName);
	}

	/**
	* Returns the create date of this student.
	*
	* @return the create date of this student
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _student.getCreateDate();
	}

	/**
	* Sets the create date of this student.
	*
	* @param createDate the create date of this student
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_student.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this student.
	*
	* @return the modified date of this student
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _student.getModifiedDate();
	}

	/**
	* Sets the modified date of this student.
	*
	* @param modifiedDate the modified date of this student
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_student.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the student name of this student.
	*
	* @return the student name of this student
	*/
	@Override
	public java.lang.String getStudentName() {
		return _student.getStudentName();
	}

	/**
	* Sets the student name of this student.
	*
	* @param studentName the student name of this student
	*/
	@Override
	public void setStudentName(java.lang.String studentName) {
		_student.setStudentName(studentName);
	}

	/**
	* Returns the student grade of this student.
	*
	* @return the student grade of this student
	*/
	@Override
	public java.lang.String getStudentGrade() {
		return _student.getStudentGrade();
	}

	/**
	* Sets the student grade of this student.
	*
	* @param studentGrade the student grade of this student
	*/
	@Override
	public void setStudentGrade(java.lang.String studentGrade) {
		_student.setStudentGrade(studentGrade);
	}

	/**
	* Returns the gender of this student.
	*
	* @return the gender of this student
	*/
	@Override
	public java.lang.String getGender() {
		return _student.getGender();
	}

	/**
	* Sets the gender of this student.
	*
	* @param Gender the gender of this student
	*/
	@Override
	public void setGender(java.lang.String Gender) {
		_student.setGender(Gender);
	}

	/**
	* Returns the age of this student.
	*
	* @return the age of this student
	*/
	@Override
	public int getAge() {
		return _student.getAge();
	}

	/**
	* Sets the age of this student.
	*
	* @param age the age of this student
	*/
	@Override
	public void setAge(int age) {
		_student.setAge(age);
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	@Override
	public int compareTo(com.life.test.database.model.Student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.life.test.database.model.Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public com.life.test.database.model.Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public com.life.test.database.model.Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Validator.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Student getWrappedStudent() {
		return _student;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private Student _student;
}