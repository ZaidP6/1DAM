let valores = [true, 5, false, "hola", "adios", 2];

//a
if(valores[3].length>valores[4].length){
    alert(valores[3] + " es mayor que " + valores[4]);
}
if(valores[4].length>valores[3].length){
    alert(valores[4] + " es mayor que " + valores[3]);
}else
    alert("Son de igual longitud.");

//---- Rafa lo hace así, no es comparar longitud sino código ascii mayor -----
let mayor = (valores[3]>valores[4])?valores[3]:valores[4];

alert("El mayor es "+mayor);

//b




//c
alert(valores[0]||valores[2]);
alert(valores[0]&&valores[2]);
alert(valores[1]+valores[5]);
alert(valores[1]-valores[5]);
alert(valores[1]*valores[5]);
alert(valores[1]/valores[5]);
alert(valores[1]%valores[5]);