package PraktikumAndroid.praktikum1

import java.util.Arrays
fun main() {
    // cara membuat array di kotlin
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Informatika" , true)
    val intArray = intArrayOf(1, 3, 5, 7)
    val intArray2 = Array(4, { i -> i * i })
    print(array[2])
    print("\n")
    print(mixArray[4])
    print("\n")
    print(intArray[3])
    print("\n")
    print(Arrays.toString(mixArray))
}