
let cantNumeros = parseInt(prompt('Indique cuántos números son.'));
let numeros = [];

for (let i = 0; i < cantNumeros; i++) {
    let num = prompt('Indique el número');
    numeros.push(num);
    
}
function ordenar(x, y){
    return y - x;
}
numeros.sort(ordenar);
alert(numeros);