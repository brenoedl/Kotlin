package Desafios

fun main() {
    print("Quantas pessoas vamos cadastrar? ")
    val tot:Int = readln().toInt()
    print("Qual o peso de referência? ")
    val referencia:Float = readln().toFloat()
    var peso:Float
    var sexo:Char
    var totHomens:Int = 0
    var totMulheres:Int = 0

    var contador:Int = 1
    while (contador <= tot){
        println("""---------------------------------
        PESSOA $contador DE $tot
---------------------------------""")
        print("Qual o sexo da pessoa? ")
        sexo = readln()[0]
        print("Qual o peso da pessoa? ")
        peso = readln().toFloat()
        if (peso <= referencia){
            println("$VERDE===== PESO DENTRO DO LIMITE =====$RECET")
        } else {
            println("$VERMELHO===== PESO ACIMA DO LIMITE =====$RECET")
            if (sexo == 'M' || sexo == 'm'){
                totHomens++
            } else if (sexo == 'F' || sexo == 'f') {
                totMulheres++
            }
        }
        contador++
    }

    Thread.sleep(1000)
    println("""----------------RESULTADOS----------------
Ao todo temos  $totHomens homens e $totMulheres mulheres.
Acima do pesp de referencia!""")
}