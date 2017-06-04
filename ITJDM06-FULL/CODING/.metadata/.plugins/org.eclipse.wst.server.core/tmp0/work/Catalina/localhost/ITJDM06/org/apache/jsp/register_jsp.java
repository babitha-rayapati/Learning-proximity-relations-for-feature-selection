package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>TMPS00033</title>\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.quicksand.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"css/prettyPhoto.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header-wrap\">\r\n");
      out.write("  <div class=\"logo\">\r\n");
      out.write("    <h1>DATA-MINING</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---header-wrap-End--->\r\n");
      out.write("<div class=\"menu-wrap\">\r\n");
      out.write("  <div class=\"menu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("            <li><a href=\"home.jsp\" >HOME</a></li>\r\n");
      out.write("            <li><a href=\"login.jsp\">LOGIN</a></li>\r\n");
      out.write("            <li><a href=\"register.jsp\" class=\"active\">REGISTER</a></li>        \r\n");
      out.write("            <li><a href=\"contact.jsp\">CONTACT</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"socia-wrap\">\r\n");
      out.write("    <div class=\"socail\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"images/aim.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"images/twwtter.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"images/linkedin.png\" alt=\"\" /></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---menu-wrap-End--->\r\n");
      out.write("<div class=\"page-wrapper\">\r\n");
      out.write("  <div class=\"portfolio-content\">\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("     <div class=\"lg-container\" style=\"background-color: white; width:380px;\">\r\n");
      out.write("\t\t<h1 style=\"color:black;\">REGISTER</h1>\r\n");
      out.write("\t\t<form action=\"Register\" id=\"lg-form\" name=\"lg-form\" method=\"post\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"username\">Username:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" title=\"Username (letters and numbers only, no punctuation or special characters)\" pattern=\"[A-Za-z0-9]+\"  name=\"username\" id=\"username\" placeholder=\"username\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"email\">email:</label>\r\n");
      out.write("<!-- \t\t\t\t     <input type=\"text\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" title=\"Please enter valid email address\"  name=\"email\" id=\"email\" placeholder=\"email\"/> -->\r\n");
      out.write("\t\t\t\t     <input type=\"text\"  title=\"Please enter valid email address\"  name=\"email\" id=\"email\" placeholder=\"email\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"password\">Password:</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" pattern=\".{6,}\" title=\"PLease  enter minimum six character\"  name=\"password\" id=\"password\" placeholder=\"password\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"password\">confirmPassword:</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\"  pattern=\".{6,}\" title=\"PLease  enter minimum six character\" name=\"confirmpassword\" id=\"confirmpassword\" placeholder=\"confirmpassword\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"gender\">gender:</label>\r\n");
      out.write("\t\t\t  <select name=\"gender\" style=\"width:380px;\">\r\n");
      out.write("\t\t\t\t<option value=\"gender\" style=\"text-align:center\">----GENDER----</option>\r\n");
      out.write("\t\t\t\t<option value=\"male\">MALE</option>\r\n");
      out.write("\t\t\t\t<option value=\"female\">FEMALE</option>\r\n");
      out.write("\t\t\t\t</input>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"mobile\">MOBILE:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" pattern=\"[7-9]{1}[0-9]{9}\" title=\"Mobile number starting with 9 or 8 or 7 and other 9 digit using any number\"  title=\"PLease  enter must ten numbers\" name=\"mobile\" id=\"mobile\" placeholder=\"mobile\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"address\">Address:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"address\" id=\"address\" placeholder=\"address\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div>\t\r\n");
      out.write("\t\t<center>\t\t\t\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"login\" >REGISTER</button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("        <a href=\"login.jsp\" style=\"color:black;\" ><span> CLICK HERE!</span>  already member? go to login</a>\r\n");
      out.write("      </center>\r\n");
      out.write("      <div class=\"column-clear\"></div>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!--end portfolio-area -->\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---page-wrap-End--->\r\n");
      out.write("<div class=\"clearing\"></div>\r\n");
      out.write("<div class=\"footer-wrap\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("    <div class=\"panel marRight30\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <h1>Testimoniala</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("        <div class=\"testimonials\"> Accusantium dolo remque la udantium totam  consequat tortor pretium sit amet volFusce pellentesque </div>\r\n");
      out.write("        <span>- John Goe</span> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel marRight30\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <h1>Newsletter</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <input name=\"input\" type=\"text\"  class=\"input-newsletter\"/>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <input type=\"button\" class=\"button\" value=\"Signup\" />\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>Vivamus lorem lectus, gravida a euismod ut, semper eu lectus lorem ipsum.</p>\r\n");
      out.write("        <span><a href=\"#\">Unsubscribe</a></span> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <h1>Contact us </h1>\r\n");
      out.write("      </div>\r\n");
      out.write("     <!--  <div class=\"cotact\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><img src=\"images/icon6.png\" alt=\"\" />(000) 888 888888</li>\r\n");
      out.write("          <li><img src=\"images/icon7.png\" alt=\"\" /><a href=\"mailto:info@companyname.com\">info@companyname.com</a></li>\r\n");
      out.write("          <li><img src=\"images/icon8.png\" alt=\"\" />Name of site owner</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div> -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clearing\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---footer-wrap--->\r\n");
      out.write("<div class=\"clearing\"></div>\r\n");
      out.write("<div class=\"copyright-wrap\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("   <!--  <div class=\"content\">\r\n");
      out.write("      <p>Copyright (c) websitename. All rights reserved.\r\n");
      out.write("        <<a href=\"www.alltemplateneeds.com\" class=\"active\"> www.alltemplateneeds.com</a> > \r\n");
      out.write("        Images From:<a href=\"www.photorack.net\"> www.photorack.net</a></p>\r\n");
      out.write("    </div> -->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---copyright-wrap-End--->\r\n");
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
