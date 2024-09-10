package Desafios

import java.text.NumberFormat
import java.time.LocalTime
import java.util.*
fun main() {
    val t = LocalTime.now()
    val horaAtual:Byte = t.hour.toByte()
    val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    val horaCecao:Byte = 15
    val ingresso:Float = 29.99f
    println("\t\t\tCINEMA DO BRENO\t\t\t")
    println("========================================")
    println("HORARIO DO FILMME: \t\t\t ${horaCecao}h")
    println("PREÇO DO INGRESSO: \t\t\t ${formato.format(ingresso)}")
    println("========================================")
    println("Agora são $horaAtual horas")
    print("Quando de dinhero você tem? R$")
    val din:Float = readln().toFloat()
    println("========================================")
    if (horaAtual <= horaCecao && din >= ingresso){
        println("${VERDE}Você consegue comprar o ingresso\nSEJA BEM-VINDO(A)!${RECET}")
    }else{
        println("${VERMELHO}Infelizmente, não é possível comprar o ingresso.\nTente outro dia!${RECET}")
    }
}