package Desafios

fun main() {
    println("""${VERMELHO}----------------------------------
        REAJUSTE SALARIAL
----------------------------------${RECET}""")
    print("Salario: R$")
    val sal:Float = readln().toFloat()
    print("Reajuste: (%) ")
    val reaj:Float = readln().toFloat()
    print("""${AMALERO}------------RESULTADO-------------
O salário anterior era  R$$sal
O aumento será de       $reaj%
E passará a ganhar      R$${sal * reaj / 100 + sal}
----------------------------------${RECET}""")
}