package Desafios

fun main() {
    print("Primeiro valor: ")
    val v1:Int = readln().toInt()
    print("Segundo valor: ")
    val v2:Int = readln().toInt()
    if (v1 < v2){
        println("Os valores em ordem são: $v1 e $v2")
    }else if (v1 > v2){
        println("Os valores em ordem são: $v2 e $v1")
    }else{
        println("Não há necesssidade de ordená-los. Os valores são iguais!")
    }
}