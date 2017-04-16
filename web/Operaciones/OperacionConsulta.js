/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#codigo").val(ci);
    $("#ci").val(ci);
    CarrerasFiltroCI();
});

function crearJSON(id) {
    datosJSON = {
        "opcion": id,
        "codigo": $('#codigo').val(),
        "carrera": $('#carrera').val(),
        "ci": $('#ci').val()
    };
}


function  CarrerasFiltroCI() {
    crearJSON(1);
    $.ajax({
        url: "/Calificaciones/ConsultaServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $.each(resp, function (indice, value) {
                $("#carrera").val(value.nombre_carrera);
                $("#carrera").focus();
                $('.panel .panel-body').append('<div class="list-group"><a href="reporteCalificaciones.jsp?ci_alumno=' + ci + '&id_carrera=' + value.id_carrera + '" target="_blank" class="list-group-item"><strong>  ' + value.nombre_carrera + '  </strong></a></div>');
            });
            return true;
        }
    });
}
