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

package com.life.test.database.service.persistence;

import com.life.test.database.model.Student;
import com.life.test.database.service.StudentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author ThinBa
 * @generated
 */
public abstract class StudentActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public StudentActionableDynamicQuery() throws SystemException {
		setBaseLocalService(StudentLocalServiceUtil.getService());
		setClass(Student.class);

		setClassLoader(com.life.test.database.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("studentId");
	}
}