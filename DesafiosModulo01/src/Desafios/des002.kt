package Desafios

fun main() {
    println("""${VERMELHO}------------------------------
        DOIS VALORES
------------------------------${RECET}""")

    print("Valor 1: ")
    val v1:Short = readln().toShort()
    print("Valor 2: ")
    val v2:Short = readln().toShort()

    print("""${AMALERO}----------------OPERAÇÕS--------------
SOMA:           ${AZUL}$v1 + $v2 = ${AMALERO}${v1 + v2}
SUBTRAÇÃO:      ${AZUL}$v1 - $v2 = ${AMALERO}${v1 - v2}
MULTIPLICAÇÃO:  ${AZUL}$v1 * $v2 = ${AMALERO}${v1 * v2}
DIVISÃO:        ${AZUL}$v1 / $v2 = ${AMALERO}${v1.toFloat() / v2}
MODULO:         ${AZUL}$v1 % $v2 = ${AMALERO}${v1 % v2}
--------------------------------------${RECET}""")
}