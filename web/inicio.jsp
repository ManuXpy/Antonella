<%-- 
    Document   : inicio
    Created on : 27-sep-2016, 22:44:36
    Author     : !mX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%

        HttpSession sessionActiva = request.getSession();
        if (sessionActiva.getAttribute("sessionON") == null) {
            response.sendRedirect("/Calificaciones/login.html");
        }
    %>
    <head>
        <meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval};url=login-caducado.jsp">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Recursos/css/menu.css">
        <link rel="stylesheet" href="Recursos/css/estilos.css">
        <link rel="stylesheet" href="Recursos/css/iconos.css">
        <link rel="stylesheet" href="Recursos/css/bootstrap.css">
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/bootstrap.js"></script>
        <script src="Operaciones/Operaciones_V_Calificaciones.js"></script>
        <style>
            .size-40 { font-size: 40px; }
            .table-responsive {height: auto; max-width: 1080px;}
            .resaltar{background-color:#FF0;}
        </style>
        <title>Sistema Calificaciones</title>
    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <section>
            <form class="form-horizontal">
                <fieldset>
                    <!-- Cabecera -->
                    <legend>Sitema Calificaciones</legend>
                    <ol class="breadcrumb">
                        <li class="active">
                            <span>Bienvenido  ${sessionScope.sessionON}</span>
                        </li>
                    </ol>
                </fieldset>
            </form>

            <!-- Cuadros estadisticas -->

            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <span class="step size-40"><i class="pull-right hidden-xs showopacity glyphicon glyphicon-user"></i></span>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div> <span id="alumno" style="font-size:25px"></span> </div>
                                    <div>Alumnos</div>
                                </div>
                            </div>
                        </div>
                        <a href="alumnos.jsp">
                            <div class="panel-footer">
                                <span class="pull-left">Mas detalles</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <span class="step size-40"><i class="pull-right hidden-xs showopacity glyphicon glyphicon-tags"></i></span>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div> <span id="carreras" style="font-size:25px"></span> </div>
                                    <div>Carreras</div>
                                </div>
                            </div>
                        </div>
                        <a href="carreras.jsp">
                            <div class="panel-footer">
                                <span class="pull-left">Mas detalles</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <span class="step size-40"><i class="pull-right hidden-xs showopacity glyphicon glyphicon-book"></i></span>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div> <span id="materias" style="font-size:25px"></span> </div>
                                    <div>Materias</div>
                                </div>
                            </div>
                        </div>
                        <a href="materias.jsp">
                            <div class="panel-footer">
                                <span class="pull-left">Mas detalles</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>

            <!-- Inicio Buscador y tabla  -->

            <div class="input-group">
                <span class="input-group-addon">Buscar</span>
                <input id="filtrar" type="text" class="form-control" placeholder="Ingrese su busqueda...">
            </div>
            <div class="container">
                <div class="row">
                    <div class="table-responsive">
                        <table class="table table-hover table-condensed with-pager" id="miTabla">
                            <thead>
                                <tr class="info">
                                    <th>CI</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Carrera</th>
                                    <th>Materia</th>
                                    <th>Puntaje</th>
                                </tr>
                            </thead>
                            <tbody id="myTable" class="buscar">
                            </tbody>
                        </table>
                        <nav>
                            <ul class="pager">
                                <li class="previous">
                                    <a href="#">
                                        <span aria-hidden="true">&larr;</span>
                                        Anterior
                                    </a>
                                </li>
                                <li class="next">
                                    <a href="#">
                                        Siguiente
                                        <span aria-hidden="true">&rarr;</span>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>
        <script src="Recursos/js/Buscador.js"></script>
    </body>
</html>
