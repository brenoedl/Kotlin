fun main(args: Array<String>) {

    print("Qual o seu nome? ")
    val nome:String = readln()

    print("Olá $nome qual a sua idade? ")
    val idade:Short = readln().toShort()

    print("$nome você tem $idade anos de idade")
}