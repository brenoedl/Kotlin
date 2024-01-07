package Desafios

import kotlin.math.pow

fun main() {
    println("""${VERMELHO}----------------------------------
       CÁLCULO DE POTÊNCIA
----------------------------------${RECET}""")

    print("Base: ")
    val b:Short = readln().toShort()
    print("Expoente: ")
    val e:Short = readln().toShort()

    print("""${AMALERO}------------RESULTADO-------------
Cálculando ${AZUL}$b ${AMALERO}elevado a ${AZUL}$e${AMALERO}
O resultado é ${b.toFloat().pow(e.toFloat())}
----------------------------------${RECET}""")
}