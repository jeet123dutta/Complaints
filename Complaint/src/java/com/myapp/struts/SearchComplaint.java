/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.io.PrintWriter;
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
public class SearchComplaint extends org.apache.struts.action.Action {

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
         PrintWriter out=response.getWriter();
        int id=Integer.parseInt(request.getParameter("id"));
        String password=request.getParameter("password");
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sess=sf.openSession();
        Transaction tr=null;
        try{
            sess.beginTransaction();
            Complaint te=(Complaint)sess.get(Complaint.class, id);
            if(te!=null)
            {
                out.println("<br/>");
                out.println(te.getId()+"\t"+te.getSubject()+"\t"+te.getDescription());
              //  response.sendRedirect("student_home.jsp?");
                
            }
            else
            {
                response.sendRedirect("student_home.jsp?msg=Invalid Id");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return mapping.findForward(SUCCESS);
    }
}
