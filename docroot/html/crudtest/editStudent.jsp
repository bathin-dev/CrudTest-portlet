<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<portlet:actionURL name="updateStudent" var="editStudentAction">
</portlet:actionURL>
<%
 String studentName = renderRequest.getParameter("name");
 String age = renderRequest.getParameter("age");
 String gender = renderRequest.getParameter("gender");
 String grade = renderRequest.getParameter("grade");
 String stId = renderRequest.getParameter("stId");
%>
<h3>Edit Student: <%= studentName%></h3>
<aui:form action="<%=editStudentAction %>" method="post" name="name">
 <aui:input name="name" type="text" value="<%=studentName%>"/>
 <aui:input name="gender" type="text" value="<%=gender %>"/>
 <aui:input name="age" type="number" value="<%=Integer.parseInt(age) %>"/>
 <aui:input name="grade" type="number" value="<%=Integer.parseInt(grade) %>" />
 <aui:input name="stId" type="hidden" value="<%=Long.parseLong(stId) %>"/> 
 <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>