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

package com.life.test.database.model.impl;

import com.life.test.database.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author ThinBa
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append(", studentGrade=");
		sb.append(studentGrade);
		sb.append(", Gender=");
		sb.append(Gender);
		sb.append(", age=");
		sb.append(age);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setStudentId(studentId);
		studentImpl.setGroupId(groupId);
		studentImpl.setCompanyId(companyId);
		studentImpl.setUserId(userId);

		if (userName == null) {
			studentImpl.setUserName(StringPool.BLANK);
		}
		else {
			studentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			studentImpl.setCreateDate(null);
		}
		else {
			studentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentImpl.setModifiedDate(null);
		}
		else {
			studentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (studentName == null) {
			studentImpl.setStudentName(StringPool.BLANK);
		}
		else {
			studentImpl.setStudentName(studentName);
		}

		if (studentGrade == null) {
			studentImpl.setStudentGrade(StringPool.BLANK);
		}
		else {
			studentImpl.setStudentGrade(studentGrade);
		}

		if (Gender == null) {
			studentImpl.setGender(StringPool.BLANK);
		}
		else {
			studentImpl.setGender(Gender);
		}

		studentImpl.setAge(age);

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		studentName = objectInput.readUTF();
		studentGrade = objectInput.readUTF();
		Gender = objectInput.readUTF();
		age = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studentId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (studentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(studentName);
		}

		if (studentGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(studentGrade);
		}

		if (Gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Gender);
		}

		objectOutput.writeInt(age);
	}

	public long studentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String studentName;
	public String studentGrade;
	public String Gender;
	public int age;
}