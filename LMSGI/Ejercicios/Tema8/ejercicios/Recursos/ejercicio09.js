
function comprobarCadena(cadena){
    if (cadena === cadena.toLowerCase()) {
        alert('Todos los caracteres de la cadena están en minúsculas');
    }

    else if (cadena === cadena.toUpperCase()) {
        alert('Todos los caracteres de la cadena están en mayúsculas');
    }
    
    else {
        alert('Aquí hay mezcla de mayúsculas y minúsculas');
    }
}

let cadena = prompt("Escriba un texto");
comprobarCadena(cadena);