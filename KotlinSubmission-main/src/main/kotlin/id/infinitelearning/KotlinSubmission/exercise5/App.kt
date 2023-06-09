package id.infinitelearning.KotlinSubmission.exercise5

class hHero {
    var nm: String = ""
    var usia: Int = 0
    var tinggi: Int = 0

    fun setProfile(nm: String, usia: Int, tinggi: Int) {
        this.nm = nm
        this.usia = usia
        this.tinggi = tinggi
    }

    fun profile() {
        println("Nama: $nm")
        println("Usia: $usia")
        println("Tinggi: $tinggi")
    }
}

fun main() {
    val hero = hHero()
    hero.setProfile("Miftahur Rohman", 20, 165)

    val group1 = listOf(
        "jalan", "jalan", "jalan", "jalan", "jalan",
        "lari", "lari",
        "makan", "makan", "makan",
        "minum",
        "lompat", "lompat", "lompat",
        "duduk"
    )
    val group2 = listOf(
        "jalan", "jalan",
        "lari", "lari",
        "makan",
        "minum", "minum", "minum",
        "lompat",
        "duduk", "duduk"
    )
    val group3 = listOf(
        "jalan", "jalan", "jalan",
        "lari",
        "makan", "makan", "makan", "makan", "makan",
        "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk"
    )
    val group4 = listOf(
        "jalan", "jalan", "jalan", "jalan", "jalan",
        "lari", "lari", "lari", "lari",
        "makan", "makan", "makan", "makan",
        "minum", "minum", "minum", "minum",
        "lompat", "lompat", "lompat",
        "duduk", "duduk"
    )
    val group5 = listOf(
        "jalan", "jalan", "jalan", "jalan",
        "lari",
        "makan", "makan", "makan",
        "minum", "minum", "minum", "minum", "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk"
    )
    val group6 = listOf(
        "jalan", "jalan",
        "lari", "lari", "lari", "lari",
        "makan", "makan",
        "minum", "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk", "duduk"
    )

    val activities = listOf(group1, group2, group3, group4, group5, group6)

    for ((i, group) in activities.withIndex()) {
        println("Group ${i + 1} activities:")
        for (activity in group) {
            println("- $activity")
        }
    }

    hero.profile()
}