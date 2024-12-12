fun main() {

    for (c in 1 .. 10){
        print("$c")
        if (c < 10){
            print(" ")
        }
    }

    println()

    for (c in 10 downTo 2 step 2){
        print("$c")
        if (c > 2){
            print(" ")
        }
    }
}
