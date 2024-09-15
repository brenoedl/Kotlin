package Desafios

fun main() {
    println("---------------------------")
    println("\tSUPER CALCULADORA\t")
    println("---------------------------")
    println("+\tAdição")
    println("-\tSubtrasão")
    println("*\tMultiplicação")
    println("/\tDivisão")
    println("===========================")
    print("Digitte sua opção => ")
    val entrada:String? = readLine()
    var opcao:Char = if (entrada != null) entrada[0] else ' '
    when (opcao){
        '1' -> opcao = '+'
        '2' -> opcao = '-'
        '3' -> opcao = '*'
        '4' -> opcao = '/'
        '+' -> opcao = '+'
        '-' -> opcao = '-'
        '*' -> opcao = '*'
        '/' -> opcao = '/'
        else -> opcao = '+'
    }
    println("===========================")
    println("Você escolheu a opção $opcao")
    print("Digite o primeiro número: ")
    val n1:Int = readln().toInt()
    print("Digite o segundo número: ")
    val n2:Int = readln().toInt()
    println("Realizando a operação $n1 $opcao $n2")
    println("======= PROCESSANDO =======")
    print("O resultado da operação de ")
    when (opcao){
        '+' -> println("SOMA é ${n1+n2}")
        '-' -> println("SUBTRAÇÃO é ${n1-n2}")
        '*' -> println("MULTIPLICAÇÃO é ${n1*n2}")
        '/' -> println("DIVISÃO é ${n1.toFloat()/n2}")
    }
    println("===========================")

}