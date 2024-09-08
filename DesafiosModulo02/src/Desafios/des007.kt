package Desafios

fun main() {
    println("==== Números positivos: ONVERSO | Outros: OPOSTO  =====")
    print("Digite um número: ")
    val num:Int = readln().toInt()
    println("--------------------------------------------------------")
    var resp:Float
    if (num > 0){
        resp = 1 / num.toFloat()
        println("O inverso de $num é igual a ${"%.3f".format(resp)}")
    }else{
        resp = num.toFloat() * (-1)
        println("O opsto de $num é igual a ${resp.toInt()}")
    }
}