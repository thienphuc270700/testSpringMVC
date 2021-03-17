<%-- 
    Document   : dicts-list
    Created on : Mar 11, 2021, 12:16:02 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>>My Dictionary</title>
    </head>
    <body>
        <table width="80%" border="1">
            <tr>
                <th width="30%">Word</th>
                <th width="70%">Description</th>
            </tr>
            <c:forEach items="${words.entrySet()}" var="w">
                <tr>
                    <td>${w.getKey()}</td>
                    <td>${w.getValue()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
