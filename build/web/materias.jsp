<%-- 
    Document   : materias
    Created on : 29-oct-2016, 19:16:42
    Author     : !mX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <%
        HttpSession sessionActiva = request.getSession();
        if (sessionActiva.getAttribute("sessionON") == null) {
            response.sendRedirect("/Calificaciones/login.html");
        }
    %>
    <head>
        <meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval};url=login-caducado.jsp">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Recursos/css/estilos.css">
        <link rel="stylesheet" href="Recursos/css/iconos.css">
        <link rel="stylesheet" href="Recursos/css/bootstrap.css">
        <link rel="stylesheet" href="Recursos/css/menu.css">
        <link rel="stylesheet" href="Recursos/css/bootstrap-datepicker.css">
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/bootstrap.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/bootstrapValidator.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script> 
        <script src="Recursos/js/bootstrap-datepicker.js"></script>
        <script src="Operaciones/OperacionesMaterias.js"></script>
        <script src="Recursos/js/Buscador.js"></script>
        <script src="Validadores/Vmaterias.js"></script>
        <style>
            .table-responsive {height: auto; max-width: 1075px;}
            .resaltar{background-color:#FF0;}
        </style>
        <title>Materias</title>
    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <section>
            <%@ include file="alertas.jsp"%>
            <form class="form-horizontal" id="defaultForm">
                <fieldset>
                    <!-- Form Name -->
                    <legend>Materias</legend>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-1 control-label" for="codigo">ID</label>  
                        <div class="col-md-4">
                            <input id="codigo" name="codigo" type="text" placeholder="ID" class="form-control input-md" required=""  autofocus onkeydown="
                                    if (event.keyCode === 13) {
                                        listarSegunFiltro();
                                    }
                                   ">
                        </div>
                        <span class="label label-default">Validar</span>
                    </div>
                    <!-- Select Basic -->
                    <div class="form-group">
                        <label class="col-md-1 control-label" for="carrera">Carrera</label>
                        <div class="col-md-4">
                            <select id="carrera" name="carrera" class="form-control">
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-1 control-label" for="materia">Materia</label>  
                        <div class="col-md-4">
                            <input id="materia" name="materia" type="text" placeholder="Ingrese materia" class="form-control input-md" required="" >
                        </div>
                        <span class="label label-default">Validar</span>
                    </div>

                    <!-- Select Basic -->
                    <select id="usuario" name="usuario" class="form-control"  style="display:none">
                        <option value="${sessionScope.sessionON}">${sessionScope.sessionON}</option>
                    </select> 

                </fieldset>
            </form>
            <!-- Botones  -->
            <br>
            <input class="btn btn-sm " type="button" value="NUEVO" onclick="autonumerico()" />
            <input class="btn btn-sm btn-success" type="button" value="INSERTAR" id="INSERTAR" onclick="amb(1)"/>
            <input class="btn btn-sm btn-warning" type="button" value="MODIFICAR" id="MODIFICAR"  onclick="amb(2)"/>
            <input class="btn btn-sm btn-danger" type="button" value="ELIMINAR" onclick="amb(3)" />
            <input class="btn btn-sm btn-info" type="button" value="VALIDAR CAMPOS"  onclick="Validar()" />
            <br><br>
            <div class="input-group">
                <span class="input-group-addon">Buscar</span>
                <input id="filtrar" type="text" class="form-control" placeholder="Ingresa su busqueda...">
            </div>
            <div class="container">
                <div class="row">
                    <div class="table-responsive">
                        <table class="table table-hover table-condensed with-pager" id="miTabla" onclick="recuperar()">
                            <thead>
                                <tr class="info">
                                    <th>ID</th>
                                    <th>Materia</th>
                                    <th>Carrera</th>
                                    <th>ID Carrera</th>
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
        <script>
            document.getElementById('INSERTAR').disabled = true;
        </script>
    </body>
</html>
