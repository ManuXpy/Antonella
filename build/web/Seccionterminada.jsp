<%-- 
    Document   : out
    Created on : 20-jun-2016, 17:39:50
    Author     : ManuXpy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%session.invalidate();%>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Recursos/css/normalize.css">
        <link rel='stylesheet prefetch' href=Recursos/css/bootstrap.css>
        <link rel="stylesheet" href="Recursos/css/style.css">
        <style>
            body section {
                margin-left: auto;
                margin-right: auto;
                max-width: 600px;
            }
        </style>
        <title>Saliendo</title>
    </head>
    <body onLoad="redireccionar()">
        <section>
            <div class="alert alert-info text-center" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
                <strong>Atencion!</strong> La seccion a caducado
            </div>
        </section>
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>

    </body>

</html>
