fun main() {
    var idade:Int
    do {
        print("Digite a sua idade: ")
        idade = readln().toInt()

        if (idade < 0 || idade > 130) {
            println("Idade inválida.")
        }
    }while (!(idade in 0..130))

    println("Sua idade é $idade anos.")
}