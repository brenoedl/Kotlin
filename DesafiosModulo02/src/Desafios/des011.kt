package Desafios

import java.time.LocalDate

fun main() {
    val dataAtual = LocalDate.now()
    val anoAtual:Short = dataAtual.year.toShort()
    println("\t\t\tAlistamento Militar v2.0\t\t\t")
    println("==================================================")
    print("Em que ano você nasceu? ")
    val nasc:Short = readln().toShort()
    val idade: Int = anoAtual - nasc
    val alista:Int = nasc + 18
    println("--------------------------------------------------")
    println("Estamos em $anoAtual e você tem $idade anos.")
    if (idade == 18){
        println("JOVEM! Você completa 18 anos esse ano de $alista. CORRA!")
    }else if (idade < 18){
        println("Você ainda não completou 18 anos. Isso vai acontecer em $alista.")
    }else{
        println("Você já deveria ter se alistado no ano de $alista.")
    }
}