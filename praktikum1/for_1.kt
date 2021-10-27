package PraktikumAndroid.praktikum1

fun main() {
    // program for cara 1
    var numb = 1.rangeTo(10) step 3     // 1 sampe 10 dengan skip tiap 3 angka
    for (i in numb){
        println("number of i now is $i")
    }
}