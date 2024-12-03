fun main() {
    var n:Int
    var c:Int = 1
    var s:Int = 0

    while (c <= 5){
        print("Digite o ${c}º número: ")
        n = readln().toInt()
        s += n
        c ++
    }
    println("A soma de todos os ${c - 1} números é $s!")
}
