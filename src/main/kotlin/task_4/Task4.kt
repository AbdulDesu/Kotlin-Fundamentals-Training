package task_4

fun main(){
    println("TASK 4")
    println("Age Calculator")
    println("What year is it now: ")
    val year: Int = readLine()!!.toInt()
    println("When you was born?")
    val birthYear: Int = readLine()!!.toInt()
    ageCalculator(year, birthYear)
}

fun ageCalculator (year: Int, birthYear: Int) {
    if(year>birthYear){
        val age = year-birthYear
        println("Now is $year, and you born at $birthYear")
        println("So, Your Age is : $age Years old ")
        if(age<=64){
            println("Woah, Productive Age!")
        }
        else if(age<=100){
            println("Age is not a limit, keep that spirit. Do your best!")
        }
        else{
            println("No comment...")
        }
    } else{
        println("You are time traveler? please input the correct data!")
    }
}