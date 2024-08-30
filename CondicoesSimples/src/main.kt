fun main() {
    print("Qual a velocidade do veiculo? (Km/h) ")
    val vel:Short = readln().toShort()
    println("Você está dirigindo a ${vel}Km/h")
    if (vel >= 80){
        println("Multado")
    }
    println("Dirija com cuidado")
}