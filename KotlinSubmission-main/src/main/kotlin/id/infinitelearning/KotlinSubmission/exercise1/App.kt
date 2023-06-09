package id.infinitelearning.KotlinSubmission.exercise1

fun myProfile() {
    val nmDepan: String = "Miftahur"
    val nmBelakang: String = "Rohman"
    val usia: Int = 20
    val jomblokah: Boolean = false

    println("Nama depan: $nmDepan")
    println("Nama belakang: $nmBelakang")
    println("Umur: $usia")
    println("Status: ${if (jomblokah) "jomblo" else "tidak sendirian"}")

}

fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    val idGrup = 6
    val anggotaGrup = listOf("Mifta", "Mahsha", "April", "Mitha", "Sutan")
    val sesi = "Afternoon"

    return arrayOf(idGrup, anggotaGrup, sesi)
}

fun myGroup(): String {
    val anggotaGrups = listOf("Mahsha", "April", "Mitha", "Sutan", "Mifta")
    val grupSaya = anggotaGrups[4]

    return grupSaya
}

fun totalMember(): Int {
    val mentor = arrayOf("Reza", "Aulia")
    val hitunganGrup = 5

    val jml = mentor.size + hitunganGrup
    return jml

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    groupDetail(6, listOf("Mifta", "Mahsha", "April", "Mitha", "Sutan"), "Afternonon")

}