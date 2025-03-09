package Desafios

fun main() {
    print("Quantos números você quer que eu sorteie? ")
    val total:Int = readln().toInt()
    println("---------------------------------------------")
    println("Sorteano $total números:")
    var num:Byte
    var cont:Int = 1
    var m5:Int = 0
    var d3:Int = 0
    while (cont <= total){
        num = (1..10).random().toByte()
        print("$num - ")
        Thread.sleep(500)
        if (num > 5){
            m5++
        }
        if (num % 3 == 0){
            d3++
        }
        cont++
    }
    println("pronto")
    println("""---------------------------------------------
Dos  $total números sorteados
temos $m5 mairess que cinco
e $d3 divisíves por três.""")
}