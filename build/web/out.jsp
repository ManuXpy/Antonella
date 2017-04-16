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
        <script language="JavaScript">
            function redireccionar() {
                setTimeout("location.href='http:login.html'", 2000);
            }
        </script>
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
            <div class="alert alert-success text-center" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Atencion!</strong> Te has desconectado
            </div>
        </section>
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/jquery.js"></script>
        <script src="Recursos/js/jquery.backstretch.min.js"></script>
        <script src="Recursos/js/ImagenFondo.js"></script>

    </body>

</html>
