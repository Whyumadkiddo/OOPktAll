open class Animal {
    open fun sound() {
        println(" ")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Гав")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Мяу")
    }
}

class Bird : Animal() {
    override fun sound() {
        println("Чирик Чирик")
    }
}

fun main() {
    println("Введите имя животного чтобы увидить звук(Собака, Кот, Птичка)")
    val animalName = readLine()!!

    val animal: Animal = when (animalName) {
        "Собака" -> Dog()
        "Кот" -> Cat()
        "Птичка" -> Bird()
        else -> throw IllegalArgumentException("Такого животного здесь нет")
    }

    animal.sound()
}
