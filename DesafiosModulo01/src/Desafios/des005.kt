package Desafios

import java.text.NumberFormat

fun main() {
    val formato:NumberFormat = NumberFormat.getCurrencyInstance()

    println("""${VERMELHO}----------------------------------
        REAJUSTE SALARIAL
----------------------------------${RECET}""")

    print("Salario: R$")
    val sal:Float = readln().toFloat()
    print("Reajuste: (%) ")
    val reaj:Float = readln().toFloat()

    print("""${AMALERO}------------RESULTADO-------------
O salário anterior era  ${formato.format(sal)}
O aumento será de       $reaj%
E passará a ganhar      ${formato.format(sal * reaj / 100 + sal)}
----------------------------------${RECET}""")
}