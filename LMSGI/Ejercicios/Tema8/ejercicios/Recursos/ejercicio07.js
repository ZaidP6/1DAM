
let x = prompt("Indique el número para factorizarlo")
alert(factorial(x))
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
