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
        <h1 style="color: blue"> ADMIN LOGIN </h1> <br />
        <form action="AdminServ.do" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td> Username  </td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td> Password  </td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Refresh" /></td>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>

    </body>
</html:html>
