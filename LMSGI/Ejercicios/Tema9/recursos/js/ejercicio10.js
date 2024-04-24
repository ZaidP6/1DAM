let formulario = document.forms.formulario;

for (campo of formulario) {

    if(campo.type === 'text') {

        campo.addEventListener("input", pasarAMayusculas);
    }
    else if (campo.type === 'password') {

        campo.nextElementSibling.addEventListener("pointerover", verContrasenia);
        campo.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
    }
}

let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);


function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}

function pasarAMayusculas(evento) {

    this.value = this.value.toUpperCase();
}

function comprobarDNI() {

    let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
    "T"];

    let campoDni = formulario.elements.dni;
    let letraDni = dni.value.substring(8, 9);
    let dniSinLetra = dni.value.split('');
    dniSinLetra.pop();
    dniSinLetra = dniSinLetra.join("");

    if (letras[dniSinLetra % 23] !== letraDni) {

        let mensajeError = campoDni.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La letra del DNI es incorrecta";

        datosErroneos = true
    }


}

function comprobarDatos(evento) {
    
    evento.preventDefault();
    
    datosErroneos = false;
    
    comprobarDNI();

    if (!datosErroneos) {

        formulario.submit();

    }

}