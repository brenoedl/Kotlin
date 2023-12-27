package Desafios
import java.time.LocalDateTime

fun main() {
    val dh:LocalDateTime = LocalDateTime.now()
    val anoAtual:Short = dh.year.toShort()

    println("""${VERMELHO}----------------------------------
        SUA IDADE
----------------------------------
${AZUL}Vou conseguir descobrir a sua idade${RECET}""")

    print("Em que ano você nasceu? ")
    val anoNasc:Short = readln().toShort()

    print("""${AMALERO}------------RESULTADO-------------
Atualmente estamos em $anoAtual
Você, que nasceu em $anoNasc
completa${AZUL} ${anoAtual - anoNasc} Anos ${AMALERO}nesse ano.
----------------------------------${RECET}""")
}