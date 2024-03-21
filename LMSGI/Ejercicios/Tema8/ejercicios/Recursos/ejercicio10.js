
function comprobarPalindromo(cadena) {

    let cadenaInvertida = cadena.split("").reverse().join("");

    if (cadena === cadenaInvertida) {
        alert("Es palíndromo");
    } else {
        alert("No es palíndromo");
    }
}
let cadena = prompt("Escriba una frase o palabra");
comprobarPalindromo(cadena);