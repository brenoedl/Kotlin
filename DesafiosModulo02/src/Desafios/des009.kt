package Desafios

fun main() {
    print("Digite um número: ")
    val num:Int = readln().toInt()
    print("O número $num é ")
    if (num > 0){
        println("POSITTIVO")
    }else if (num < 0){
        println("NEGATIVO")
    }else{
        println("NULO")
    }
}