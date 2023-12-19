fun main() {
    print("Qual o seu nome? ")
    val nome:String = readln()

    print("Olá $nome qual a sua idade? ")
    val idade:Int = readln().toIntOrNull()?:0

    print("$nome você tem $idade anos de idade")
}