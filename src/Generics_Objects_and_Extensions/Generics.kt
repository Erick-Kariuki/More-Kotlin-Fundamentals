//class FillInTheBlankQuestion(
//    val questionText:String,
//    val answer:String,
//    val difficulty: String
//){}
//class BooleanQuestion(
//    val question: String,
//    val answer: String,
//    val difficulty: String
//){}
//class NumericQuestion(
//    val questionText: String,
//    val answer:Int,
//    val difficulty: String
//){}

fun main() {
//    Quiz().printProgressBar()
//    Recipe().printProgressBar()

//    val quiz = Quiz()
//    quiz.printQuiz()

    Quiz().apply { printQuiz() }
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY, MEDIUM, HARD
}

//Extend the Quiz class with an extension property
    //val Quiz.StudentProgress.progressText:String
    //    get() = "$answered of $total answered"

//Extend the Quiz class with an extension function
    //fun Quiz.StudentProgress.printProgressBar(){
    //    repeat(Quiz.answered){print("▓")}
    //    repeat((Quiz.total-Quiz.answered)){print("▒")}
    //    println()
    //    println(Quiz.progressText)
    //}


//Rewrite extension properties and functions using interfaces
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

//The Quiz class must now extend the interface containing extension property and function
class Quiz() : ProgressPrintable{
    override val progressText : String
        get() = "$answered of $total answered."

    override fun printProgressBar() {
        repeat(answered){print("▓")}
        repeat((total-answered)){print("▒")}
        println()
        println(progressText)
    }
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    //Use a singleton object
    companion object StudentProgress{
        var total = 10
        var answered = 3
    }

    fun printQuiz(){
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}




class Recipe():ProgressPrintable{
    override val progressText: String
        get() = "$completed steps completed, ${all - completed} steps remaining to complete the recipe."

    override fun printProgressBar() {
        repeat(completed){print("▓")}
        repeat(all - completed){print("▒")}
        println(progressText)
    }

    companion object RecipeSteps{
        var all = 20
        var completed = 13
    }

}
