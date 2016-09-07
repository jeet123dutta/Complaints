<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>

    </head>
    <body style="background-color: white">
    <%
    String username=(String)session.getAttribute("username");
    %>
    <h1><marquee>Hello <%= username %> !!!</marquee></h1><br />
    <h2 style="color: red" align="center"><a href="ComplaintsList.do"> Complaints </a></h2><br />
    <h2 style="color: red" align="center"><a href="team_reg.jsp"> Team Registration </a> </h2><br />
    </body>
</html:html>
