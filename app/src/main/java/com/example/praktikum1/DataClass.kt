package com.example.praktikum1

// Data Class
// Data class adalah class yang digunakan untuk menyimpan data.
// data class menyediakan fungsi untuk meng-override fungsi equals(), hashcode(), dan toString().
//data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)
}