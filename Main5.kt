open class Person(val name: String, val role: String) {
    open fun showInfo() {
        println("Имя: " + name + " Роль: " + role)
    }
}

class Moderator(name: String) : Person(name, "Moderator") {
    override fun showInfo() {
        println("Модератор: " + name)
    }
}

class Admin(name: String) : Person(name, "Admin") {
    override fun showInfo() {
        println("Админ: " + name)
    }
}

fun main() {
    println("Введите имя и роль")
    val input = readLine()!!.split(" ")
    val name = input[0]
    val role = input[1]

    val person: Person = when (role) {
        "Модератор" -> Moderator(name)
        "Админ" -> Admin(name)
        else -> throw IllegalArgumentException("Неправильная роль")
    }

    person.showInfo()
}
