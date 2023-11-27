package com.crud.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.life.test.database.model.Student;
import com.life.test.database.service.StudentLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CrudTestPortlet
 */
public class CrudTestPortlet extends MVCPortlet {
 
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		long studentId = CounterLocalServiceUtil.increment();
		Student student = null;
		student = StudentLocalServiceUtil.createStudent(studentId);
		student.setStudentName(ParamUtil.getString(actionRequest, "name"));
		student.setStudentGrade(String.valueOf((ParamUtil.getInteger(actionRequest, "grade"))));
		student.setGender(ParamUtil.getString(actionRequest, "gender"));
		student.setAge(ParamUtil.getInteger(actionRequest, "age"));
		StudentLocalServiceUtil.addStudent(student);
	}

	public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		StudentLocalServiceUtil.deleteStudent(ParamUtil.getLong(actionRequest, "delStId"));
	}

	public void updateStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		Student student = StudentLocalServiceUtil.fetchStudent(ParamUtil.getInteger(actionRequest, "stId"));

		student.setStudentName(ParamUtil.getString(actionRequest, "name"));
		student.setStudentGrade(String.valueOf((ParamUtil.getInteger(actionRequest, "grade"))));
		student.setGender(ParamUtil.getString(actionRequest, "gender"));
		student.setAge(ParamUtil.getInteger(actionRequest, "age"));
		StudentLocalServiceUtil.updateStudent(student);
	}
}
