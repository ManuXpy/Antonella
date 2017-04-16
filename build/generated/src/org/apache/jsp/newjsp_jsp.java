package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta title=\"habilitar, deshabilitar combos según selección en otro combo\">\n");
      out.write(" \n");
      out.write("\t<script>\n");
      out.write("\t\tfunction habilitar(value)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tif(value=== \"1\" || value===true)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t// habilitamos\n");
      out.write("\t\t\t\tdocument.getElementById(\"segundo\").disabled=false;\n");
      out.write("\t\t\t}else if(value===\"2\" || value===false){\n");
      out.write("\t\t\t\t// deshabilitamos\n");
      out.write("\t\t\t\tdocument.getElementById(\"segundo\").disabled=true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("<form>\n");
      out.write("\t<h1>habilitar, deshabilitar combos según selección en otro combo</h1>\n");
      out.write("\t<div>\n");
      out.write("\t\t<select name=\"primero\" id=\"primero\" onchange=\"habilitar(this.value);\">\n");
      out.write("\t\t\t<option value='0'>selecciona</option>\n");
      out.write("\t\t\t<option value='1'>habilitar el segundo</option>\n");
      out.write("\t\t\t<option value='2'>deshabilitar el segundo</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t\t<select name=\"segundo\" id=\"segundo\">\n");
      out.write("\t\t\t<option value='1'>seleccion 1</option>\n");
      out.write("\t\t\t<option value='2'>seleccion 2</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
