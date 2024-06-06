let emailInput = document.getElementById('email');
let emailConfInput = document.getElementById('emailconf');
let passwordInput = document.getElementById('password');
let passwordConfInput = document.getElementById('passwordconf');
let emailError = document.getElementById('emailError');
let passwordError = document.getElementById('passwordError');

function validarEmail() {
    let email = emailInput.value;
    let emailConf = emailConfInput.value;

    if (email !== emailConf) {
        emailError.innerText = 'Los correos electrónicos no coinciden';
        return false;
    } else {
        emailError.innerText = '';
        return true;
    }
}

function validarContraseña() {
    let password = passwordInput.value;
    let passwordConf = passwordConfInput.value;

    if (password !== passwordConf) {
        passwordError.innerText = 'Las contraseñas no coinciden';
        return false;
    } else {
        passwordError.innerText = '';
        return true;
    }
}

let form = document.getElementById('registroForm');

form.addEventListener('submit', function(event) {
    
    if (!validarEmail() || !validarContraseña()) {
        event.preventDefault();
    }
});

emailInput.addEventListener('input', validarEmail);
emailConfInput.addEventListener('input', validarEmail);
passwordInput.addEventListener('input', validarContraseña);
passwordConfInput.addEventListener('input', validarContraseña);
