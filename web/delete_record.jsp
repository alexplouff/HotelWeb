<%-- 
    Document   : delete_record
    Created on : Feb 16, 2015, 7:42:44 PM
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete A Record</title>
    </head>
    <body>
        <form id="form" name="form" method="POST" action="hc">
        <table>
            <thead>
            <th>Hotel ID</th>
            <th>Hotel Name</th>
            <th>Hotel Street</th>
            <th>Hotel City</th>
            <th>Hotel State</th>
            </thead>
        <tbody>
            <c:forEach var="hotel" items="${list}" >
			<tr>
				<td>${hotel.hotel_id}</td>
				<td>${hotel.hotel_name}</td>
                                <td>${hotel.street}</td>
			</tr>
		</c:forEach>
        </tbody>
    </table>
            <input type="submit" name="submit" id="submit" />
        </form>
                        
                        <form id="delete" name="delete" method="POST" action="delete">
                            Which Record To Delete: <input type="text" id="primaryKey" name="primaryKey" />
                            <input type="submit" name="submit" id="submit" />
                        </form>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    </body>
</html>
