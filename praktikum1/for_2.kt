package PraktikumAndroid.praktikum1

fun main() {
    // program for dengan mencetak index
    val num = 1.rangeTo(10) step 3
    for ((index, value ) in num.withIndex()){
        println("value $value with index $index")
    }
}