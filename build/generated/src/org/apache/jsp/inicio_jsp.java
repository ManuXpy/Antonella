package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.session.maxInactiveInterval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";url=login-caducado.jsp\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/iconos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap.css\">\n");
      out.write("        <script src=\"Recursos/js/jquery.js\"></script>\n");
      out.write("       \n");
      out.write("        <script src=\"Operaciones/Operaciones_V_Calificaciones.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .size-40 { font-size: 40px; }\n");
      out.write("            .table-responsive {height: auto; max-width: 1080px;}\n");
      out.write("            .resaltar{background-color:#FF0;}\n");
      out.write("        </style>\n");
      out.write("        <title>Sistema Calificaciones UPE</title>\n");
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
      out.write("            <form class=\"form-horizontal\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <!-- Cabecera -->\n");
      out.write("                    <legend>Sitema Calificaciones</legend>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <span>Bienvenido ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sessionON}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> \n");
      out.write("                        </li>\n");
      out.write("                    </ol>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <!-- Cuadros estadisticas -->\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-3\">\n");
      out.write("                                    <span class=\"step size-40\"><i class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-9 text-right\">                                    \n");
      out.write("                                    <div> <span id=\"alumno\" style=\"font-size:25px\"></span> </div>\n");
      out.write("                                    <div>Alumnos</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"alumnos.jsp\">\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <span class=\"pull-left\">Mas detalles</span>\n");
      out.write("                                <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-3\">\n");
      out.write("                                    <span class=\"step size-40\"><i class=\"pull-right hidden-xs showopacity glyphicon glyphicon-tags\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-9 text-right\">\n");
      out.write("                                    <div> <span id=\"carreras\" style=\"font-size:25px\"></span> </div>\n");
      out.write("                                    <div>Carreras</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"carreras.jsp\">\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <span class=\"pull-left\">Mas detalles</span>\n");
      out.write("                                <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-3\">\n");
      out.write("                                    <span class=\"step size-40\"><i class=\"pull-right hidden-xs showopacity glyphicon glyphicon-book\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-9 text-right\">\n");
      out.write("                                    <div> <span id=\"materias\" style=\"font-size:25px\"></span> </div>\n");
      out.write("                                    <div>Materias</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"materias.jsp\">\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <span class=\"pull-left\">Mas detalles</span>\n");
      out.write("                                <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Inicio Buscador y tabla  -->     \n");
      out.write("\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\">Buscar</span>\n");
      out.write("                <input id=\"filtrar\" type=\"text\" class=\"form-control\" placeholder=\"Ingrese su busqueda...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"table table-hover table-condensed with-pager\" id=\"miTabla\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"info\">\n");
      out.write("                                    <th>CI</th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Apellido</th>\n");
      out.write("                                    <th>Carrera</th>\n");
      out.write("                                    <th>Materia</th>\n");
      out.write("                                    <th>Puntaje</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"myTable\" class=\"buscar\">\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>  \n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"pager\">\n");
      out.write("                                <li class=\"previous\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <span aria-hidden=\"true\">&larr;</span> \n");
      out.write("                                        Anterior\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"next\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Siguiente \n");
      out.write("                                        <span aria-hidden=\"true\">&rarr;</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"Recursos/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/ImagenFondo.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/Buscador.js\"></script>\n");
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
