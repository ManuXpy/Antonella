<%-- 
    Document   : cali
    Created on : 30-oct-2016, 4:17:31
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
        <script src="Recursos/js/main.js"></script>
        <script src="Recursos/js/bootstrap.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/bootstrapValidator.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script> 
        <script src="Recursos/js/bootstrap-datepicker.js"></script>
        <script src="Operaciones/OperacionesPuntajes.js"></script>
        <script src="Operaciones/BuscadorGanericoModal.js"></script>
        <script src="Validadores/VPuntajes.js"></script>
        <script type="text/javascript">
            // Solo permite ingresar numeros.
            function soloNumeros(e) {
                var key = window.Event ? e.which : e.keyCode;
                return ((key >= 48 && key <= 57) || (key === 8));
            }
        </script>

        <title>Carreras</title>
    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <%@ include file="BuscadorGenerico.jsp"%>
        <section>
            <%@ include file="alertas.jsp"%>

            <form class="form-horizontal"  id="defaultForm">
                <fieldset>
                    <!-- Form Name -->
                    <legend>Calificaciones</legend>
                    <!-- Panel Alumno -->
                    <div class="panel panel-primary"> 
                        <div class="panel-heading">Datos Alumno</div>
                        <div class="panel-body"> 
                            <div class="col-xs-12 col-xs-12 input-group input-group-sm" >
                                <span class="input-group-addon" id="basic-addon1">ID Calificacion</span>
                                <input id="codigo" name="codigo" type="text" class="form-control" aria-describedby="basic-addon1" placeholder="Ingrese ID o Presione F4" onKeyPress="return soloNumeros(event)"
                                       onkeydown="
                                               if (event.keyCode === 115) {
                                                   modal();
                                               }
                                               if (event.keyCode === 13) {
                                                   listarSegunFiltro();
                                               }
                                       ">



                                <span class="input-group-addon" id="basic-addon1">Alumno ID</span>
                                <input id="codigoAlu" name="codigoAlu" type="text" class="form-control" aria-describedby="basic-addon1" placeholder="Ingrese ID o Presione F4" onKeyPress="return soloNumeros(event)"
                                       onkeydown="
                                               if (event.keyCode === 115) {
                                                   modal();
                                               }
                                               if (event.keyCode === 13) {
                                                   filtrocedula();
                                               }
                                       ">
                                <span class="input-group-addon" id="basic-addon1">Alumno Codigo</span>
                                <input id="codigo2" name="codigo2" type="text" class="form-control" aria-describedby="basic-addon1" disabled>
                                <span class="input-group-addon" id="basic-addon1">Cedula</span>
                                <input id="ci" name="ci" type="text" class="form-control" aria-describedby="basic-addon1" disabled>
                            </div>
                            <br>
                            <div class="col-xs-12 col-xs-12 input-group input-group-sm">
                                <span class="input-group-addon" id="basic-addon1">Nombre</span>
                                <input id="nombre" name="nombre" type="text" class="form-control" aria-describedby="basic-addon1" disabled>
                                <span class="input-group-addon" id="basic-addon1">Apellido</span>
                                <input id="apellido" name="apellido" type="text" class="form-control" aria-describedby="basic-addon1" disabled>
                            </div>
                        </div>
                    </div>

                    <!-- Panel Carreras -->
                    <div class="panel panel-primary">
                        <div class="panel-heading">Datos Carrera y Materia</div>
                        <div class="panel-body">


                            <div class="col-xs-12 col-xs-12 input-group input-group-sm">
                                <span class="input-group-addon">Carrera</span>
                                <!-- Select Basic -->
                                <select id="carrera" name="carrera" class="form-control">

                                </select>


                                <span class="input-group-addon">Materia</span>
                                <!-- Select Basic -->
                                <select id="materia" name="materia" class="form-control">

                                </select>


                                <span class="input-group-addon">Año</span>
                                <!-- Select Basic -->
                                <select id="anho" name="anho" class="form-control">

                                </select>


                                <span class="input-group-addon">Usuario</span>
                                <!-- Select Basic -->
                                <select id="usuario" name="usuario" class="form-control" >
                                    <option value="${sessionScope.sessionON}">${sessionScope.sessionON}</option>
                                </select>

                            </div>
                        </div>
                        <!-- Panel Productos -->
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">Calificaciones</div>
                        <div class="panel-body">
                            <div class="col-xs-12 col-xs-12 input-group input-group-sm">
                                <span class="input-group-addon" id="basic-addon1">Trabajo Practico</span>
                                <input id="tp" name="tp" type="text" class="form-control" aria-describedby="basic-addon1" onKeyPress="return soloNumeros(event)">
                                <span class="input-group-addon" id="basic-addon1">Examen Parcial</span>
                                <input id="ep" name="ep" type="text" class="form-control" aria-describedby="basic-addon1" onKeyPress="return soloNumeros(event)">
                                <span class="input-group-addon" id="basic-addon1">Examen Final</span>
                                <input id="final" name="final" type="text" class="form-control" aria-describedby="basic-addon1" onKeyPress="return soloNumeros(event)"
                                       onkeydown="
                                               if (event.keyCode === 13) {
                                                   agregar();
                                               }
                                       ">      
                            </div>
                        </div>
                    </div>
                </fieldset>
            </form>

            <div class="panel panel-danger">
                <div class="panel-heading">Informacion General</div>
                <div class="panel-body">

                    <div class="col-xs-12 col-xs-12 input-group input-group-sm">
                        <span class="input-group-addon">Trabajo Practico</span>
                        <input class="form-control" id="trabajoP" name="trabajoP" type="text" placeholder="" disabled>
                        <span class="input-group-addon">Examen Parcial</span>
                        <input class="form-control" id="parcial" name="parcial" type="text" placeholder="" disabled>
                        <span class="input-group-addon">Examen Final</span>
                        <input class="form-control" id="efinal" name="efinal" type="text" placeholder="" disabled>
                    </div><br>

                    <div class="col-xs-5 col-xs-offset-7 input-group input-group-sm">
                        <span class="input-group-addon">Puntaje Total</span>
                        <input class="form-control" id="total" name="total" type="text" placeholder="" disabled>
                    </div>
                    <p class="text-danger">Opciones</p>
                    <input class="btn btn-sm " type="button" value="NUEVO" onclick="autonumerico()" />
                    <input class="btn btn-sm btn-success" type="button" value="INSERTAR" id="INSERTAR" onclick="amb(1)"/>
                    <input class="btn btn-sm btn-warning" type="button" value="MODIFICAR" id="MODIFICAR"  onclick="amb(2)"/>
                    <input class="btn btn-sm btn-danger" type="button" value="ELIMINAR" onclick="amb(3)" />
                    <input class="btn btn-sm btn-info" type="button" value="VALIDAR CAMPOS"  onclick="Validar()" />
                </div>
            </div>
            <div>
                <span class="label label-default">* F4 para utilizar el buscador</span>
            </div>

            <div class="table-responsive"style="display:none"> 
                <table class="table table-hover table-condensed" id="miTabla" onclick="recuperar()" >
                    <thead>
                        <tr class="info">
                            <th>Materia </th>
                            <th>ID Alumno </th>
                            <th>ID Puntaje </th>
                        </tr>
                    </thead>
                    <tbody class="buscar">
                    </tbody>
                </table>
            </div> 

            <script>
                document.getElementById('INSERTAR').disabled = true;
                document.getElementById('usuario').disabled = true;
            </script>
        </section>
    </body>
</html>
