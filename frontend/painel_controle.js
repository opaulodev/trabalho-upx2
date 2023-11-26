async function calcular(data){
    const response = await fetch(
        "http://localhost:8080/api/producaoenergia/calcular", 
        {method : 'POST', 
         body : JSON.stringify(data),
         headers : {'Content-Type' : 'application/json'}        
        })
    const producaoenergia = await response.json()
    console.log(producaoenergia)
    let producaodiaria = document.getElementById("producao-diaria")
    let producaomensal = document.getElementById("producao-mensal")
    let rendimentodiario = document.getElementById("rendimento-diario")
    let rendimentomensal = document.getElementById("rendimento-mensal")
    producaodiaria.innerText = producaoenergia.producaoDiaria + 'kW'
    producaomensal.innerText = producaoenergia.producaoMensal + 'kW'
    rendimentodiario.innerText = 'R$' + producaoenergia.rendimentoDiario
    rendimentomensal.innerText = 'R$' + producaoenergia.rendimentoMensal
    producaodiaria.style.color = 'black';
    producaomensal.style.color = 'black';
    rendimentodiario.style.color = 'black';
    rendimentomensal.style.color = 'black';

    
}

function formatarValores(){
    let quantidadeplacas = document.getElementById("quantidade-placas")
    let quantidadekwporplaca = document.getElementById("quantidade-kw-por-placa")
    let medialocal = document.getElementById("media")
    var data = {
        quantidadeDePlacas : quantidadeplacas.value,
        quantidadeKwPorPlaca : quantidadekwporplaca.value,
        mediaLocal : medialocal.value
    }
    console.log(data)
    calcular(data)
}





// 1 Adicionar textfield no HTML
// 2 Adicionar o botão de calcular
// 3 Botão calcular chamar funcao para formatar os dados
// 4 a função formatar os dados tem que obter os campos do textfield pelo ID
// 5 montar o data = {}
// 6 chamar a função calcular
// DEVERIA FUNCIONAR