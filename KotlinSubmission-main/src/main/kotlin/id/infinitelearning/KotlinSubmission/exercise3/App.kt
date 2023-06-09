package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    fun evaluateScore(score: Int): String {
        var result: String = ""

        if (score >= 90) {
            result = "Selamat! Anda mendapatkan nilai A."
        } else if (score in 80..89) {
            result = "Anda mendapatkan nilai B."
        } else if (score in 70..79) {
            result = "Anda mendapatkan nilai C."
        } else if (score in 60..69) {
            result = "Anda mendapatkan nilai D."
        } else {
            result = "Anda mendapatkan nilai E."
        }

        return result
    }

    val skor = 93
    val evaluasi = evaluateScore(skor)
    println(evaluasi)

}