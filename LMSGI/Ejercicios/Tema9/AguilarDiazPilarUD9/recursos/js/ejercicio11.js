let formulario = document.forms.formulario;
let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);

function comprobarDatos(evento) {
    evento.preventDefault();
    datosErroneos = false;
    comprobarDNI();
    if (!datosErroneos) {
        formulario.submit();
    }
}

function comprobarDNI() {
    let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
    "T"];

    let campoDni = formulario.elements.dni;
    let dniInput = dni.value;
    let letraDni = dniInput.substring(8, 9).toUpperCase();
    let dniSinLetra = dniInput.slice(0, -1); 

    if (letras[dniSinLetra % 23] !== letraDni) {
        let mensajeError = campoDni.nextElementSibling;
        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La letra del DNI es incorrecta";
        datosErroneos = true;
    }
}
