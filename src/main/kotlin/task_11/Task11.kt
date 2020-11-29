package task_11

fun main () {
    println("TASK 11")
    println("Lets check is that palindome or not")
    println("Input text: ")
    val text: String = readLine()!!.toUpperCase()
    checkPalindrome(text)
}

fun checkPalindrome(text: String){
    var reverse = text.reversed()

    if(text == reverse){
        println("$text is palindrome")
    }

    else{
        println("$text is not palindrome")
    }
}