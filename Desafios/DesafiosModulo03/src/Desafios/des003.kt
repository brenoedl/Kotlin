package Desafios

fun main() {
    print("Sua contagem regressiva vai comesar em: ")
    val n:Int = readln().toInt()
    print("Marcar os multiplos de: ")
    val m:Int = readln().toInt()
    var c:Int = n
    while (c >= 0){
        if (c % m == 0){
            print("$VERMELHO[$c]${RECET} - ")
        }else{
            print("$c - ")
        }
        Thread.sleep(500)
        c --
    }
    println("FIM!")
}