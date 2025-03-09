package Desafios

fun main() {
    println("""$VERDE-----------------------
     JOGO DO PIN
-----------------------$RECET""")

    print("Quer contar até Quantos? ")
    val n:Int = readln().toInt()

    var cont:Int = 1
    while (cont <= n){
        if (cont % 4 != 0){
            print("$AZUL$cont - ")
        } else {
            print("PIN! - ")
        }
        Thread.sleep(500)
        cont++
    }
    println("FIM!$RECET")
}