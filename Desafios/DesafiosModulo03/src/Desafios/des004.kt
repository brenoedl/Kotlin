package Desafios

fun main() {
    var c:Int = 1
    var n:Int
    var somaPar:Int = 0
    var somaImpar:Int = 0
    while (c <= 5){
        print("Digite o $c° valor: ")
        n = readln().toInt()
        if (n % 2 == 0){
            somaPar += n
        }else{
            somaImpar += n
        }
        c++
    }
    println("A soma dos pares deu: $somaPar")
    print("A soma dos impares deu: $somaImpar")
}