//debes limpiar tablero primero =)

document.addEventListener("DOMContentLoaded", 
function () {
  let casillas = document.querySelectorAll('.casilla');
  let message = document.getElementById('mensaje');
  let resetButton = document.getElementById('limpiar');
  let currentPlayer = 'X';

  casillas.forEach(casilla => {
    casilla.addEventListener('click', function () {
      if (!casilla.textContent) {
        casilla.textContent = currentPlayer;
        casilla.classList.add(currentPlayer === 'X' ? 'bg-success' : 'bg-danger');
        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
        message.textContent = `es el turno de ${currentPlayer}`;
        message.classList.remove('bg-success', 'bg-danger');
        message.classList.add(currentPlayer === 'X' ? 'bg-success' : 'bg-danger');
      } else {
        message.textContent = 'Casilla ocupada';
      }
    });
  });

  resetButton.addEventListener('click', function () {
    casillas.forEach(casilla => {
      casilla.textContent = '';
      casilla.classList.remove('bg-success', 'bg-danger');
    });
    currentPlayer = 'X';
    message.textContent = 'es el turno de X';
    message.classList.remove('bg-danger');
    message.classList.add('bg-success');
  });
});