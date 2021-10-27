package PraktikumAndroid.praktikum1

fun main(){
    // cara menggunakan if-else dalam kotlin
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Kantin sedang buka"
    } else if (now == openHours){
        "Mohon tunggu, kantin sedang disiapkan"
    } else {
        " Kantin sedang tutup"
    }
    print(office + "\n")

    // cara lain
    val waktu = 8
    if (waktu > 7){
        println("Kantin buka")
    } else if (waktu == openHours){
        println("Sedang siap-siap")
    } else{
        println("Kantin tutup")
    }
}