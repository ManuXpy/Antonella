$(document).ready(function () {
    $('#defaultForm').bootstrapValidator({
        fields: {
            codigo: {
                validators: {
                    digits: {
                        message: 'el campo ID solo puede llevar digitos sin espacios'
                    },
                    stringLength: {
                        min: 1,
                        message: 'el campo ID debe tener al menos 1 caracter'
                    }
                }
            },
            carrera: {
                validators: {
                    notEmpty: {
                        message: 'el campo carrera es requerido'
                    }
                }
            },
            materia: {
                validators: {
                    notEmpty: {
                        message: 'el campo Materia es requerido'
                    },
                    stringLength: {
                        min: 3,
                        max: 30,
                        message: 'el campo Materia debe tener al menos 3 caracteres y un maximo 30'
                    }
                }
            }
        }
    });
});


function Validar() {
    if (($("#codigo").val() === "") || ($("#materia").val() === "")) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
    } else
        $(function () {
            $("#miTabla tbody tr").each(function (index) {
                var campo1, campo2, campo3;
                $(this).children("td").each(function (index2) {
                    switch (index2) {
                        case 0:
                            campo1 = $(this).text();
                            break;
                        case 1:
                            campo2 = $(this).text();
                            break;
                        case 3:
                            campo3 = $(this).text();
                            break;
                    }
                });

                //alert(campo1 + ' - ' + campo2 + ' - ' + campo3 + ' - ' + campo4 + ' - ' + campo5 + ' - ' + campo6);
                if (($('#codigo').val() === campo1) || ($('#materia').val() === campo2) && ($('#carrera').val() === campo3)) {
                    $("#materia").focus();
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
