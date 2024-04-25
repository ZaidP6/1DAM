let formulario = document.forms.formulario;
let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);

function comprobarDatos(evento) {
    evento.preventDefault();
    datosErroneos = false;
    verificarCompararContrasenya();
    if (!datosErroneos) {
        formulario.submit();
    }
}


function verificarCompararContrasenya() {
    let contrasenya = document.getElementById("password").value;
    let confirmarContrasenya = document.getElementById("password-confirm").value;
    let contrasenyaError = document.getElementById("password-error");

    if (contrasenya !== confirmarContrasenya) {
        contrasenyaError.innerText = "Las contraseñas no coinciden";
        return false;
    }

    let contrasenyaValida = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/.test(contrasenya);
    if (!contrasenyaValida) {
        contrasenyaError.innerText = "La contraseña debe tener al menos 8 caracteres combinando letras y números";
        return false;
    }
    return true;
}