

let numsDNI = prompt("Introduzca el numero del dni sin la letra"); 
 let letra  = prompt("Indique la letra del dni");

// let sumaDNI = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
let divisor = 23;
let letras = 
    ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
    'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
    'C', 'K', 'E','T'];

//let texto = "Tu DNI completo es: "

if(numsDni < 0 || numsDni >99999999){

    alert("Número no válido");
}else{
    let resto = numsDNI%divisor;
    let letraCalculada = letras[resto];
    alert(numsDNI+letraCalculada)
}
//-----------
if( numDni > 0 || numDni < 99999999){

    let resultado= numDni%23;
    let letraCalculada=letras[resultado];
 
    if(letraCalculada.toUpperCase !== letraDNI.toUpperCase){
     alert("Letra no correcta")
    }else{
     alert("Número y letra del DNI son correctos")
    }
    
 }else{
     alert("Número no válido");
 }
 
 