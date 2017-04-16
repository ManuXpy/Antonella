<%-- 
    Document   : login
    Created on : 01-oct-2016, 4:30:47
    Author     : !mX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Recursos/css/normalize.css">
        <link rel='stylesheet prefetch' href=Recursos/css/bootstrap.css>
        <link rel="stylesheet" href="Recursos/css/style.css">
        <title>Seccion Caducada</title>
    </head>
    <body>
        <%@ include file="Seccionterminada.jsp"%>
        <div class="container login-form">
            <img style="margin:0px auto;display:block" src="Recursos/img/upe_logo.png"/>
            <div class="panel panel-default">
                <div class="panel-body">
                    <form action="AccesoControl" method="POST">
                        <div class="input-group login-userinput">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                            <input id="txtUser" type="text" class="form-control" name="username" placeholder="Usuario">
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                            <input  id="txtPassword" type="password" class="form-control" name="password" placeholder="Contraseña">
                            <span id="showPassword" class="input-group-btn">
                                <button class="btn btn-default reveal" type="button"><i class="glyphicon glyphicon-eye-open"></i></button>
                            </span>
                        </div>
                        <button class="btn btn-primary btn-block login-button" type="submit"><i class="fa fa-sign-in"></i>Entrar</button>
                    </form>
                </div>
            </div>
        </div>

        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>
        <script src="Validadores/login.js"></script>
    </body>
</html>
