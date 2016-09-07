<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Home</title>

    </head>
    <body style="background-color: white">
        <h1>Lodge Complaint!!!</h1>
        <html:form action="ReceiveComplaint.do" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td>Complaint Id</td>
                        <td><html:text property="id"/></td>
                    </tr>
                    <tr>
                        <td>Subject</td>
                        <td><html:textarea property="subject"/></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><html:textarea property="description"/></td>
                    </tr>
                    <tr>
                        <td><html:reset property="Refresh"/></td>
                        <td><html:submit property="Submit"/></td>
                    </tr>
                </tbody>
            </table>
                    <br/>

        </html:form>
        <html:form action="SearchComplaint.do" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td>Complaint Id</td>
                        <td><html:text property="id"/></td>
                    </tr>
                    <tr>
                        <td><html:reset property="Refresh"/></td>
                        <td><html:submit property="Submit"/></td>
                    </tr>
                </tbody>
            </table>

        </html:form>
    </body>
</html:html>
