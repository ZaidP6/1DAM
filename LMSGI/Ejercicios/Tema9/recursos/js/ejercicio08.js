let formulario = document.forms.formulario;

let contrasenias = formulario.querySelectorAll("input[type=password]");

for(let contrasenia of contrasenias) {

    contrasenia.nextElementSibling.addEventListener("pointerover", verContrasenia);
    contrasenia.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
}

function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}