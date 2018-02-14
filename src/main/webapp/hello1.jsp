
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    Hello 1 ${name}

<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication property="principal.username" /> 
</security:authorize>

SEGURIDAD:
<security:authorize access="hasPermission(#domain,'read') or hasPermission(#domain,'write')">

This content will only be visible to users who have read or write permission to the Object found as a request attribute named "domain".

</security:authorize>
<BR>
FIN SEGURIDAD
<%-- <security:authorize ifAllGranted="ROLE_SUPERVISOR"> --%>
<!-- <td>ROL AUTORIZADO:  -->
<%--   <a href="del.htm?id=<c:out value="${contact.id}"/>">Del</a> --%>
<!-- </td> -->
<%-- </security:authorize> --%>

</body>
</html>