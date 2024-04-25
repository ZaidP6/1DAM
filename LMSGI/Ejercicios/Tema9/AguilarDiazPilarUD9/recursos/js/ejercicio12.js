let formulario = document.forms.formulario;
let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);

function comprobarDatos(evento) {
    evento.preventDefault();
    datosErroneos = false;
    comprobarCorreo();
    if (!datosErroneos) {
        formulario.submit();
    }
}

function comprobarCorreo() {
    let emailInput = document.getElementById("email");
    let emailError = document.getElementById("emailError");
    let email = emailInput.value.trim();

    if (!/^\w+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$/.test(email)) {
        emailInput.classList.add("is-invalid");
        emailError.textContent = "El formato del correo electrónico no es válido.";
        datosErroneos = true;
    } else {
        emailInput.classList.remove("is-invalid");
        emailError.textContent = "";
    }
}

