package Desafios

fun main() {
    print("Primeira nota: ")
    val nota1:Float = readln().toFloat()
    print("Segunda nota: ")
    val nota2:Float = readln().toFloat()
    val media:Float = (nota1 + nota2) / 2
    println("${VERDE}------------- RESULTADO -------------${RECET}")
    if (media >= 7){
        print("PARABNS")
    }
    print("A sua média final foi $media")
}