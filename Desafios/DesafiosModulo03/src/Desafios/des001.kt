package Desafios

fun main() {
    print("Onde começa a contagem? ")
    val inicio:Int = readln().toInt()
    print("Onde termina a contagem? ")
    val fim:Int = readln().toInt()
    print("qual vai ser o incremento? ")
    val passo:Int = readln().toInt()

    var c:Int = inicio

    while (c <= fim) {
        print("$c ")
        Thread.sleep(500)
        c += passo
    }
    println("FIM")
}