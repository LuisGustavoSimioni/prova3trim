
function Calcular(){

    let idadeCanina = prompt("Qual a idade do cachorrinho?");
     if (isNaN(idadeCanina)) {
        alert("Por favor, insira uma idade válida.");
        return;
    }
    let calc= idadeCanina * 7;
    let show = document.querySelector(".mostra-resultado")
    show.textContent = "Resultado: a idade humana do cachorrinho é " + calc;b

    mostraResultado.textContent = "Resultado: a idade humana do cachorrinho é " + idadeCanina;

    //BRO ESTOU PERDIDO NÃO TA FAZENDO SOL, VOCÊ PODE ME AJUDAR A TERMINAR ESSA CALCULADORA PARA MEU FILHO??
    //POR FAVOR BRO TERMINE PARA MIM GANG GANG GANG 777 FERNANDX CLOATHING
}