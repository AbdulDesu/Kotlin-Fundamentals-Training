package task_8

fun main () {
    println("TASK 8")
    println("Know your average score & rating at Final Exam!")
    println("1.Input your mathematics score: ")
    val math: Int = readLine()!!.toInt()
    println("2.Input your indonesian score: ")
    val iLang: Int = readLine()!!.toInt()
    println("3.Input your english score: ")
    val eLang: Int = readLine()!!.toInt()
    println("4.Input your natural science score: ")
    val nScience: Int = readLine()!!.toInt()
    println("Calculating result...")
    grading(math,iLang,eLang,nScience)

}

fun grading (math:Int, iLang:Int, eLang:Int, nScience:Int) {
    val score = (math+iLang+eLang+nScience) / 4
    if(score >= 90) {
        println("Your average score is : $score")
        println("Your grade is A")
    }
    else if (score >= 80) {
        println("Your average score is : $score")
        println("Your grade is B")
    }
    else if (score >= 70) {
        println("Your average score is : $score")
        println("Your grade is C")
    }
    else if (score >= 60) {
        println("Your average score is : $score")
        println("Your grade is D")
    }
    else {
        println("Your average score is : $score")
        println("Your grade is E")
    }
}