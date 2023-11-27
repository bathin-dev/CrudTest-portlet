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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThinBa
 * @see StudentPersistenceImpl
 * @see StudentUtil
 * @generated
 */
public interface StudentPersistence extends BasePersistence<Student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the students where studentName = &#63;.
	*
	* @param studentName the student name
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findBystudentName(
		java.lang.String studentName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the students where studentName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.life.test.database.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studentName the student name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findBystudentName(
		java.lang.String studentName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the students where studentName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.life.test.database.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studentName the student name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findBystudentName(
		java.lang.String studentName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first student in the ordered set where studentName = &#63;.
	*
	* @param studentName the student name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.life.test.database.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student findBystudentName_First(
		java.lang.String studentName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first student in the ordered set where studentName = &#63;.
	*
	* @param studentName the student name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student fetchBystudentName_First(
		java.lang.String studentName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last student in the ordered set where studentName = &#63;.
	*
	* @param studentName the student name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.life.test.database.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student findBystudentName_Last(
		java.lang.String studentName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last student in the ordered set where studentName = &#63;.
	*
	* @param studentName the student name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student fetchBystudentName_Last(
		java.lang.String studentName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the students before and after the current student in the ordered set where studentName = &#63;.
	*
	* @param studentId the primary key of the current student
	* @param studentName the student name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.life.test.database.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student[] findBystudentName_PrevAndNext(
		long studentId, java.lang.String studentName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the students where studentName = &#63; from the database.
	*
	* @param studentName the student name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystudentName(java.lang.String studentName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students where studentName = &#63;.
	*
	* @param studentName the student name
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public int countBystudentName(java.lang.String studentName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student where age = &#63; or throws a {@link com.life.test.database.NoSuchStudentException} if it could not be found.
	*
	* @param age the age
	* @return the matching student
	* @throws com.life.test.database.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student findByage(int age)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student where age = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param age the age
	* @return the matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student fetchByage(int age)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student where age = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param age the age
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student fetchByage(int age,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the student where age = &#63; from the database.
	*
	* @param age the age
	* @return the student that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student removeByage(int age)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students where age = &#63;.
	*
	* @param age the age
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public int countByage(int age)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public void cacheResult(com.life.test.database.model.Student student);

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public void cacheResult(
		java.util.List<com.life.test.database.model.Student> students);

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param studentId the primary key for the new student
	* @return the new student
	*/
	public com.life.test.database.model.Student create(long studentId);

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the student
	* @return the student that was removed
	* @throws com.life.test.database.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student remove(long studentId)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.life.test.database.model.Student updateImpl(
		com.life.test.database.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student with the primary key or throws a {@link com.life.test.database.NoSuchStudentException} if it could not be found.
	*
	* @param studentId the primary key of the student
	* @return the student
	* @throws com.life.test.database.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student findByPrimaryKey(long studentId)
		throws com.life.test.database.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.life.test.database.model.Student fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students.
	*
	* @return the students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.life.test.database.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.life.test.database.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.life.test.database.model.Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}