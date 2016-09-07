<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="java.util.*" %>
<%@page import="com.myapp.struts.*" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complaints</title>

    </head>
    <body style="background-color: white">
        <html:form action="ComplaintsList.do" method="POST">
        <% ArrayList al=(ArrayList)session.getAttribute("al");
        for(int i =0; i <al.size(); i++){
                   Complaint c=(Complaint)al.get(i);
                out.println(c.getSubject());
                out.println(c.getDescription());
            }
        %>
        </html:form>

    </body>
</html:html>
