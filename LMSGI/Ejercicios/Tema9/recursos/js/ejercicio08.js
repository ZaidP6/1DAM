let formulario = document.forms.formulario;

        let contrasenyas = formulario.querySelectorAll("input[type=password]");

        for (let contrasenya of contrasenyas) {

            contrasenia.nextElementSibling.addEventListener("pointerover", verContrasenya);
            contrasenia.nextElementSibling.addEventListener("pointerout", ocultarContrasenya);
        }

        function verContrasenya(evento) {

            this.previousElementSibling.type = "text";
        }

        function ocultarContrasenya(evento) {

            this.previousElementSibling.type = "password";
        }

        function verletrasenya() {
            let passwordInput = document.getElementById("password");
            let eyeIcon = document.querySelector(".eye-icon i");

            if (passwordInput.type === "password") {
                passwordInput.type = "text";
                eyeIcon.classList.remove("bi-eye-fill");
                eyeIcon.classList.add("bi-eye-slash-fill");
            } else {
                passwordInput.type = "password";
                eyeIcon.classList.remove("bi-eye-slash-fill");
                eyeIcon.classList.add("bi-eye-fill");
            }
        }

        function comprobarCorreo() {
            let emailInput = document.getElementById("email");
            let email = emailInput.value.trim();

            if (!/^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/.test(email)) {
                emailInput.classList.add("is-invalid");
                emailError.textContent = "El formato del correo electrónico no es válido.";
                return false;
            }
            emailInput.classList.remove("is-invalid");
            emailError.textContent = "";
            return true;
        }

        function comprobarDNI() {
            let divisor = 23;
            let letras =
                ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                    'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                    'C', 'K', 'E', 'T'];

            //let texto = "Tu DNI completo es: "

            if (numsDni < 0 || numsDni > 99999999) {

                alert("Número no válido");
            } else {
                let resto = numsDNI % divisor;
                let letraCalculada = letras[resto];
                alert(numsDNI + letraCalculada)
            }
            //-----------
            if (numDni > 0 || numDni < 99999999) {

                let resultado = numDni % 23;
                let letraCalculada = letras[resultado];

                if (letraCalculada.toUpperCase !== letraDNI.toUpperCase) {
                    alert("Letra no correcta")
                } else {
                    alert("Número y letra del DNI son correctos")
                }

            } else {
                alert("Número no válido");
            }
        }

        function pasarNombreApellidosAMayusculas() {
            let nombreInput = document.getElementById("nombre");
            let apellidosInput = document.getElementById("apellidos");

            let nombre = nombreInput.value.trim().toUpperCase();
            let apellidos = apellidosInput.value.trim().toUpperCase();

            nombreInput.value = nombre;
            apellidosInput.value = apellidos;
        }

        function procesarFormulario() {
            let dniValido = comprobarDNI();
            let correoValido = comprobarCorreo();
            let letrasenyaValida = validarletrasenya();
            return dniValido && letrasenyaValida && correoValido;
        }