package task_3

fun main (){
    println("TASK 3")
    print("Input Number: ")
    val number: Int = readLine()!!.toInt()
    oddEven(number)

}
fun oddEven(number: Int) {
    if(number %2==0){
        println("Number $number is even")
    } else {
        println("Number $number is odd")
    }
}