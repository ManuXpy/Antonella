/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $(":text").val("");
    allcarreras();

});
function crearJSON(id) {
    datosJSON = {
        "opcion": id,
        "codigo": $('#codigo').val(),
        "carrera": $('#carrera').val(),
        "usuario": $('#usuario').val()
    };
}

function recuperar() {
    $('#miTabla tr').click(function () {
        $('#codigo').val($(this).find("td").eq(0).html());
        $('#carrera').val($(this).find("td").eq(1).html());
    });
}

function  amb(id) {
    crearJSON(id);
    if (($("#codigo").val() === "") || ($("#carrera").val() === "")) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
        document.getElementById('INSERTAR').disabled = true;
    } else {
        $.ajax({
            url: "/Calificaciones/CarrerasServlet",
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

function allcarreras() {

    crearJSON(4);
    $.ajax({
        url: "/Calificaciones/CarrerasServlet",
        type: 'POST',
        data: datosJSON,
        cache: false,
        success: function (resp) {
            $.each(resp, function (indice, value) {
                paginar();
                $("#miTabla").append($("<tr>").append($("<td>" + value.id_carrera + "</td>" +
                        "<td>" + value.nombre_carrera + "</td>")));
            });
        }
    });
}

function  autonumerico() {
    crearJSON(5);
    $.ajax({
        url: "/Calificaciones/CarrerasServlet",
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
        url: "/Calificaciones/CarrerasServlet",
        data: datosJSON,
        type: 'POST',
        success: function (resp) {
            $.each(resp, function (indice, value) {
                $("#codigo").val(value.id_carrera);
                $("#carrera").val(value.nombre_carrera);
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
        var numPerPage = 18;
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
