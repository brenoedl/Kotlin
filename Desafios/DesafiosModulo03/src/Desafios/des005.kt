package Desafios

fun main() {
    var cont:Int = 1
    var soma:Int = 0
    var num:Byte
    print("Quantos números você quer que eu sorteie? ")
    val total:Int = readln().toInt()
    println("---------------------------------------------")
    println("Sorteano $total números:")
    while (cont <= total){
        num = (1..10).random().toByte()
        print("$num - ")
        soma += num
        Thread.sleep(500)
        cont++
    }
    println("pronto")
    println("---------------------------------------------")
    print("A soma entre esses valores é igual a $soma")
}