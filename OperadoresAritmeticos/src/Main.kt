fun main() {
    print("Primeiro valor: ")
    val v1:Int = readln().toIntOrNull()?:0
    print("Segundo valor: ")
    val v2:Int = readln().toIntOrNull()?:0

    println("$v1 + $v2 = ${v1+v2}")
    println("$v1 - $v2 = ${v1-v2}")
    println("$v1 * $v2 = ${v1*v2}")
    println("$v1 / $v2 = ${v1/v2.toFloat()}")
    print("$v1 % $v2 = ${v1%v2}")
}