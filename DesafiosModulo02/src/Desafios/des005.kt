package Desafios

fun main() {
    print("Digite um ano qualquer: ")
    val ano:Int = readln().toInt()
    print("O ano de $ano ")
    if (ano % 4 == 0 && ano % 100 != 0 || ano %  400 == 0){
        println("é BISSEXTO")
    }else{
        println("NÂO é BISSEXTO")
    }
}