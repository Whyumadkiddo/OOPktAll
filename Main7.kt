class Car(val brand: String, val year: Int) {
    fun printDetails() {
        println("Марка: " + brand + " Год:" + year)
    }
}

fun main() {
    println("Введите количество автомобилей:")
    val n = readLine()!!.toInt()
    println("Введите Марку и год выпуска автомобиля")
    for (i in 1..n) {
        val input = readLine()!!.split(" ")
        val brand = input[0]
        val year = input[1].toInt()

        val car = Car(brand, year)
        car.printDetails()
    }
}