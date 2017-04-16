package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class materias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Materias</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/iconos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap-datepicker.css\">\n");
      out.write("        <script src=\"Recursos/js/jquery.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/bootstrapValidator.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/ImagenFondo.js\"></script> \n");
      out.write("        <script src=\"Recursos/js/bootstrap-datepicker.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("                        <li><a href=\"#\">Alumnos</a></li>\n");
      out.write("                        <li><a href=\"#\">Carreras</a></li>\n");
      out.write("                        <li><a href=\"#\">Materias</a></li>\n");
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
      out.write("\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" id=\"defaultForm\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <!-- Form Name -->\n");
      out.write("                    <legend>Materias</legend>\n");
      out.write("                    <!-- Text input-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-1 control-label\" for=\"codigo\">ID</label>  \n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <input id=\"codigo\" name=\"codigo\" type=\"text\" placeholder=\"ID\" class=\"form-control input-md\" required=\"\"  autofocus onkeydown=\"\n");
      out.write("                                    if (event.keyCode === 13) {\n");
      out.write("                                        listarSegunFiltro();\n");
      out.write("                                    }\n");
      out.write("                                   \">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Select Basic -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-1 control-label\" for=\"cargo\">Carrera</label>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <select id=\"carrera\" name=\"carrera\" class=\"form-control\">\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-1 control-label\" for=\"Nombre\">Materia</label>  \n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <input id=\"carrera\" name=\"carrera\" type=\"text\" placeholder=\"Ingrese materia\" class=\"form-control input-md\" required=\"\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("            <!-- Botones  -->\n");
      out.write("            <br>\n");
      out.write("            <input class=\"btn btn-sm \" type=\"button\" value=\"NUEVO\" onclick=\"autonumerico()\" />\n");
      out.write("            <input class=\"btn btn-sm btn-success\" type=\"button\" value=\"INSERTAR\" onclick=\"amb(1)\"  />\n");
      out.write("            <input class=\"btn btn-sm btn-warning\" type=\"button\" value=\"MODIFICAR\" onclick=\"amb(2)\" />\n");
      out.write("            <input class=\"btn btn-sm btn-danger\" type=\"button\" value=\"ELIMINAR\" onclick=\"amb(3)\" />\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\">Buscar</span>\n");
      out.write("                <input id=\"filtrar\" type=\"text\" class=\"form-control\" placeholder=\"Ingresa su busqueda...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table-responsive\"> \n");
      out.write("                <table class=\"table table-hover table-condensed\" id=\"miTabla\" onclick=\"recuperar()\" >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <th>ID </th>\n");
      out.write("                            <th>CARRERA </th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody class=\"buscar\">\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>    \n");
      out.write("\n");
      out.write("        </section>\n");
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
