class MathOperations {
    fun add(a: Number, b: Number): Double {
        return a.toDouble() + b.toDouble()
    }

    fun subtract(a: Number, b: Number): Double {
        return a.toDouble() - b.toDouble()
    }

    fun multiply(a: Number, b: Number): Double {
        return a.toDouble() * b.toDouble()
    }

    fun divide(a: Number, b: Number): Double {
        return a.toDouble() / b.toDouble()
    }
}

fun main() {
    println("Укажите тип данных (int, double)")
    val dataType = readLine()!!

    println("Укажите знак(add substract multiply divide)")
    val operation = readLine()!!

    println("Первое число: ")

    val num1 = when (dataType) {
        "int" -> readLine()!!.toInt()
        "double" -> readLine()!!.toDouble()
        else -> throw IllegalArgumentException("Что-то не то")
    }

    println("Второе число: ")

    val num2 = when (dataType) {
        "int" -> readLine()!!.toInt()
        "double" -> readLine()!!.toDouble()
        else -> throw IllegalArgumentException("Что-то не то")
    }

    val mathOperations = MathOperations()
    var result: Double = 0.0

    when (operation) {
        "add" -> result = mathOperations.add(num1, num2)
        "subtract" -> result = mathOperations.subtract(num1, num2)
        "multiply" -> result = mathOperations.multiply(num1, num2)
        "divide" -> result = mathOperations.divide(num1, num2)
    }

    println(result)
}
