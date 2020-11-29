package task_9

fun main () {
    println("TASK 9")
    println("Make a triangle from number")
    println("Input number: ")
    val number: Int = readLine()!!.toInt()
    println("Building triangle.. Done, This is for you:")
    triangle(number)
}

fun triangle(number: Int){
    for (height in number downTo 1) {
        for (width in 1..height) {
            print("$width ")
        }
        println()
    }
}