package Desafios

fun main() {
    var c:Int = 1
    var contPar:Int = 0
    var contImpar:Int = 0
    var n:Int
    var somaPar:Int = 0
    var somaImpar:Int = 0
    while (c <= 5){
        print("Digite o $c° valor: ")
        n = readln().toInt()
        if (n % 2 == 0){
            contPar++
            somaPar += n
        }else{
            contImpar++
            somaImpar += n
        }
        c++
    }
    val mediaPar:Float = somaPar.toFloat() / contPar
    val mediaImpar:Float = somaImpar.toFloat() / contImpar
    println("-----------------------------------------------")
    println("Você digitou $contPar número pares e a média foi $mediaPar.")
    print("Você digitou $contImpar número impares e a média foi $mediaImpar.")
}