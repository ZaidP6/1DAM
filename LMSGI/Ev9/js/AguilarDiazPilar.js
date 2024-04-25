let formulario = document.forms.formulario;

        let contrasenyas = formulario.querySelectorAll("input[type=password]");

        for (let contrasenya of contrasenyas) {

            contrasenya.nextElementSibling.addEventListener("pointerover", verContrasenya);
            contrasenya.nextElementSibling.addEventListener("pointerout", ocultarContrasenya);
        }

        function verContrasenya(evento) {

            this.previousElementSibling.type = "text";
        }

        function ocultarContrasenya(evento) {

            this.previousElementSibling.type = "password";
        }

//End ver la contraseña con el ojo

//Start mensaje carrtito
function actualizarMensajeCarrito(){
    let cantidadBocatasSpan = document.getElementById('cantidadBocatas');
    let cantidadBocatas = document.getElementById('cantidad').value;
    cantidadBocatasSpan.textContent = cantidadBocatas;

    if (cantidadBocatas > 0) {
        mensajeCarritoSpan.textContent = `Su carrito tiene ${cantidadBocatas} bocadillos`;
    } else {
        mensajeCarritoSpan.textContent = 'No ha encargado aún ningún bocadillo';
    }
}

let botonActualizar = document.getElementById('actualizar');
botonActualizar.addEventListener('click', () => {
    actualizarMensajeCarrito();
});

function actualizarTablaCarrito(){
 
} 

let actualizarPedido = document.getElementById('offcanvasCarrito');
actualizarPedido.addEventListener('click', ()=> {
    actualizarTablaCarrito();

function validarFormulario(){
    let comprobarCarrito = actualizarMensajeCarrito();
    let comprobarTabla = actualizarTablaCarrito();
    return comprobarCarrito && comprobarTabla;
}