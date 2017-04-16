package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cali_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Carreras</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/iconos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Recursos/css/bootstrap-datepicker.css\">\n");
      out.write("        <script src=\"Recursos/js/jquery.js\"></script>\n");
      out.write("        <script src=\"Recursos/js/main.js\"></script>\n");
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
      out.write("\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" id=\"defaultForm\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <!-- Form Name -->\n");
      out.write("                    <legend>Ventas</legend>\n");
      out.write("                    <!-- Panel Cliente -->\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">Datos Cabecera</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Codigo</span>\n");
      out.write("                                <input id=\"codigo\" name=\"codigo\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Numero Factura</span>\n");
      out.write("                                <input id=\"factura\" name=\"factura\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\"></span>\n");
      out.write("                                <input id=\"nrofactura\" name=\"nrofactura\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">fecha</span>                                 \n");
      out.write("                                <input id=\"fecha\" name=\"fecha\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Usuario</span>\n");
      out.write("                                <input id=\"usuario\" name=\"usuario\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\">Tipo facrura</span>\n");
      out.write("                                <!-- Select Basic -->\n");
      out.write("                                <select id=\"ftipo\" name=\"ftipo\" class=\"form-control\">\n");
      out.write("                                    <option value=\"CONTADO\">CONTADO</option>\n");
      out.write("                                    <option value=\"CREDITO\">CREDITO</option>\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"input-group-addon\">Intervalo</span>\n");
      out.write("                                <input id=\"intervalo\" name=\"intervalo\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                                <span class=\"input-group-addon\">Cuotas</span>\n");
      out.write("                                <input id=\"cuota\" name=\"cuota\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                                <span class=\"input-group-addon\">Deposito</span>\n");
      out.write("                                <input id=\"deposito\" name=\"deposito\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Panel Cliente -->\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">Datos Cliente</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Cliente ID</span>\n");
      out.write("                                <input id=\"cliente\" name=\"cliente\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" placeholder=\"F4 o digite el codigo\" onkeydown=\"\n");
      out.write("                                        if (event.keyCode === 115) {\n");
      out.write("                                            modal();\n");
      out.write("                                        }\n");
      out.write("                                        if (event.keyCode === 13) {\n");
      out.write("                                            getCliente();\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("                                       \">\n");
      out.write("                                <span class=\"input-group-addon\">Cliente</span>\n");
      out.write("                                <input id=\"clientedes\" name=\"clientedes\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                                <span class=\"input-group-addon\">Vendedor ID</span> \n");
      out.write("                                <input id=\"vendedor\" name=\"vendedor\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" placeholder=\"F4 o digite el codigo\" onkeydown=\"\n");
      out.write("                                        if (event.keyCode === 115) {\n");
      out.write("                                            modal();\n");
      out.write("                                        }\n");
      out.write("                                        if (event.keyCode === 13) {\n");
      out.write("                                            getVendedor();\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("                                       \">\n");
      out.write("                                <span class=\"input-group-addon\">Vendedor</span> \n");
      out.write("                                <input id=\"vendedordes\" name=\"vendedordes\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Timbrado</span>\n");
      out.write("                                <input id=\"timbrado\" name=\"timbrado\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Numero Timbrado</span>\n");
      out.write("                                <input id=\"ntimbrado\" name=\"ntimbrado\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\">Apertura</span>\n");
      out.write("                                <input id=\"apertura\" name=\"apertura\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\">Descripcion</span>\n");
      out.write("                                <input id=\"napertura\" name=\"napertura\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Panel Productos -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">Productos</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\">ID</span>\n");
      out.write("                                <input id=\"idproducto\" name=\"idproducto\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" placeholder=\"F4 para ver buscador o digite el codigo\" onkeydown=\"\n");
      out.write("                                        if (event.keyCode === 115) {\n");
      out.write("                                            modal();\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("                                        if (event.keyCode === 13) {\n");
      out.write("                                            getProducto();\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("                                       \">\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Producto</span>\n");
      out.write("                                <input id=\"producto\" name=\"producto\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                                <span class=\"input-group-addon\">Cantidad</span>\n");
      out.write("                                <input id=\"cantidad\" name=\"cantidad\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" placeholder=\"Ingrese la Cantidad\" onkeydown=\"\n");
      out.write("                                        if (event.keyCode === 13) {\n");
      out.write("                                            agregarFila();\n");
      out.write("                                        }\n");
      out.write("                                       \">      \n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Precio</span>\n");
      out.write("                                <input id=\"precio\" name=\"precio\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\">Exenta</span>\n");
      out.write("                                <input id=\"exenta\" name=\"exenta\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\">Grava.5%</span>\n");
      out.write("                                <input id=\"grava5\" name=\"grava5\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                                <span class=\"input-group-addon\">Grava.10%</span>\n");
      out.write("                                <input id=\"grava10\" name=\"grava10\" type=\"text\" class=\"form-control\" aria-describedby=\"basic-addon1\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-warning\">\n");
      out.write("                <div class=\"panel-heading\">Detalle Productos</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"table-responsive\" > \n");
      out.write("                        <table class=\"table table-hover table-condensed\" id=\"tablaDetalleInsumos\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID Mercaderia</th>\n");
      out.write("                                    <th>Mercaderia</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Precio Uni.</th>\n");
      out.write("                                    <th>Exenta</th>\n");
      out.write("                                    <th>Grav.5%</th>\n");
      out.write("                                    <th>Grav.10%</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"table_deta\">\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">Informacion General</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    \n");
      out.write("                                        <div class=\"col-xs-12 col-xs-12 input-group input-group-sm\">\n");
      out.write("                                            <span class=\"input-group-addon\">IVA 5%</span>\n");
      out.write("                                            <input class=\"form-control\" id=\"5\" type=\"text\" placeholder=\"\" disabled>\n");
      out.write("                                            <span class=\"input-group-addon\">IVA 10%</span>\n");
      out.write("                                            <input class=\"form-control\" id=\"10\" type=\"text\" placeholder=\"\" disabled>\n");
      out.write("                                            <span class=\"input-group-addon\">Sub-Total</span>\n");
      out.write("                                            <input class=\"form-control\" id=\"stotal\" type=\"text\" placeholder=\"\" disabled>\n");
      out.write("                                        </div><br>\n");
      out.write("                   \n");
      out.write("                    <div class=\"col-xs-5 col-xs-offset-7 input-group input-group-sm\">\n");
      out.write("                        <span class=\"input-group-addon\">Total a Pagar</span>\n");
      out.write("                        <input class=\"form-control\" id=\"total\" type=\"text\" placeholder=\"\" disabled>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"text-danger\">Opciones</p>\n");
      out.write("                    <input class=\"btn btn-sm btn-info\" type=\"button\" value=\"NUEVO\" onclick=\"nuevaFactura()\" />\n");
      out.write("                    <input class=\"btn btn-sm btn-success\" type=\"button\" value=\"GUARDAR\" onclick=\"insertarJsonCabecera()\" />\n");
      out.write("                    <input class=\"btn btn-sm btn-danger\" type=\"button\" value=\"ANULAR\" onclick=\"\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
