package Desafios

fun main() {
    var n = 0
    var c = 0
    var s = 0
    var maior = 0

    while (n != 9999){
        println("""$CIANO--------------------------------------------
${c + 1}° VALOR [Digite 9999 para encerrar]
--------------------------------------------$RECET""")

        print("Número: ")
        n = readln().trim().toInt()

        if (n != 9999){
            s += n
            c++
            if (c == 1 || n > maior){
                maior = n
            }
        }
    }

    val media = s.toFloat() / c

    println("""$VERDE======================================================
Ao todo foram digitados $c valores.
A soma entre desses valores é $s.
A média entre eles é ${"%.2f".format(media)}.
O maior valor digitado é $maior
======================================================$RECET""")
}