fun main() {
    var num:Int
    var soma:Int = 0
    var teclado:String
    var resp:Char

    do{
        print("Digite o valor: ")
        num = readln().toInt()
        soma += num

        print("Quer continuar? [S/N] ")
        teclado = readln()
        resp = teclado[0]
    }while (resp == 'S' || resp == 's')

    println("A soma entre todos os número foi $soma!")
}