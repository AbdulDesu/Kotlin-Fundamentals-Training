package task_5

fun main() {
    println("TASK 5")
    println("The formula for calculating the area of triangle is 1/2 * Base * Height")
    println("So, Triangle Base is?")
    val base: Int = readLine()!!.toInt()
    println("How about height?")
    val height: Int = readLine()!!.toInt() 
    println("Calculating the result...")
    triangle(base, height)
}

fun triangle (base: Int, height: Int) {
    val result = 1.0/2.0*base*height
    println("1/2 * $base * $height")
    println("Result is: ${result.toInt()}cm²")
}