
/*
Dejo comentado código erróneo 
let x = prompt("Indique el número para factorizarlo")

//como solo se va a ejecutar aqui una vez no hace falta 
// darle nombre a la función
function factorial(x) { 
    
        let y = x;
        for (let i = x; 1 < i <= x; i--) {
            if ((x-1)!=0) {
                y *= (i - 1);
            }
           
        }             
    return y;    
}

alert(factorial(x));
*/

let numero = prompt("Introduzca un número"); // Número del que queremos calcular el factorial
let resultado = 1;
for (let i = numero; i > 0; i--) {
    resultado *= i;
}

alert("El resultado del número factorial " + numero + " es " + resultado);