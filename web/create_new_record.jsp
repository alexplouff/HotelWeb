<%-- 
    Document   : create_new_record
    Created on : Feb 15, 2015, 4:42:58 PM
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form id="newRecordForm" name="createForm" method="POST" action="createRec">
            
            Enter Hotel Name:<input type="text" id="hotel_name" name="hotel_name" /> <br>
            Enter Hotel Street: <input type="text" id="street" name="street" /> <br>
            Enter Hotel City: <input type="text" id="city" name="city" /><br>
            Enter Hotel State: <input type="text" id="state" name="state" />
            <input type="submit" id="submit" name ="submit" />
        </form>
        
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    </body>
</html>
