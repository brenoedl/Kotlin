package Desafios

import java.time.LocalDate

fun main() {
    val dataAtual = LocalDate.now()
    val anoAtual:Int = dataAtual.year
    println("Alistamento militar V1.0")
    print("Em que ano você nasceu? ")
    val anoNasc:Int = readln().toInt()
    val idade = anoAtual - anoNasc
    println("${MAGENTA}------------------ RESULTADO ------------------${RECET}")
    println("Sua idade atual é $idade anos.")
    if (idade >= 18){
        println("${VERMELHO}Espero sinceramente que você tenha se alistado${RECET}")
    }else{
        println("${VERDE}Você ainda não completou 18 anos. Não pode se alistar!${RECET}")
    }
}