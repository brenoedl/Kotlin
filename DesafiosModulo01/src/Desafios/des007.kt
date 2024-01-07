package Desafios

import kotlin.math.abs

fun main() {
    println("""${VERMELHO}----------------------------------
        TENTE ADIVINHAR
----------------------------------
${AZUL}Vou "pessar" em um número entre 0..5${RECET}""")
    val num:Byte = (0..5).random().toByte()

    print("Seu palpite: ")
    val palp:Byte = readln().toByte()

    print("""${AMALERO}------------RESULTADO-------------
Você disse que seria o valor${AZUL} $palp ${AMALERO}
Eu penssei no número $num
A diferrença foi de ${MAGENTA}${abs(num - palp)}
${AMALERO}----------------------------------${RECET}""")
}