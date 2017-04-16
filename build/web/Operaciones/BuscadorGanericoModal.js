/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

    (function ($) {
        $('#filtrarGenerico').keyup(function () {
            var rex = new RegExp($(this).val(), 'i');
            $('.buscarG tr').hide();
            $('.buscarG tr').filter(function () {
                return rex.test($(this).text());
            }).show();
        });
    }(jQuery));
});

function listaBuscadores(id) {
    datosJSON = {
        "opcion": id
    };
    $.ajax({
        url: "/Calificaciones/BuscadorServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (resp) {
            $('#buscarRegistro').html(resp);
        }
    });
}

function recuperarBus() {
    $('#puntajes tbody tr').click(function () {
        $('#codigo').val($(this).find("td").eq(0).html());
        $('#codigoAlu').val($(this).find("td").eq(1).html());
        $('#codigo2').val($(this).find("td").eq(2).html());
        $('#nombre').val($(this).find("td").eq(3).html());
        $('#apellido').val($(this).find("td").eq(4).html());
        $('#ci').val($(this).find("td").eq(5).html());
    });
    $('#Alumno tbody tr').click(function () {
        $('#codigoAlu').val($(this).find("td").eq(0).html());
        $('#codigo2').val($(this).find("td").eq(1).html());
        $('#nombre').val($(this).find("td").eq(2).html());
        $('#apellido').val($(this).find("td").eq(3).html());
        $('#ci').val($(this).find("td").eq(4).html());
    });
}