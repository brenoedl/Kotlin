fun main() {
    print("Digite um número de 0 a 9: ")
    val num:Int = readln().toInt()
    when(num){
        0 -> println("Zero")
        1 -> println("Um")
        2 -> println("Dois")
        3 -> println("Três")
        4 -> println("Quatro")
        5 -> println("Cinco")
        6 -> println("Seis")
        7 -> println("Sete")
        8 -> println("Oito")
        9 -> println("Nove")
        else -> println("Erro")
    }
}