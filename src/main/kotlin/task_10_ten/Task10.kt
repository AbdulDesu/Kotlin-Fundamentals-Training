package task_10_ten

fun main () {
    println("TASK 10")
    println("Type the word and let me, order it from vocal then consonant")
    println("Input the word: ")
    var input = readLine()!!.toString().toLowerCase()
    input = input.replace("\\s".toRegex(),"") // Remove spaces, So still good for more than one word XD
    val sort = input.toCharArray().sorted()
    sayTheWord(sort, input)
}

fun sayTheWord(sort: List<Char>, input: String){
    for (vocal in sort) {
        if(vocal == 'a'){
            println(vocal)
            continue
        }else if(vocal == 'i'){
            println(vocal)
            continue
        }else if(vocal == 'u'){
            println(vocal)
            continue
        }else if (vocal == 'e') {
            println(vocal)
            continue
        }else if (vocal == 'o'){
            println(vocal)
            continue
        }
        else{
            continue
        }
        println(vocal)
    }
    for(consonant in input){
        if(consonant == 'a'|| consonant == 'i' || consonant == 'u' || consonant == 'e' || consonant == 'o'){
            continue
        }
        else{
            println(consonant)
        }
    }
}