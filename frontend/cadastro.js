function mostrarSegundaTela() {
    document.getElementById('cadastroForm').style.display = 'none';
    document.getElementById('segundaTela').style.display = 'block';
}

function goBack() {
    history.back();
}

function redirecionar() {
    window.location.href = 'painel_controle.html';
}