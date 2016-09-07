package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<table width=\"100%\" align=\"center\" cellspacing=\"0\" background=\"images/hd.jpg\" >\n");
      out.write("    <tr><td  align=\"center\" colspan=\"4\"  >\n");
      out.write("            <font color=\"black\"  size=\"40pt\" face=\"Forte\">\n");
      out.write("        <b>Welcome to Complaint System</b></font>\n");
      out.write("   <!-- <marquee>     <img src=\"images/virtual-classroom.jpg\" height=\"250\" width=\"1400\">\n");
      out.write("        <img src=\"images/Education.png\" height=\"250\" width=\"1400\">\n");
      out.write("        <img src=\"images/classroom_01.jpg\" height=\"250\" width=\"1400\" >\n");
      out.write("    </marquee>-->\n");
      out.write("   <table style=\"border:3px solid #00aaff;background-color:#00aaaa;\" align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<img name=\"slide\" id=\"slide\" alt =\"my images\" height=\"250\" width=\"700\" src=\"images/Education.png\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\"style=\"font:small-caps bold 15px georgia; color:blue;\">\n");
      out.write("<div id =\"mydiv\"></div>\n");
      out.write("</tr>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("   <br>\n");
      out.write("    <div align=\"right\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </td></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
