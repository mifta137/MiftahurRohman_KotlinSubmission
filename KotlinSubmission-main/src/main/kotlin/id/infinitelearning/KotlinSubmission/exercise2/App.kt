package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val noGenap = mutableListOf<Int>()

    for (number in 1..100) {
        if (number % 2 == 0) {
            noGenap.add(number)
        }
    }

    val evenNumbersList: List<Int> = noGenap.toList()

    println(evenNumbersList)


    val blnMap = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Agt" to "Agustus",
        "Sep" to "September",
        "Okt" to "Oktober",
        "Nov" to "November",
        "Des" to "Desember"
    )

    blnMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    val sekarangBln= "Jun"
    val blnKelahiran = "Jul"

    println("Sekarang bulan ${blnMap[sekarangBln]} , saya lahir di bulan ${blnMap[blnKelahiran]}")
}