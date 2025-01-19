fun main() {
    var num:Int
    var soma:Int = 0
    var teclado:String
    var resp:Char

    while (true){
        print("Digite o valor: ")
        num = readln().toInt()
        soma += num
        print("Quer continuar? ")
        teclado = readln()
        resp = teclado[0]

        if (resp == 'N' || resp == 'n'){
            break
        }
    }

    println("A soma entre todos os número foi $soma!")
}