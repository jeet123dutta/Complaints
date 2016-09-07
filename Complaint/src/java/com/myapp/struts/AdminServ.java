/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Shashank
 */
public class AdminServ extends org.apache.struts.action.Action {
    
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
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if((username.equals("jeet")&&password.equals("jeet"))||(username.equals("shashank")&&password.equals("shashank")))
        {
           HttpSession hs=request.getSession(true);
           hs.setAttribute("username", username);
           hs.setAttribute("password","yes");
           response.sendRedirect("admin_home.jsp");
        }
        else
        {
            response.sendRedirect("admin_login.jsp?msg=Invalid Username or Password");
        }
        
        return mapping.findForward(SUCCESS);
    }
}
