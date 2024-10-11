package com.example.praktikum1

// list adalah kumpulan data yang disusun secara berurutan dari
// list bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
// list bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// list read-only menggunakan listOf
// list mutable menggunakan mutableListOf

fun ContohList() {
    println("=== List ===")
    //list read-only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)
}