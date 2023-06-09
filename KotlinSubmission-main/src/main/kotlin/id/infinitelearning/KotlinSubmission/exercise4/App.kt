package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    fun perkalianAngka(a: Int, b: Int): Int {
        var result = 0
        try {
            result = a * b
        } catch (e: ArithmeticException) {
            println("Error: ${e.message}")
        }
        return result
    }

    val a = 13
    val b = 5
    val result = perkalianAngka(a, b)
    println("Hasil perkalian: $result")



}