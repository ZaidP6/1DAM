function showDropdown(element) {
    element.querySelector('.dropdown-menu').classList.add('show');
}

function hideDropdown(element) {
    element.querySelector('.dropdown-menu').classList.remove('show');
}

document.querySelectorAll('.nav-link').forEach(item => {
    item.addEventListener('click', event => {
        event.stopPropagation();
    });
});