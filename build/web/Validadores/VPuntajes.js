function Validar() {
    if (($("#codigo").val() === "") || ($("#codigoAlu").val() === "") || ($("#codigo2").val() === "") || ($("#nombre").val() === "") || ($("#apellido").val() === "") ||
            ($("#ci").val() === "") || ($("#carrera").val() === "") || ($("#materia").val() === "") || ($("#anho").val() === "") || ($("#tp").val() === "") || ($("#ep").val() === "") || ($("#final").val() === "") || Puntajes()) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
    } else
        $(function () {
            $("#miTabla tbody tr").each(function (index) {
                var campo1, campo2;
                $(this).children("td").each(function (index2) {
                    switch (index2) {
                        case 0:
                            campo1 = $(this).text();
                            break;
                        case 1:
                            campo2 = $(this).text();
                            break;
                    }
                });

                //alert(campo1 + ' - ' + campo2 + ' - ' + campo3);
                if (($('#materia').val() === campo1) && ($('#codigoAlu').val() === campo2)) {
                    $("#carrera").focus();
                    $('#materia').val("");
                    $('#carrera').val("");
                    $("#repetido").fadeIn(1000);
                    $("#repetido").fadeOut(3000);
                    document.getElementById('INSERTAR').disabled = true;
                } else {
                    document.getElementById('INSERTAR').disabled = false;
                }
            });
        });
}

function Puntajes() {
    if ((parseInt($('#tp').val()) > 20)) {
        $('#tp').val("");
        $("#Tpractico").fadeIn(1000);
        $("#Tpractico").fadeOut(3000);
    }
    if ((parseInt($('#ep').val()) > 30)) {
        $('#ep').val("");
        $("#Parcial").fadeIn(1000);
        $("#Parcial").fadeOut(3000);
    }

    if ((parseInt($('#final').val()) > 50)) {
        $('#final').val("");
        $("#Exfinal").fadeIn(1000);
        $("#Exfinal").fadeOut(3000);
    }
}




        