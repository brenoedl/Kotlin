package Desafios

fun main() {
    println("""${VERMELHO}----------------------------------
        BANCO ESTUDONAUTA
----------------------------------${RECET}""")

    print("Que valor você quer sacar? R$")
    val valor:Int = readln().toInt()

    val n200:Int = valor / 200
    val r200:Int = valor % 200
    val n100:Int =  r200 / 100
    val r100:Int = r200 % 100
    val n50:Int = r100 / 50
    val r50:Int = r100 % 50
    val n20:Int = r50 / 20
    val r20:Int = r50 % 20
    val n10:Int = r20 / 10
    val r10:Int = r20 % 10
    val n5:Int = r10 / 5
    val r5:Int = r10 % 5
    val n2:Int = r5 / 2
    val m1:Int = r5 % 2

    print("""${AMALERO}------------RESULTADO-------------
Notas 200:          $n200
Notas 100:          $n100
Notas 50:           $n50
Notas 20:           $n20
Notas 10:           $n10
Notas 5:            $n5
Notas 2:            $n2
Moedas 1:           $m1
----------------------------------${RECET}""")
}