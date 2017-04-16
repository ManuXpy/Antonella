<%-- 
    Document   : menu
    Created on : 21-sep-2016, 14:24:34
    Author     : ManuXpy
--%>

<nav class="navbar navbar-default sidebar" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-sidebar-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="bs-sidebar-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="inicio.jsp">Inicio<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-home"></span></a></li>
                <li ><a href="alumnos.jsp">Alumnos<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-user"></span></a></li>
                <li ><a href="carreras.jsp">Carreras<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-tags"></span></a></li>
                <li ><a href="materias.jsp">Materias<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-book"></span></a></li>
                <li ><a href="calificaciones.jsp">calificaciones<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-bookmark"></span></a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Reportes <span class="caret"></span><span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-th-list"></span></a>
                    <ul class="dropdown-menu forAnimate" role="menu">
                        <li><a href="reporteAlumnos.jsp" target="_blank">Alumnos</a></li>
                        <li><a href="reporteCarreras.jsp" target="_blank">Carreras</a></li>
                        <li><a href="reporteMaterias.jsp" target="_blank">Materias</a></li>

                    </ul>
                </li>
                <li ><a href="#">Usuarios<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-exclamation-sign"></span></a></li>
                <li ><a href="out.jsp">Salir<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-log-out"></span></a></li>
                        <%--  <li ><a href="reporteCalificaciones.jsp?ci_alumno=7749742&id_carrera=1" target="_blank">Ejemplo<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-exclamation-sign"></span></a></li> --%>       
            </ul>
        </div>
    </div>
</nav>

