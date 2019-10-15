<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MentorDetials</title>
</head>
<body>
	<h1>Mentor Details</h1>
	<p>${SuccessMessage}</p>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>PhoneNumber</th>
			<th>BatchName</th>
		</tr>
		<c:forEach var="mentorDetails" items="${mentordetailsList}">
			<tr>

				<td><c:out value="${mentorDetails.name}" /></td>
				<td><c:out value="${mentorDetails.email}" /></td>
				<td><c:out value="${mentorDetails.phonenumber}" /></td>
				<td><c:if test="${empty mentorDetails.batchname}">
						<a class = "anchor" id="assignlink${mentorDetails.mentorid}"
							href="${pageContext.request.contextPath}/batchlist">Assign</a>
					<form  class="formtag" id="${mentorDetails.mentorid}" name="${mentorDetails.mentorid}" action="${pageContext.request.contextPath}/updatebatch">
							<select id="batchid" name="batchId">
								<c:forEach items="${batchdetailsList}" var="batchdetails">
									<option   value="${batchdetails.batchId}">${batchdetails.batchName}</option>
								</c:forEach>
							</select> <input type="hidden" id="mentorid" name="mentorid" value="${mentorDetails.mentorid}"> 
								<input type="submit" value="Update" id="button${mentorDetails.mentorid}" />
						</form>

				</c:if>${mentorDetails.batchname}
				 </td>
			</tr>
		</c:forEach>

	</table>
</body>

</html>