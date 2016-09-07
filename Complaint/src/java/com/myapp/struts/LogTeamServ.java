/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;
/**
 *
 * @author Abhijit
 */
public class LogTeamServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        int id=Integer.parseInt(request.getParameter("id"));
        String password=request.getParameter("password");
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sess=sf.openSession();
        Transaction tr=null;
        try{
            sess.beginTransaction();
        Team te=(Team)sess.get(Team.class, id);
        if(password.equals(te.getPassword()))
        {
            response.sendRedirect("team_home.jsp?msg=Successfull Login");
        }
        else
        {
            response.sendRedirect("team_login.jsp?msg=Invalid UserId or Password");
        }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return mapping.findForward(SUCCESS);
    }
}
