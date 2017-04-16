/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    allCalificaciones();
    getAlumnos();
    getCarreras();
    getMaterias();
});
function crearJSON(id) {
    datosJSON = {
        "opcion": id,
        "id_alumno": $('#id_alumno').val(),
        "cod_alumno": $('#cod_alumno').val(),
        "nombres_alumno": $('#nombres_alumno').val(),
        "apellidos_alumno": $('#apellidos_alumno').val(),
        "nombre_asignatura": $('#nombre_asignatura').val(),
        "nombre_carrera": $('#nombre_carrera').val(),
        "t_alumnos_id_alumno": $('#t_alumnos_id_alumno').val(),
        "t_carreras_id_carrera": $('#t_carreras_id_carrera').val(),
        "id_asignatura": $('#id_asignatura').val(),
        "t_anho_id_anho": $('#t_anho_id_anho').val(),
        "puntaje_tp": $('#puntaje_tp').val(),
        "puntaje_ep": $('#puntaje_ep').val(),
        "puntaje_ef": $('#puntaje_ef').val(),
        "puntaje_total": $('#puntaje_total').val(),
        "id_carrera": $('#id_carrera').val(),
        "ci_alumno": $('#ci_alumno').val(),
        "fecha_nac_alumno": $('#fecha_nac_alumno').val()

    };
}



function allCalificaciones() {

    crearJSON(1);
    $.ajax({
        url: "/Calificaciones/V_CalificacionesServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (resp) {
            $.each(resp, function (indice, value) {
                paginar();
                $("#miTabla").append($("<tr>").append($("<td>" + value.ci_alumno + "</td>" +
                        "<td>" + value.nombres_alumno + "</td>" +
                        "<td>" + value.apellidos_alumno + "</td>" +
                        "<td>" + value.nombre_carrera + "</td>" +
                        "<td>" + value.nombre_asignatura + "</td>" +
                        "<td>" + value.puntaje_total + "</td>")));
            });
        }
    });
}

function  getAlumnos() {

    crearJSON(2);
    $.ajax({
        //url: "cargoControl",
        url: "/Calificaciones/V_CalificacionesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            document.getElementById("alumno").innerHTML = resp;
        }
    });
}


function  getCarreras() {
    crearJSON(3);
    $.ajax({
        //url: "cargoControl",
        url: "/Calificaciones/V_CalificacionesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            document.getElementById("carreras").innerHTML = resp;
        }
    });
}

function  getMaterias() {
    crearJSON(4);
    $.ajax({
        //url: "cargoControl",
        url: "/Calificaciones/V_CalificacionesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            //alert(resp);
            document.getElementById("materias").innerHTML = resp;
        }
    });
}


function paginar() {
    $('table.with-pager').each(function () {
        var $table = $(this);
        var $nextPage = $('.pager .next');
        var $previousPage = $('.pager .previous');

        var currentPage = 0;
        var numPerPage = 17;

        var numRows = 0;
        var numPages = 0;

        $table.bind('repaginate', function () {
            numRows = $table.find('tbody tr').length;
            numPages = Math.ceil(numRows / numPerPage);

            $table.find('tbody tr').hide().slice(currentPage * numPerPage, (currentPage + 1) * numPerPage).show();

            if (currentPage === 0) {
                $previousPage.addClass('disabled');
            } else {
                $previousPage.removeClass('disabled');
            }

            if (currentPage === numPages - 1) {
                $nextPage.addClass('disabled');
            } else {
                $nextPage.removeClass('disabled');
            }
        });

        $table.trigger('repaginate');

        $previousPage.bind('click', function (event) {
            if (currentPage !== 0) {
                currentPage--;
                $table.trigger('repaginate');
            }
        });

        $nextPage.bind('click', function (event) {
            if (currentPage !== numPages - 1) {
                currentPage++;
                $table.trigger('repaginate');
            }
        });
    });
}
;

function imprimirReporte()
{
    codigo = $('#codigo').val();
    location.href = "imprimirFactura.jsp?ci_alumno=" + codigo + " ";

}


