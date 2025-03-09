package Desafios

fun main() {
    var nome:String
    var novo = " "
    var velho = " "
    var idade:Int
    var menor = 0
    var maior = 0
    var total = 0
    var soma = 0

    while (true){
        println("""------------- NOVO AMIGO -------------
OBS: Digite ACABOU no nome para parar""")
        print("Nome: ")
        nome = readln().trim()

        if (nome.uppercase() == "ACABOU"){
            break
        }

        print("Idade: ")
        idade = readln().trim().toInt()

        soma += idade
        total++

        if (total == 1){
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
    }
    val media = soma.toFloat() / total

    println("""************* INTERROPIDO *************
=================== RESULTADO ===================
Total de amigos: $total
A media das idades: $media
Seu amigo mais jovem é $novo com $menor anos
Seu amigo mais velho é $velho com $maior anos
------------------------------------------------""".trimMargin())
}