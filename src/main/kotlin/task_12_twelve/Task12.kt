package task_12_twelve

fun main () {
    println("TASK 12")
    println("Hey, Let me reverse a word from what you type")
    println("Input the word:")
    val word: String = readLine()!!.toString().toLowerCase()
    reverseWord(word)
}

fun reverseWord (word: String) {
    val reverse = word.split(" ")
    val reverseWord = reverse.reversed()
    val theWord = reverseWord.joinToString("" + " ")
    println("...REVERSED...\n${theWord.capitalize()}")
}