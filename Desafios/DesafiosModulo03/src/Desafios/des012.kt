package Desafios

fun main() {
    print("Operamdo 1: ")
    var n1:Int = readln().trim().toInt()
    print("Operamdo 2: ")
    var n2:Int = readln().trim().toInt()

    var opcao = 0
    while (opcao != 5){
        print("""========= ESCOLHA UMA OPERAÇÃO ==========
[ 1 ] Adição
[ 2 ] Subtrasão
[ 3 ] Multiplicasão
[ 4 ] Etrar com novos dados
[ 5 ] Sair
>>>>> SUA OPÇÃO: """)

        opcao = readln().trim().toInt()
        when (opcao) {
            1 -> println("""-----------------------------
Calculando $n1 + $n2 = ${n1 + n2}
-----------------------------""")
            2 -> println("""-----------------------------
Calculando $n1 - $n2 = ${n1 - n2}
-----------------------------""")
            3 -> println("""-----------------------------
Calculando $n1 * $n2 = ${n1 * n2}
-----------------------------""")
            4 -> {
                print("Operamdo 1: ")
                n1 = readln().trim().toInt()
                print("Operamdo 2: ")
                n2 = readln().trim().toInt()
            }
            5 -> println("====== SAINDO ======")
            else -> println("====== OPÇÃO INVALIDA ======")
        }
        Thread.sleep(500)
    }

    print("====== VOLTE SEMRE ======")
}