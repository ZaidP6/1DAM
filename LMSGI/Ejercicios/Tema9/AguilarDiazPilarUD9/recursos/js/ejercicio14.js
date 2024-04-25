let formulario = document.forms.formulario;
let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);

function comprobarDatos(evento) {
    evento.preventDefault();
    datosErroneos = false;
    comprobarEdad();
    if (!datosErroneos) {
        formulario.submit();
    }
}

function comprobarEdad() {
    let fechaNacimiento = new Date(document.getElementById("fecha-nacimiento").value);
    let fechaActual = new Date();

    let edad = fechaActual.getFullYear() - fechaNacimiento.getFullYear();

    if (fechaActual.getMonth() < fechaNacimiento.getMonth() || (fechaActual.getMonth() === fechaNacimiento.getMonth() && fechaActual.getDate() < fechaNacimiento.getDate())) {
        edad--;
    }
    if (edad < 18) {
        alert("Debes ser mayor de 18 años para continuar.");
        return false;
    }
    return true;
}