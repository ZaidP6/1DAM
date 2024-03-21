
let lista = [];
let suma = 0;
let continuar = true;

function crearArray(){
    let cant = parseInt(prompt('Indique el taño del array'));

    for (let i = 0; i < cant; i++) {
        
        let numero = parseInt(prompt('Diga un número'));
        lista.push(numero);
        suma += numero;
        
    }
}

while (continuar) {
    crearArray();

    let nuevoNumero = parseInt(prompt('Indique 0 para salir'));
    if(isNaN(nuevoNumero) || nuevoNumero === 0) {
        alert(suma);
        continuar = false;
    }else{
        let primerNum = lista.shift();
        lista.push(nuevoNumero);

        suma -= primerNum + nuevoNumero;
        alert(suma);
    }
}