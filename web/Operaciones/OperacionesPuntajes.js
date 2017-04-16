/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $(":text").val("");
    Combocarreras();
    ComboMaterias();
    ComboAno();
    allPuntajes();

});



function modal() {
    $('#myModal').modal('show');
}

function crearJSON(id) {
    datosJSON = {
        "opcion": id,
        "codigo": $('#codigo').val(),
        "codigoAlu": $('#codigoAlu').val(),
        "codigo2": $('#codigo2').val(),
        "nombre": $('#nombre').val(),
        "apellido": $('#apellido').val(),
        "ci": $('#ci').val(),
        "carrera": $('#carrera').val(),
        "materia": $('#materia').val(),
        "anho": $('#anho').val(),
        "tp": $('#tp').val(),
        "ep": $('#ep').val(),
        "final": $('#final').val(),
        "total": $('#total').val(),
        "usuario": $('#usuario').val()
    };
}


function  amb(id) {
    crearJSON(id);
    if (($("#codigo").val() === "") || ($("#codigoAlu").val() === "") || ($("#codigo2").val() === "") || ($("#nombrev").val() === "") || ($("#apellido").val() === "") ||
            ($("#ci").val() === "") || ($("#carrera").val() === "") || ($("#materia").val() === "") || ($("#anho").val() === "") || ($("#tp").val() === "") || ($("#ep").val() === "") || ($("#final").val() === "")) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
        document.getElementById('INSERTAR').disabled = true;
    } else {
        $.ajax({
            url: "/Calificaciones/PuntajesServlet",
            data: datosJSON,
            type: 'POST',
            dataType: 'text',
            success: function () {
                $("#exito").show();
                window.setTimeout(function () {
                    $("#exito").fadeTo(1500, 0).slideUp(500, function ()
                    {
                        $(this).remove();
                        location.reload();
                    });
                    $(":text").val("");
                }, 1100);
            },
            error: function () {
                $("#error").show();
                window.setTimeout(function () {
                    $("#error").fadeTo(1500, 0).slideUp(500, function () {
                        $(this).remove();
                        location.reload();
                    });
                }, 2000);
            }
        });
    }
}

function allPuntajes() {
    crearJSON(11);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (resp) {
            $.each(resp, function (indice, value) {

                $("#miTabla").append($("<tr>").append($("<td>" + value.t_asignatura_id_asignatura + "</td>" +
                        "<td>" + value.t_alumnos_id_alumno + "</td>" +
                        "<td>" + value.id_puntajes + "</td>")));
            });
        }
    });
}


function  autonumerico() {
    crearJSON(4);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $("#codigo").val(resp);
            $("#ci").focus();
        },
        error: function () {
            $("#errorultimocodigo").show();
            window.setTimeout(function () {
                $("#errorultimocodigo").fadeTo(1500, 0).slideUp(500, function () {
                    $(this).remove();
                });
            }, 1100);
        }
    });
}

function  listarSegunFiltro() {
    crearJSON(5);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $.each(resp, function (indice, value) {
                $("#codigo").val(value.id_puntajes);
                $("#codigoAlu").val(value.id_alumno);
                $("#codigo2").val(value.cod_alumno);
                $("#nombre").val(value.nombres_alumno);
                $("#apellido").val(value.apellidos_alumno);
                $("#ci").val(value.ci_alumno);
                $('#carrera> option[value=' + value.id_carrera + ']').attr('selected', 'selected');
                $('#materia> option[value=' + value.id_asignatura + ']').attr('selected', 'selected');
                $('#anho> option[value=' + value.t_anho_id_anho + ']').attr('selected', 'selected');
                $("#tp").val(value.puntaje_tp);
                $("#ep").val(value.puntaje_ep);
                $("#final").val(value.puntaje_ef);
                $("#tp").focus();
            });
            return true;
        },
        error: function () {
            $("#errorrecuperar").show();
            window.setTimeout(function () {
                $("#errorrecuperar").fadeTo(1500, 0).slideUp(500, function () {
                    $(this).remove();
                    location.reload();
                });
            }, 1100);
            return false;
        }
    });
}


function  filtrocedula() {
    crearJSON(6);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $.each(resp, function (indice, value) {
                $("#codigoAlu").val(value.id_alumno);
                $("#codigo2").val(value.cod_alumno);
                $("#nombre").val(value.nombres_alumno);
                $("#apellido").val(value.apellidos_alumno);
                $("#ci").val(value.ci_alumno);
            });
            return true;
        },
        error: function () {
            $("#errorrecuperar").show();
            window.setTimeout(function () {
                $("#errorrecuperar").fadeTo(1500, 0).slideUp(500, function () {
                    $(this).remove();
                    location.reload();
                });
            }, 1100);
            return false;
        }
    });
}

function Combocarreras() {
    crearJSON(7);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (data) {
            $.each(data, function (indice, value) {
                $("#carrera").append("<option value= \"" + value.id_carrera + "\"> " + value.nombre_carrera + "</option>");
            });
        }
    });
}


function ComboMaterias() {
    crearJSON(8);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (data) {
            $.each(data, function (indice, value) {
                $("#materia").append("<option value= \"" + value.id_asignatura + "\"> " + value.nombre_asignatura + "</option>");
            });
        }
    });
}

function ComboAno() {
    crearJSON(9);
    $.ajax({
        url: "/Calificaciones/PuntajesServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (data) {
            $.each(data, function (indice, value) {
                $("#anho").append("<option value= \"" + value.id_anho + "\"> " + value.descrip_anho + "</option>");
            });
        }
    });
}

function agregar() {

    var trabajoP = parseInt($("#tp").val());
    var parcial = parseInt($("#ep").val());
    var efinal = parseInt($("#final").val());
    var calculo = trabajoP + parcial + efinal;
    total = calculo;
    $('#trabajoP').val(trabajoP);
    $('#parcial').val(parcial);
    $('#efinal').val(efinal);
    $('#total').val(total);


}

function limpiarCampos() {
    $('#trabajoP').val(null);
    $('#parcial').val(null);
    $('#efinal').val(null);
    $('#precio').val(null);
    $('#total').val(null);
}

