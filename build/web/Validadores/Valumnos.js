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
            codigo2: {
                validators: {
                    digits: {
                        message: 'el campo codigo solo puede llevar digitos sin espacios'
                    },
                    stringLength: {
                        min: 1,
                        message: 'el campo codigo debe tener al menos 1 caracter'
                    }
                }
            },
            nonbre: {
                validators: {
                    notEmpty: {
                        message: 'el campo nombre es requerido'
                    },
                    stringLength: {
                        min: 3,
                        max: 30,
                        message: 'el campo nombre debe tener al menos 3 caracteres y un maximo 30'
                    }
                }
            },
            apellido: {
                validators: {
                    notEmpty: {
                        message: 'el campo apellido es requerido'
                    },
                    stringLength: {
                        min: 3,
                        max: 30,
                        message: 'el campo apellido debe tener al menos 3 caracteres y un maximo 30'
                    }
                }
            },
            cedula: {
                validators: {
                    notEmpty: {
                        message: 'el campo cedula es requerido'
                    },
                    stringLength: {
                        min: 3,
                        max: 30,
                        message: 'el campo cedula debe tener al menos 3 caracteres y un maximo 30'
                    }
                }
            },
            fechanac: {
                validators: {
                    notEmpty: {
                        message: 'el campo fecha nacimiento es requerido'
                    },
                    stringLength: {
                        min: 10,
                        message: 'el campo fecha nacimiento debe tener al menos 8 caracteres'
                    }
                }
            }
        }
    });
});


function Validar() {
    if (($("#codigo").val() === "") || ($("#codigo2").val() === "") || ($("#nonbre").val() === "") || ($("#apellido").val() === "") || ($("#cedula").val() === "") || ($("#fechanac").val() === "")) {
        $("#validar").fadeIn(1000);
        $("#validar").fadeOut(3000);
    } else
        $(function () {
            $("#miTabla tbody tr").each(function (index) {
                var campo1, campo2, campo3, campo4, campo5, campo6;
                $(this).children("td").each(function (index2) {
                    switch (index2) {
                        case 0:
                            campo1 = $(this).text();
                            break;
                        case 1:
                            campo2 = $(this).text();
                            break;
                        case 2:
                            campo3 = $(this).text();
                            break;
                        case 3:
                            campo4 = $(this).text();
                            break;
                        case 4:
                            campo5 = $(this).text();
                            break;
                        case 5:
                            campo6 = $(this).text();
                            break;
                    }
                });

                //alert(campo1 + ' - ' + campo2 + ' - ' + campo3 + ' - ' + campo4 + ' - ' + campo5 + ' - ' + campo6);
                if (($('#cedula').val() === campo5) || ($('#codigo').val() === campo1) || ($('#codigo2').val() === campo2)) {
                    $("#codigo").focus();
                    $('#cedula').val("");
                    $('#codigo').val("");
                    $('#codigo2').val("");
                    $("#repetido").fadeIn(1000);
                    $("#repetido").fadeOut(3000);
                     document.getElementById('INSERTAR').disabled = true;
                } else {
                    document.getElementById('INSERTAR').disabled = false;
                }
            });
        });
}
