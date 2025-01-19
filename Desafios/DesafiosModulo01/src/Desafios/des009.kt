package Desafios

import java.time.LocalDateTime

fun main() {
    val dh:LocalDateTime = LocalDateTime.now()

    println("""${VERMELHO}----------------------------------
            DATA E HORA
----------------------------------${RECET}""")

    print("""${AMALERO}------------RESULTADO-------------
Ano:                ${dh.year}
Mês:                ${dh.monthValue}
Dia:                ${dh.dayOfMonth}
Hora:               ${dh.hour}
Minuto:             ${dh.minute}
Segundo:            ${dh.second}
----------------------------------${RECET}""")
}