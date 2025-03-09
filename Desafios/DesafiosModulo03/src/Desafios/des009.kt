package Desafios

fun main() {
    var nome: String
    var novo: String = " "
    var velho: String = " "
    var idade: Int
    var menor: Int = 0
    var maior: Int = 0

    var cont = 1
    while (cont <= 4){
        println("""$AMALERO---------------------------
        ${cont}ª pessoa
---------------------------$RECET""")
        print("Nome: ")
        nome = readln().trim()
        print("Idade: ")
        idade = readln().trim().toInt()
        if (cont == 1){
            novo = nome
            menor = idade
            velho = nome
            maior = idade
        }else{
            if (idade < menor){
                novo = nome
                menor = idade
            }
            if (idade > maior){
                velho = nome
                maior = idade
            }
        }
        cont++
    }
    println("""$VERDE================================================
A pessoa mais jovem é $novo com $menor anos.
A pessoa mais velha é $velho com $maior anos.$RECET""")
}