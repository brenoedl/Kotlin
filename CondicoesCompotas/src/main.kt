fun main(args: Array<String>) {
    print("Qual a sua idade? ")
    val idade:Byte = readln().toByte()
    print("Você tem $idade anos de idade portanto. Você é ")
    if (idade >= 18){
        println("Maior de idade.")
    }else{
        println("Menor de idade.")
    }
}