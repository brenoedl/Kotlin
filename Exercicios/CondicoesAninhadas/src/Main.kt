fun main() {
    print("Digite o primero número: ")
    val n1:Short = readln().toShort()
    print("Digite o segundo número: ")
    val n2:Short = readln().toShort()
    if (n1 > n2){
        println("$n1 é maior que $n2")
    }else if (n1 < n2){
        println("$n2 é maior que $n1")
    }else{
        println("Eles são iguais")
    }
}