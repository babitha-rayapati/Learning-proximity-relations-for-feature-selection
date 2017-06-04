package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class fileupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>TMPS00033</title>\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header-wrap\">\r\n");
      out.write("\t<div class=\"logo\">\r\n");
      out.write("\t\t<h1>DATA-MINING</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div><!---header-wrap-End--->\r\n");
      out.write("\r\n");
      out.write("<div class=\"menu-wrap\">\r\n");
      out.write("\t<div class=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("        \t<li><a href=\"home.jsp\" >home</a></li>\r\n");
      out.write("           \r\n");
      out.write("             <li><a href=\"fileupload.jsp\" class=\"active\">upload</a></li> \r\n");
      out.write("              <li><a href=\"fileview.jsp\">file view</a></li>      \r\n");
      out.write("            <li><a href=\"home.jsp\">LOGOUT</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"socia-wrap\">\r\n");
      out.write("\t<div class=\"socail\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("        \t<li><a href=\"#\"><img src=\"images/aim.png\" alt=\"\" /></a></li>\r\n");
      out.write("        \t<li><a href=\"#\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/twwtter.png\" alt=\"\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/linkedin.png\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div><!---menu-wrap-End--->\r\n");
      out.write("\r\n");
      out.write("<div class=\"page-wrap\">\r\n");
      out.write("<div class=\"wrap3\">  \r\n");
      out.write("  <div class=\"leftcol\">\r\n");
      out.write("  <div class=\"panel\">\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\t<form action=\"Fileupload\" method=\"post\" enctype=\"multipart/form-data\" style=\"height:600px;\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<input type=\"file\" name=\"file\" style=\"margin-top: 180px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t</input>\r\n");
      out.write("   <input type=\"submit\" value=\"upload\" />\r\n");
      out.write("\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t<div id=\"message\"></div>\r\n");
      out.write("\t\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("<!--   <div class=\"rightcol\">\r\n");
      out.write("  \t<div class=\"panel\">\r\n");
      out.write("  \t\t<div class=\"title\"><h1>Lorem ipsum <br /> Nulla varius libero</h1></div>\r\n");
      out.write("    \t<div class=\"content\">\r\n");
      out.write("        \t<div class=\"icon\"><img src=\"images/icon5.png\" alt=\"icon\" /></div>\r\n");
      out.write("            <spna>Fusce commodo </spna>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content marTop40\">\r\n");
      out.write("        \t<div class=\"icon\"><img src=\"images/icon5.png\" alt=\"icon\" /></div>\r\n");
      out.write("            <spna>Donec lacinia </spna>\r\n");
      out.write("          \r\n");
      out.write("        </div>........................\r\n");
      out.write("        <div class=\"content marTop40\">\r\n");
      out.write("        \t<div class=\"icon\"><img src=\"images/icon5.png\" alt=\"icon\" /></div>\r\n");
      out.write("            <spna>Vestibulum aliquam</spna>\r\n");
      out.write("            <p>Vestibulum fringilla nisl sit amet metus tristique</p>\r\n");
      out.write("            <div class=\"button marTop30\"><a href=\"#\">More Info</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \t<div class=\"panel marTop40\">\r\n");
      out.write("  \t\t<div class=\"title\"><h1>Nulla facilisi<br />Suspendisse aliquet</h1></div>\r\n");
      out.write("    \t<div class=\"content\">\r\n");
      out.write("        \t<p>Mauris ornare eros in purus cursus molliam nec gravida magna.</p>\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><a href=\"#\">- Lorem ipsum dolor sit amet, consect</a></li>\r\n");
      out.write("                <li><a href=\"#\">- Duis varius lectus at nunc dignissim tin</a></li>\r\n");
      out.write("                <li><a href=\"#\">- Morbi ac mauris lacus, ac mol</a></li>\r\n");
      out.write("                <li><a href=\"#\">- Etiam sollicitudin nisi a leo porta</a></li>\r\n");
      out.write("                <li class=\"bg-bottom\"><a href=\"#\">- Pellen sepien gravids loreet ornare</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"button marTop30\"><a href=\"#\">More Info</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   -->\r\n");
      out.write("    \r\n");
      out.write("  <div class=\"clearing\"></div>\r\n");
      out.write("</div>    \r\n");
      out.write("</div><!---page-wrap-End--->\r\n");
      out.write("<div class=\"footer-wrap\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("   \r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("      <!---footer-wrap--->\r\n");
      out.write("<div class=\"clearing\"></div>\r\n");
      out.write("<div class=\"copyright-wrap\">\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("    \t<div class=\"content\">\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div><!---copyright-wrap-End--->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
