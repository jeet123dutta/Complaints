<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>

    </head>
    <body style="background-color: white">
        <h1> Team Registration </h1><br />
        <html:form action="TeamServ.do" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td> Team ID</td>
                        <td><html:text property="id" /></td>
                    </tr>
                    <tr>
                        <td>Team Type</td>
                        <td><html:text property="type" /></td>
                    </tr>
                     <tr>
                        <td>Team Head</td>
                        <td><html:text property="head" /></td>
                    </tr>
                     <tr>
                        <td>Phone</td>
                        <td><html:text property="phone" /></td>
                    </tr>
                     <tr>
                        <td>Email</td>
                        <td><html:text property="email" /></td>
                    </tr>
                     <tr>
                        <td>Password</td>
                        <td><html:password property="password" /></td>
                    </tr>
                     <tr>
                         <td><html:reset property="Refresh" /></td>
                         <td><html:submit property="Register" /></td>
                    </tr>
                </tbody>
            </table>

        </html:form>

    </body>
</html:html>
