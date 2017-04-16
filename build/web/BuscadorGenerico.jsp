<%-- 
    Document   : BuscadorGenerico
    Created on : Jun 9, 2016, 2:36:39 AM
    Author     : ManuXpy
--%>


<!--
<button type="button" class="btn btn-sm btn-info" data-toggle="modal" data-target="#myModal">Buscar</button>
<!-- Modal -->


<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
        <!-- Modal content-->
        <div class="modal-content modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Buscador</h4>
            </div>
            <div class="modal-body">

                <div class="input-group">
                    <span class="input-group-addon">Buscar</span>
                    <input class="form-control" type="text" id="filtrarGenerico" placeholder="Ingrese Descripcion a Buscar"/>
                </div>
                <div id="buscarRegistro">
                </div><br>
                <button class="btn btn-sm btn-info" onclick="listaBuscadores(1)"> Buscador ID Calificaciones</button>
                <button class="btn btn-sm btn-info" onclick="listaBuscadores(2)"> Buscador ID Alumno</button>
               
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
    </div>
</div>





