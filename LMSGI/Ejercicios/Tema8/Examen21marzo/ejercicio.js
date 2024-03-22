//ejercicio 01
function redondearElementos(unArray){
    for(let i = 0; i<unArray.length;i++){
        if(!isNaN(unArray[i])){
            unArray[i] = Math.round(unArray[i]);
        }else{
            unArray.splice(i, 1);
            i--;
        }
    }
}

//ejercicio 02
function eliminar