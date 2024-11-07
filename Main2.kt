open class Person {
    private var name: String = ""

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        print("Name: " + name)
    }
}

class Student : Person() {
    private var studentId: Int = 0

    fun setStudentId(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        printName()
        println(", Student ID: " + studentId)
    }
}

fun main() {
    println("Введите кол-во студентов")
    val n = readLine()!!.toInt()
    val students = mutableListOf<Student>()
    println("Введите имя и айди студента")
    for (i in 1..n) {
        val input = readLine()!!.split(" ")
        val name = input[0]
        val studentId = input[1].toInt()

        val student = Student()
        student.setName(name)
        student.setStudentId(studentId)
        students.add(student)
    }

    for (student in students) {
        student.printStudentDetails()
    }
}
