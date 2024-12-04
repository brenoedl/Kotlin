fun main() {
    var teclado:String
    var sexo:Char
    var cont:Byte = 1
    var contH:Byte = 0
    var contM:Byte = 0

    while (cont <= 5){
        print("Sexo da ${cont}ª pessoa: [M/F] ")
        teclado = readln()
        sexo = teclado[0]
        if (sexo == 'm' || sexo == 'M'){
            contH++
        }
        if (sexo == 'f' || sexo == 'F'){
            contM++
        }
        cont++
    }
    println("O total de meninos é $contH")
    print("O total de meninas é $contM")
}