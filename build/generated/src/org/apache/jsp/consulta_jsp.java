package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

        HttpSession sessionActiva = request.getSession();
        System.out.println(sessionActiva);
        System.out.println(sessionActiva.getAttribute("sessionON"));
        if (sessionActiva.getAttribute("sessionON") == null) {
            response.sendRedirect("/Calificaciones/LoginAlumnos.html");
        }
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.session.maxInactiveInterval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";url=login-caducado.jsp\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/iconos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/menu.css\">\n");
      out.write("        <script src=\"Recursos/js/jquery.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/ImagenFondo.js\"></script>\n");
      out.write("        <script src=\"Operaciones/OperacionConsulta.js\"></script>\n");
      out.write("        <title>Consulta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sessionON}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <small>Calificaciones</small></h1></div>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <strong>Carreras</strong>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("\n");
      out.write("            <div class=\"col-md-4\" style=\"display:none\">\n");
      out.write("                <input id=\"codigo\" name=\"codigo\" type=\"text\" class=\"form-control input-md\">\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <a href=\"outAlumnos.jsp\" class=\"btn btn-primary pull-right\">\n");
      out.write("                    <span>SALIR</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script>\n");
      out.write("            var ci = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sessionON}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("            var codigo = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sessionON}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
