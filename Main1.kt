class Person {
    private var name: String = ""

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Name: " + name)
    }
}

fun main() {
    println("Введите количество имен")
    val numberOfPeople = readLine()!!.toInt()
    val people = mutableListOf<Person>()
    println("Введите имена")
    for (i in 1..numberOfPeople) {
        val name = readLine()!!
        val person = Person()
        person.setName(name)
        people.add(person)
    }

    for (person in people) {
        person.printName()
    }
}
