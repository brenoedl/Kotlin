package Desafios

fun main(args: Array<String>) {
    println("""${VERMELHO}-----------------------------------
        NOTAS ESTUDONALTA
----------------------------------${RECET}""")

    print("Nota 1: ")
    val n1:Float = readln().toFloat()
    print("Nota 2: ")
    val n2:Float = readln().toFloat()

    print("""${AMALERO}------------RESULTADO-------------
As notas do aluno foram $n1 e $n2
A média final foi ${(n1 + n2) / 2}
----------------------------------${RECET}""")
}