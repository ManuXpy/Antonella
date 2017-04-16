<%
    HttpSession sessionActiva = request.getSession();
    if (sessionActiva.getAttribute("sessionON") == null) {
        response.sendRedirect("/Calificaciones/login.html");
    }
%>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="Genericos.Conexion"%>
<%@page import="java.sql.*"%>
<%@page contentType="application/pdf" pageEncoding="UTF-8"%>
<%
    Conexion cn = new Conexion();
    File reporFile = new File(application.getRealPath("/Reportes/Calificaciones.jasper"));
    Map parameters = new HashMap();

    parameters.put("ci_alumno" , (request.getParameter("ci_alumno")));
    parameters.put("id_carrera", Integer.parseInt(request.getParameter("id_carrera")));

    byte[] bytes = JasperRunManager.runReportToPdf(reporFile.getPath(), parameters, cn.getConexion());
    response.setContentLength(bytes.length);
    ServletOutputStream outputStream = response.getOutputStream();
    outputStream.write(bytes, 0, bytes.length);
    outputStream.flush();
    outputStream.close();
%>



<!-- parameters.put("ci_alumno", Integer.parseInt(request.getParameter("ci_alumno"))); --!>

  