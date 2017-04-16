package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<nav class=\"navbar navbar-default sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-sidebar-navbar-collapse-1\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>      \n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-sidebar-navbar-collapse-1\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"inicio.jsp\">Inicio<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("                <li ><a href=\"alumnos.jsp\">Alumnos<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a></li>      \n");
      out.write("                <li ><a href=\"carreras.jsp\">Carreras<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-tags\"></span></a></li>     \n");
      out.write("                <li ><a href=\"materias.jsp\">Materias<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-book\"></span></a></li>     \n");
      out.write("                <li ><a href=\"#\">calificaciones<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-bookmark\"></span></a></li>     \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Reportes <span class=\"caret\"></span><span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-th-list\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("                        <li><a href=\"reporteAlumnos.jsp\" target=\"_blank\">Alumnos</a></li>\n");
      out.write("                        <li><a href=\"reporteCarreras.jsp\" target=\"_blank\">Carreras</a></li>\n");
      out.write("                        <li><a href=\"reporteMaterias.jsp\" target=\"_blank\">Materias</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>          \n");
      out.write("                <li ><a href=\"#\">Usuarios<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-exclamation-sign\"></span></a></li>        \n");
      out.write("                <li ><a href=\"out.jsp\">Salir<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-log-out\"></span></a></li>\n");
      out.write("                <li ><a href=\"reporteCalificaciones.jsp?ci_alumno=7749742\" target=\"_blank\">Ejemplo<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-exclamation-sign\"></span></a></li>        \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
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
