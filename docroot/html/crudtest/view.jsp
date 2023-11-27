<%@page import="com.liferay.taglib.portlet.ActionURLTag"%>
<%@page import="com.life.test.database.service.StudentLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.life.test.database.model.Student" %>
<%@page import="java.util.List" %>
<portlet:defineObjects />
<%
   List<Student> studentList = StudentLocalServiceUtil.getStudents(-1, -1);
   %>
<liferay-portlet:actionURL var="addStudentAction" name="addStudent"></liferay-portlet:actionURL>
<style>
   .myTable{
   border:solid; border-width: 1px; width: 15%; text-align:center;"
   }
   .myTable1{
   border:solid; border-width: 1px; width: 10%; text-align:center;"
   }
   .myTable3{
   border:solid; border-width: 1px; width: 100%; text-align:center;"
   }
   .control-group .input-text-wrapper{
   margin-bottom:-1%;
   }
</style>
<table class="myTable3">
   <tr class="myTable3">
      <th class="myTable">student Name</th>
      <th class="myTable">student Grade</th>
      <th class="myTable">Gender</th>
      <th class="myTable">Age</th>
      <th class="myTable1">Edit</th>
      <th class="myTable1">Delete</th>
   </tr>
   <%for(Student st : studentList)
      {%> 
   <tr class="myTable3">
      <td class="myTable"><%=st.getStudentName() %></td>
      <td class="myTable"><%=st.getStudentGrade() %></td>
      <td class="myTable"><%=st.getGender() %></td>
      <td class="myTable"><%=st.getAge() %></td>
      <liferay-portlet:renderURL var="editStudent">
         <portlet:param name="jspPage" value="/crudtest/editStudent.jsp" />
         <portlet:param name="name" value="<%=st.getStudentName() %>"/>
         <portlet:param name="grade" value="<%=String.valueOf(st.getStudentGrade()) %>"/>
         <portlet:param name="gender" value="<%=st.getGender() %>"/>
         <portlet:param name="age" value="<%=String.valueOf(st.getAge()) %>"/>
         <portlet:param name="stId" value="<%=String.valueOf(st.getStudentId()) %>"/>
      </liferay-portlet:renderURL>
      <td class="myTable1">
         <aui:button name="" value="Update" onClick="<%=editStudent %>" ></aui:button>
      </td>
      <portlet:actionURL name="deleteStudent" var="deleteStudent"></portlet:actionURL>
      <aui:form action="<%=deleteStudent %>" method="post" class="myTable1">
         <aui:input name="delStId" type="hidden" value="<%=st.getStudentId() %>"/>
         <td class="myTable1">
            <aui:button name="" type="submit" value="Delete" />
         </td>
      </aui:form>
   </tr>
   <%} %>
</table>
<span style="border:solid; border-width:1px;
   padding:5px; text-align:center;">
   <h5 style="text-align:center;">Add New Student</h5>
   <aui:form action="<%=addStudentAction %>" method="post" name="name">
      <aui:input name="name" type="text" value=""/>
      <aui:input name="gender" type="text" value=""/>
      <aui:input name="age" type="number" value="" />
      <aui:input name="grade" type="number" value="" />
      <aui:input name="" type="submit" value="Add Student" />
   </aui:form>
</span>