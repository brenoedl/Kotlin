package Desafios

import java.time.LocalDate

fun main() {
    val dataAtual = LocalDate.now()
    val anoAtual:Int = dataAtual.year
    print("Em que ano você nasceu? ")
    val anoNasc:Int = readln().toInt()
    val idade = anoAtual - anoNasc
    println("${CIANO}Hoje, em $anoAtual, você tem $idade anos, certo?")
    println("----------------------------------------")
    println("Seja bem-vimdo(a) ao BANCO BRENO${RECET}")
    if (idade >= 65){
        println("${VERMELHO}==== ATENÇÃO! DIRIJA-SE Á FILA PREFERENCIAL ====${RECET}")
    }
}