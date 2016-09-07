<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>

    </head>
    <body style="background-color: white">
        <h1 style="color: blue"><marquee>Student Registration</marquee></h1>
        <html:form action="/StudentReg" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td>Student Id</td>
                        <td><html:text property="id"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><html:text property="name"/></td>
                        <td><html:errors property="name"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><html:password property="password"/></td>
                        <td><html:errors property="password"/></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><html:text property="phone"/></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><html:text property="email"/></td>
                    </tr>
                    <tr>
                        <td><html:reset property="Refresh" /></td>
                        <td><input type="submit" value="Register" /></td>
                    </tr>
                </tbody>
            </table>

        </html:form>

    </body>
</html:html>
