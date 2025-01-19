package Desafios

import java.text.NumberFormat
import java.util.*

fun main() {
    val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    println("${AMALERO}\t\t\tVIAÇÃO DO BRENO\t\t\t")
    println("----------------------------------------")
    println("VIAGENS ATÉ 200Km\t\t\tR\$0,50/Km")
    println("VIAGENS ACIMA DE 200Km\t\tR\$0,35/Km")
    println("========================================${RECET}")
    print("Informe a distancia da viagem em Km: ")
    val distancia:Float = readln().toFloat()
    println("${AZUL}---------------RRESULTADO---------------")
    var precoKm:Float = 0f
    if (distancia <= 200){
        precoKm = 0.5f
    }else{
        precoKm = 0.35f
    }
    val precoTotal:Float = precoKm * distancia
    println("Uma viagem de ${distancia}km vai costar ${formato.format(precoKm)}/Km")
    println("VALOR TOTAL: ${formato.format(precoTotal)}")
    println("========================================${RECET}")
}