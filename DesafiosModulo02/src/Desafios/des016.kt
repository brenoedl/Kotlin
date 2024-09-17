package Desafios

import java.text.NumberFormat
import java.util.*

fun main() {

    val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    print("Qual o preço do produto? R$")
    val preco:Float = readln().toFloat()
    println("---------------------------------------")
    println("\t\tREASUSTADOR DE PREÇO")
    println("---------------------------------------")
    println("1\tCarnaval\t\t\t\t[+10%]")
    println("2\tFérias Escolares\t\t[+20%]")
    println("3\tDia das Crianças\t\t[+5%]")
    println("4\tBlack Friday\t\t\t[-30%]")
    println("5\tNatal\t\t\t\t\t[-5%]")
    println("=========================================")
    print("Digitte sua opção => ")
    val opcao:Int = readln().toInt()
    println("=========================================")
    val novoPreco:Float
    when(opcao){
        1 -> {
            novoPreco = preco + preco * 10 / 100
            println("Na época de Canaval, o preço do produto aumenta para ${formato.format(novoPreco)}")
        }
        2 -> {
            novoPreco = preco + preco * 20 / 100
            println("Na época de Férias Escolares, o preço do produto aumenta para ${formato.format(novoPreco)}")
        }
        3 -> {
            novoPreco = preco + preco * 5 / 100
            println("Na época de Dia das Crianças, o preço do produto aumenta para ${formato.format(novoPreco)}")
        }
        4 ->{
            novoPreco = preco - preco * 30 / 100
            println("Na época de Black Friday, o preço do produto abaixa para ${formato.format(novoPreco)}")
        }
        5 -> {
            novoPreco = preco - preco * 5 / 100
            println("Na época de Natal, o preço do produto abaixa para ${formato.format(novoPreco)}")
        }
        else -> {
            novoPreco = preco
            println("Em épocas assim, mantenha o preço do produto em ${formato.format(novoPreco)}")
        }
    }
}