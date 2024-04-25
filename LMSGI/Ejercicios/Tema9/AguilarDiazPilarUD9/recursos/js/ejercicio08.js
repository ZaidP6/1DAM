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

        function vercontrasenya() {
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