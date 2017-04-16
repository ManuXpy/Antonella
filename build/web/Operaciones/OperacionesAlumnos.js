/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $(":text").val("");
    allAlumnos();

});
function crearJSON(id) {
    datosJSON = {
        "opcion": id,
        "codigo": $('#codigo').val(),
        "codigo2": $('#codigo2').val(),
        "nonbre": $('#nonbre').val(),
        "apellido": $('#apellido').val(),
        "cedula": $('#cedula').val(),
        "fechanac": $('#fechanac').val(),
        "usuario": $('#usuario').val()
    };
}

function recuperar() {
    $('#miTabla tr').click(function () {
        $('#codigo').val($(this).find("td").eq(0).html());
        $('#codigo2').val($(this).find("td").eq(1).html());
        $('#nonbre').val($(this).find("td").eq(2).html());
        $('#apellido').val($(this).find("td").eq(3).html());
        $('#cedula').val($(this).find("td").eq(4).html());
        $('#fechanac').val($(this).find("td").eq(5).html());
    });
}

function  amb(id) {
    crearJSON(id);
    if (($("#codigo").val() === "") || ($("#codigo2").val() === "") || ($("#nonbre").val() === "") || ($("#apellido").val() === "") || ($("#cedula").val() === "") || ($("#fechanac").val() === "")) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
        document.getElementById('INSERTAR').disabled = true;
    } else {
        $.ajax({
            url: "/Calificaciones/AlumnosServlet",
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

function allAlumnos() {

    crearJSON(4);
    $.ajax({
        url: "/Calificaciones/AlumnosServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (resp) {
            $.each(resp, function (indice, value) {
                paginar();
                $("#miTabla").append($("<tr>").append($("<td>" + value.id_alumno + "</td>" +
                        "<td>" + value.cod_alumno + "</td>" +
                        "<td>" + value.nombres_alumno + "</td>" +
                        "<td>" + value.apellidos_alumno + "</td>" +
                        "<td>" + value.ci_alumno + "</td>" +
                        "<td>" + value.fecha_nac_alumno + "</td>")));
            });
        }
    });
}

function  autonumerico() {
    crearJSON(5);
    $.ajax({
        url: "/Calificaciones/AlumnosServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $("#codigo").val(resp);
            $("#descripcion").focus();
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
    crearJSON(6);
    $.ajax({
        url: "/Calificaciones/AlumnosServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $.each(resp, function (indice, value) {
                $("#codigo2").val(value.cod_alumno);
                $("#nonbre").val(value.nombres_alumno);
                $("#apellido").val(value.apellidos_alumno);
                $("#cedula").val(value.ci_alumno);
                $("#fechanac").val(value.fecha_nac_alumno);
                $("#codigo2").focus();
            });
            return true;
        },
        error: function () {
            $("#error").show();
            window.setTimeout(function () {
                $("#error").fadeTo(1500, 0).slideUp(500, function () {
                    $(this).remove();
                });
            }, 1100);
            return false;
        }
    });
}

function paginar() {
    $('table.with-pager').each(function () {
        var $table = $(this);
        var $nextPage = $('.pager .next');
        var $previousPage = $('.pager .previous');
        var currentPage = 0;
        var numPerPage = 12;
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
