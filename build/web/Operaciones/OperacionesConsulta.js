/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $(":text").val("");
});

function imprimirConsulta() {
    codigo = $('#txtci').val();
    var url = $(this).attr('href');
    window.open("reporteCalificaciones.jsp?ci_alumno=" + codigo + "  ", '_blank');
    location.reload();
//    codigo = $('#txtci').val();
//    location.href = "reporteCalificaciones.jsp?ci_alumno=" + codigo + "  ";

}

