package Desafios

fun main() {
    print("Qual o seu peso aqui na terra? (Kg) ")
    val  peso:Float = readln().toFloat()
    println("---------------------------")
    println("\tESCOLHA UM PLANETA")
    println("---------------------------")
    println("1\tMercúrio")
    println("2\tVênus")
    println("3\tMarte")
    println("4\tJúpiter")
    println("5\tSaturno")
    println("6\tUrano")
    println("7\tNetuno")
    println("===========================")
    print("Digitte sua opção => ")
    val opcao:Int = readln().toInt()
    println("===========================")
    var pesoPlaneta:Float
    when(opcao){
        1 -> {
            pesoPlaneta = peso * 0.37f
            println("No planeta Mercúrio.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        2 -> {
            pesoPlaneta = peso * 0.88f
            println("'No planeta Vênus.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        3 -> {
            pesoPlaneta = peso * 0.38f
            println("No planeta Marte.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        4 -> {
            pesoPlaneta = peso * 2.64f
            println("No planeta Jupiter.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        5 -> {
            pesoPlaneta = peso * 1.15f
            println("No planeta Saturno.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        6 -> {
            pesoPlaneta = peso * 1.17f
            println("No planeta Urano.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        7 -> {
            pesoPlaneta = peso * 1.18f
            println("No planeta Netuno.\nSeu peso seria ${"%.2f".format(pesoPlaneta)}")
        }
        else -> {
            pesoPlaneta = peso * 0
            println("Seu peso não pode ser\ncalculado em outros planetas.\nTente novamente")
        }
    }
}