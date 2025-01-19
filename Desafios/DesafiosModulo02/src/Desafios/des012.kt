package Desafios

fun main() {
    print("Em que estado você nasceu? Ex: XX ")
    val estado:String = readln().uppercase()
    print("Nascendo no estado $estado Você é ")
    if (estado == "AC"){
        println("Acreando")
    }else if (estado == "AL"){
        println("Alagoano")
    }else if (estado == "AP"){
        println("Amapaense")
    }else if (estado == "AM"){
        println("Amazonense")
    }else if (estado == "BA"){
        println("Baiano")
    }else if (estado == "CE"){
        println("Cearense")
    }else if (estado == "DF"){
        println("Brasiliense")
    }else if (estado == "ES"){
        println("Capixaba")
    }else if (estado == "GO"){
        println("Goiano")
    }else if (estado == "MA"){
        println("Maranhense")
    }else if (estado == "MT"){
        println("Mato-grossense")
    }else if (estado == "MS"){
        println("Sul-mato-grossense")
    }else if (estado == "MG"){
        println("Mineiro")
    }else if (estado == "PA"){
        println("Paraense")
    }else if (estado == "PB"){
        println("Paraibano")
    }else if (estado == "PR"){
        println("Paranaense")
    }else if (estado == "PE"){
        println("Pernambucano")
    }else if (estado == "PI"){
        println("Piauiense")
    }else if (estado == "RJ"){
        println("Fluminense")
    }else if (estado == "RN"){
        println("Potiguar")
    }else if (estado == "RO"){
        println("Rondoniano")
    }else if (estado == "RS"){
        println("Gaúcho")
    }else if (estado == "RR"){
        println("Roraimense")
    }else if (estado == "SC"){
        println("Catarinense")
    }else if (estado == "SE"){
        println("Sergipano")
    }else if (estado == "SP"){
        println("Paulista")
    }else if (estado == "TO"){
        println("tocantinense")
    }else{
        println("ESSE ESTADO NÃO ESSISTE!")
    }
}