package Desafios

import java.text.NumberFormat

fun main(){
    val formato:NumberFormat = NumberFormat.getCurrencyInstance()

    println("""${VERMELHO}--------------------------------------
        CADASTRO ESTUDONAUTA
--------------------------------------${RECET}""")

    print("Nome do funcionario: ")
    val nome:String = readln()
    print("Ano de Nascimento: ")
    val nasc:Short = readln().toShort()
    print("Salário: R$")
    val sal:Float = readln().toFloat()

    println("""${AMALERO}----------FICHA FUNCIOHAL----------
Nome:       $nome
Nascimento: $nasc
Salário:    ${formato.format(sal)}
-----------------------------------${RECET}""")
}