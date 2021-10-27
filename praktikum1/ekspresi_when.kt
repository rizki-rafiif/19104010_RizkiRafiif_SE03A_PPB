package PraktikumAndroid.praktikum1

fun main() {
    // penggunaan when
    val value = 20

    when(value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("value cannot be reach")
    }

    val value2 = 27
    val range = 10..50

    when(value2){
        in range -> println("value is in range")
        !in range -> println("value out of range")
        else -> println("value undefined")
    }
}