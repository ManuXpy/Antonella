<%-- 
    Document   : consulta
    Created on : 18-oct-2016, 20:00:04
    Author     : !mX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        HttpSession sessionActiva = request.getSession();
        if (sessionActiva.getAttribute("sessionON") == null) {
            response.sendRedirect("/Calificaciones/LoginAlumnos.html");
        }
    %>
    <head>
        <meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval};url=login-caducado.jsp">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Recursos/css/estilos.css">
        <link rel="stylesheet" href="Recursos/css/iconos.css">
        <link rel="stylesheet" href="Recursos/css/bootstrap.css">
        <link rel="stylesheet" href="Recursos/css/menu.css">
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/bootstrap.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>
        <script src="Operaciones/OperacionConsulta.js"></script>
        <title>Consulta</title>
    </head>
    <body>
        <section>
            <div class="page-header">
                <h1> ${sessionScope.sessionON} <small>Calificaciones</small></h1></div>

            <%-- inicio div Dinamico de carreras  --%>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <strong>Carreras</strong>
                </div>

                <div class="panel-body">

                </div>
            </div>    

            <div class="col-md-4" style="display:none">
                <input id="codigo" name="codigo" type="text" class="form-control input-md">
            </div>
            <%-- fin div Dinamico de carreras  --%>
            <%--
                        <script>
                            $('.btn-addDiv').click(function (event) {
                                $('.panel .panel-body').append('<div class="list-group"><a href="#" class="list-group-item"><strong>INFORMATICA</strong></a></div>');
                            });
                        </script>
            --%>
            <div>
                <a href="outAlumnos.jsp" class="btn btn-primary pull-right">
                    <span>SALIR</span>
                </a>
            </div>
        </section>
        <script>
            var ci = ${sessionScope.sessionON};
            var codigo = ${sessionScope.sessionON};
        </script>
    </body>
</html>
