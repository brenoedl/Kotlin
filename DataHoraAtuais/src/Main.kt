import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val dh = LocalDateTime.now()
    val formato = DateTimeFormatter.ofPattern("yyyy")
    val anoAtual:Int = formato.format(dh).toInt()
    println(dh)
    print(anoAtual)
}