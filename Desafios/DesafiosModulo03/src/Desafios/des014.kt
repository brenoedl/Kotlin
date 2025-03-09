package Desafios

import java.text.NumberFormat
import java.util.*

fun main() {
    var nome:String
    var sexo:Char
    var resp:Char
    var sal:Float
    var ssalh = 0.0f
    var ssalm = 0.0f
    var maisalh = 0.0f
    var tot = 0
    var toth = 0
    var totm = 0

    while (true){
        print("Nome: ")
        nome = readln()
        print("Sexo [M/F]: ")
        sexo = readln()[0]
        print("Salario: ")
        sal = readln().toFloat()

        tot++

        if (sexo == 'm' || sexo == 'M'){
            toth++
            ssalh += sal

            if (toth == 1 || sal > maisalh){
                maisalh = sal
            }

        }else if (sexo == 'f' || sexo == 'F'){
            totm++
            ssalm += sal
        }

        print("Quer continuar? [S/N] ")
        resp = readln()[0]

        if (resp == 'n' || resp == 'N'){
            break
        }

        println("-----------------------------------")
    }

    val msalh = ssalh / toth
    val msalm = ssalm / totm
    val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))

    println("""$VERDE========= RESULTADOS ===========
Total de funcionarios: $tot
Total de homens: $toth
Total de mulheres: $totm
A média dos salarios dos homens é ${formato.format(msalh)}.
A média dos salarios das mulheres é ${formato.format(msalm)}.
O maior salario entre os homens é de ${formato.format(maisalh)}.$RECET""")
}