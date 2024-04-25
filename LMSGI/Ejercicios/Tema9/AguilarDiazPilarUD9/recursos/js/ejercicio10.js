let formulario = document.forms.formulario;
let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);

function comprobarDatos(evento) {
    evento.preventDefault();
    datosErroneos = false;
    pasarNombreApellidosAMayusculas();
    if (!datosErroneos) {
        formulario.submit();
    }
}

function pasarNombreApellidosAMayusculas() {
    let nombreInput = document.getElementById("nombre");
    let apellidosInput = document.getElementById("apellidos");

    let nombre = nombreInput.value.trim().toUpperCase();
    let apellidos = apellidosInput.value.trim().toUpperCase();

    nombreInput.value = nombre;
    apellidosInput.value = apellidos;
}