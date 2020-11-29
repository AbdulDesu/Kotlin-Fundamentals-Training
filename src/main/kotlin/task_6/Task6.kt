package task_6

fun main(){
    println("TASK 6")
    println("The formula for calculating the area of a circle is phi * r * r ")
    println("Did you know the radius?")
    println("Type 1 for 'Yes' \nType 2 for 'No'")
    val input: Int = readLine()!!.toInt()
    if(input == 1){
        println("Input radius:")
        val radius: Int = readLine()!!.toInt()
        if(radius %7==0){
            val selectedPhi = 2
            circle(radius, selectedPhi)
        }
        else{
            val selectedPhi = 1
            circle(radius, selectedPhi)
        }


    }
    else if (input == 2){
        println("Input diameter:")
        val diameter: Int = readLine()!!.toInt()/2 // change to radius
        val radius = diameter
        if(radius %7==0){
            val selectedPhi = 2
            circle(radius, selectedPhi)
        }
        else{
            val selectedPhi = 1
            circle(radius, selectedPhi)
        }
    }
    else{
        println("Invalid Respond, Please input '1' or '2'!")
    }
}

fun circle (radius: Int, selectedPhi: Int) {
    if (selectedPhi == 1){
        val phi = 3.14
        val total = phi * (radius * radius )
        println("Calculating $phi * $radius * $radius ...")
        println("Result: ${total}")
    }
    else if (selectedPhi == 2){
        val phi = 22.0/7.0
        val total = phi * (radius * radius)
        println("Calculating $phi * $radius * $radius ...")
        println("Result: ${total}")
    }
    else{
        println("Are u sure input the correct number?")
    }
}