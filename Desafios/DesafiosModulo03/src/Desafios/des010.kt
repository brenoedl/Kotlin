package Desafios

fun main() {
    var sexo:Char
    var nome: String
    var novoH = " "
    var novoM = " "
    var velhoH = " "
    var velhoM = " "
    var idade:Int
    var menorH = 0
    var menorM = 0
    var maiorH = 0
    var maiorM = 0
    var totH = 0
    var totM = 0

    var cont = 1
    while (cont <= 5){
        println("""$AZUL---------------------------
        ${cont}ª pessoa
---------------------------$RECET""")
        print("Nome: ")
        nome = readln().trim()
        print("Sexo [M/F]: ")
        sexo = readln().trim()[0]
        print("Idade: ")
        idade = readln().trim().toInt()
        if (sexo == 'M' || sexo == 'm'){
            totH++
            if (totH == 1){
                novoH = nome
                menorH = idade
                velhoH = nome
                maiorH = idade
            }else{
                if (idade < menorH){
                    novoH = nome
                    menorH = idade
                }
                if (idade > maiorH){
                    velhoH = nome
                    maiorH = idade
                }
            }
        }else if (sexo == 'F' || sexo == 'f'){
            totM++
            if (totM == 1){
                novoM = nome
                menorM = idade
                velhoM = nome
                maiorM = idade
            }else{
                if (idade < menorM){
                    novoM = nome
                    menorM = idade
                }
                if (idade > maiorM){
                    velhoM = nome
                    maiorM = idade
                }
            }
        }
        cont++
    }
    println("""$MAGENTA=============================================================
Ao todo tivemos $totH homens e $totM mulhres cadastrados.
O homem mais jovem é $novoH com $menorH anos.
O homem mais velho é $velhoH com $maiorH anos.
A mulher mais jovem é $novoM com $menorM anos.
A mulher mais velha é $velhoM com $maiorM anos.
=============================================================$RECET""")
}