package PraktikumAndroid.praktikum1

fun main() {
    // digunakan untuk mencegah bila var ke-1 nol maka pakai var ke-2, mirip ternary
    val text: String? = null
    val textLength = text?.length ?:7

    val score: Int? = null

    println(textLength)
    println(score?:87)
}