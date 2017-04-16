<%-- 
    Document   : Perfiles
    Created on : Jun 7, 2016, 11:58:21 AM
    Author     : ManuXpy
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
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/bootstrap.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/bootstrapValidator.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>
        <title>Perfiles</title>

    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <section>

            <form class="form-horizontal" id="defaultForm">
                <fieldset>
                    <!-- Form Name -->
                    <legend>Perfiles</legend>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-1 control-label" for="codigo">Codigo</label>  
                        <div class="col-md-4">
                            <input id="codigo" name="codigo" type="text" placeholder="" class="form-control input-md" required="" onkeydown="
                                    if (event.keyCode === 13) {
                                        listarSegunFiltro();
                                    }
                                   ">

                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-1 control-label" for="descripcion">Tipo</label>  
                        <div class="col-md-4">
                            <input id="descripcion" name="descripcion" type="text" placeholder="Ingrese la descripcion" class="form-control input-md" required="" autofocus>

                        </div>
                    </div>

                </fieldset>
            </form>
            <!-- Botones  -->
            <br>
            <input class="btn btn-sm " type="button" value="NUEVO" onclick="autonumerico()" />
            <input class="btn btn-sm btn-success" type="button" value="INSERTAR" onclick="amb(1)"  />
            <input class="btn btn-sm btn-warning" type="button" value="MODIFICAR" onclick="amb(2)" />
            <input class="btn btn-sm btn-danger" type="button" value="ELIMINAR" onclick="amb(3)" />
            <br><br>
            <div class="input-group">
                <span class="input-group-addon">Buscar</span>
                <input id="filtrar" type="text" class="form-control" placeholder="Ingresa su busqueda...">
            </div>
            <div class="table-responsive"> 
                <table class="table table-hover table-condensed" id="miTabla" onclick="recuperar()" >
                    <thead>
                        <tr class="info">
                            <th>CODIGO </th>
                            <th>TIPO </th>
                        </tr>
                    </thead>
                    <tbody class="buscar">
                    </tbody>
                </table>
            </div>    

        </section>
    </body>
</html>
