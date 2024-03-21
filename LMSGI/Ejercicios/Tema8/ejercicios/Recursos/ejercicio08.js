
function comprobarParImpar(numero) {
    if (numero % 2 === 0) {
        alert('Número par');
        
    } else
        alert('Número impar');
}

let numero = prompt("Introduce un número");
let resultado = comprobarParImpar(numero);
