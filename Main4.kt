interface Playable {
    fun play()
}

class Guitar : Playable {
    override fun play() {
        println("Играет гитара")
    }
}

fun main() {
    println("Напишите 'play' чтобы заиграла гитара")
    val command = readLine()!!

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    }
}
