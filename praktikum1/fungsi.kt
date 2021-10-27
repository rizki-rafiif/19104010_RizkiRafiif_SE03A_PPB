package PraktikumAndroid.praktikum1

// cara menggunakan fungsi dalam kotlin
fun main() {
    val user = setUser("Rizki", 21)
    println(user)
    printUser("Rafiif")
}
// cara membuat fungsi dalam kotlin
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String) {
    println("Your name is $name")
}