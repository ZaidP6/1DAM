
function procesarFormulario() {
    let dniValido = comprobarDNI();
    let correoValido = comprobarCorreo();
    let contrasenyaValida = verificarCompararContrasenya();
    let mayusculasNombreYApellidos = pasarNombreApellidosAMayusculas();
    let edadValida = comprobarEdad();
    return dniValido && contrasenyaValida && correoValido && mayusculasNombreYApellidos && edadValida;
}