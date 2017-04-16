package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.sf.jasperreports.engine.*;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import Genericos.Conexion;
import java.sql.*;

public final class reporteCalificaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/pdf;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    HttpSession sessionActiva = request.getSession();
    if (sessionActiva.getAttribute("sessionON") == null) {
        response.sendRedirect("/Calificaciones/login.html");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Conexion cn = new Conexion();
    File reporFile = new File(application.getRealPath("/Reportes/Calificaciones.jasper"));
    Map parameters = new HashMap();
    parameters.put("ci_alumno", (request.getParameter("ci_alumno")));
    byte[] bytes = JasperRunManager.runReportToPdf(reporFile.getPath(), parameters, cn.getConexion());
    response.setContentLength(bytes.length);
    ServletOutputStream outputStream = response.getOutputStream();
    outputStream.write(bytes, 0, bytes.length);
    outputStream.flush();
    outputStream.close();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- parameters.put(\"ci_alumno\", Integer.parseInt(request.getParameter(\"ci_alumno\"))); --!>");
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
