package task_7

fun main (){
    println("TASK 7")
    println("Check a year is it Kabisat year, Or Not.")
    println("Input year: ")
    val year: Int = readLine()!!.toInt()
    kabisatYear(year)

}

fun kabisatYear(year: Int){
    var kabisat: Boolean
    if(year % 4 == 0){
        if(year % 100 == 0){
            kabisat = year % 400 == 0
        }
        else {
            kabisat = true
        }
    }
    else{
        kabisat = false
    }
    println("Checking is it kabisat or no...")

    if(kabisat){
        println("$year is kabisat year")
    }
    else{
        println("$year is not kabisat year")
    }
}