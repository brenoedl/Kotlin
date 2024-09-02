package Desafios

import java.text.NumberFormat
import java.util.*
fun main() {
    println("""${AMALERO}---------------------
     Torra torra
---------------------${RECET}""")
    val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    print("Qual foi valor total da compra? R$")
    val compra:Float = readln().toFloat()
    println("${AZUL}--------------------- RESULTADO ---------------------")
    println("Você comprou ${formato.format(compra)} na nossa loja OBRIGADO!")
    if (compra >= 500){
        val valor_desc:Float = compra * 10 / 100
        val desc:Float = compra - valor_desc
        println("${VERMELHO}==================== ATENÇÃO ====================${RECET}")
        println("${AZUL}Por fazzer mais de \$R 500,00 em compras.")
        println("Você vai receber ${formato.format(valor_desc)} de desconto.")
        println("O valor a ser pago será de ${formato.format(desc)}!")
    }
    println("Volte sempre!${RECET}")
}