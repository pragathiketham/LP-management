<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VenueDetails</title>
</head>
<body>
	<h1> VenueBatch Details</h1>
	<table border="1">
		<tr>
			<th>VenueId</th>
			<th>VenueName</th>
			<th>VenueCapacity</th>
			<th>VenueLocation</th>
			<th>BatchName</th>
		</tr>
		<c:forEach var="venueDetails" items="${venuedetailslist }">
		<tr>
		
				<td><c:out value="${venueDetails.venueId}" /></td>
				<td><c:out value="${venueDetails.venueName}" /></td>
				<td><c:out value="${venueDetails.venueCapacity}" /></td>
				<td><c:out value="${venueDetails.venueLocation}"/></td>
				<td><c:if test="${empty venueDetails.batchName}">
				<a class="anchor" id="assignlink${venueDetails.venueId}"
				         href="${pageContext.request.contextPath}/venuebatchlist">Assign</a>
				
				<form class="formtag" id="${venueDetails.venueid}" name="${venueDetails.venueid}" action="${pageContext.request.contextPath}/updatebatch">
				<select id="batchid" name="batchId">
								<c:forEach items="${batchdetailsList}" var="batchdetails">
									<option   value="${batchdetails.batchId}">${batchdetails.batchName}</option>
								</c:forEach>
							</select> <input type="hidden" id="venueId" name="venueId" value="${venueDetails.venueid}"> 
								<input type="submit" value="Update" id="button${venueDetails.venueId}" />
				
				
				</form>
				
				</c:if> ${venueDetails.batchname}</td>
				</tr>
	</c:forEach>


	</table>


</body>
</html>