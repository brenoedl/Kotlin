package Desafios

fun main() {
    println("----------------------------------------")
    println("\t\tTRÊS VALORES EM ORDEM\t\t")
    println("----------------------------------------")
    print("Primeiro valor: ")
    val v1:Int = readln().toInt()
    print("Segundo valor: ")
    val v2:Int = readln().toInt()
    print("Terceiro valor: ")
    val v3:Int = readln().toInt()
    val maior:Int
    val meio:Int
    val menor:Int
    if (v1 > v2){
        if (v3 > v1){
            maior = v3
            meio = v1
            menor = v2
        }else if (v3 > v2){
            maior = v1
            meio = v3
            menor = v2
        }else{
            maior = v1
            meio = v2
            menor = v3
        }
    }else if  (v3 > v2){
        maior = v3
        meio = v2
        menor = v1
    }else if (v3 > v1){
        maior = v2
        meio = v3
        menor = v1
    }else{
        maior = v2
        meio = v1
        menor = v3
    }
    println("----------------------------------------")
    println("MENOR: $menor")
    println("INTERMEDIÁRIO: $meio")
    println("MAIOR: $maior")
}