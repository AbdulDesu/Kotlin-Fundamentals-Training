package task_13

fun main () {
    println("TASK 13")
    println("Input a number with zero divider, Let me merge & sort it")
    println("Input number: ")
    val number: Long = readLine()!!.toLong()
    merger(number)
}

fun merger (number: Long) {

    val spliter = number.toString().split("0").sorted()
    val converter = spliter.joinToString("")
    val sorter = converter.toCharArray().sorted()
    val theNumber = sorter.joinToString("")
    println("===RESULT===\n$theNumber")
}