fun main() {
    var cont:Byte = 1
    var num:Int
    var menor:Int = 0
    var maior:Int = 0

    while (cont <= 5){
        print("Digite o ${cont}° número: ")
        num = readln().toInt()

        if (cont.toInt() == 1){
            menor = num
            maior = num
        }else{
            if (num < menor){
                menor = num
            }
            if (num > maior){
                maior = num
            }
        }
        cont++
    }

    println("O menor número digitado foi $menor!")
    print("O maíor número digitado foi $maior!")
}