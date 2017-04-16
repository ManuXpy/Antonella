//$(document).ready(function () {
//    (function ($) {
//        $('#filtrar').keyup(function () {
//            var rex = new RegExp($(this).val(), 'i');
//            $('.buscar tr').hide();
//            $('.buscar tr').filter(function () {
//                return rex.test($(this).text());
//            }).show();
//        });
//    }(jQuery));
//});


$(document).ready(function () {
    $.expr[':'].icontains = function (obj, index, meta, stack) {
        return (obj.textContent || obj.innerText || jQuery(obj).text() || '').toLowerCase().indexOf(meta[3].toLowerCase()) >= 0;
    };
    $(document).ready(function () {
        $('#filtrar').keyup(function () {
            buscar = $(this).val();
            $('#miTabla tr').removeClass('resaltar');
            if (jQuery.trim(buscar) !== '') {
                $("#miTabla tr:icontains('" + buscar + "')").addClass('resaltar');
            }
        });
    });
});


//$(document).ready(function () {
//    $("#filtrar").keyup(function () {
//        _this = this;
//        // Muestra los tr que concuerdan con la busqueda, y oculta los demás.
//        $.each($("#miTabla tbody tr"), function () {
//            if ($(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) === -1)
//                $(this).hide();
//            else
//                $(this).show();
//        });
//    });
//});
