fun main(){
    var num:Int = 0
    var soma:Int = 0
    var cont:Int = 0

    while (num != 9999) {
        print("Digite o ${cont + 1}° número (9999 para): ")
        num = readln().toInt()
        if (num != 9999) {
            soma += num
        }
        cont++
    }

    println("A soma de todos os ${cont - 1} números é $soma!")
}