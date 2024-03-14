let mensaje = "Hola hola vecinito";

alert(mensaje.substring(5,9)); 
// primer num = el primero que coge
// segundo num = el primero que deja fuera, por tanto cogería hata el 8

let partes = mensaje.split(' '); //separa por lo que haya dentro del paréntesis (un espacio)
for (let parte of partes) {
    alert(parte);
}