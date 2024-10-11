package com.example.praktikum1

fun nullsafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"
    // Throws a compiler error
    // neverNull = null
    // nullable has nullable String type
    var nullable: String? = "You can keep a null her e"
    // This is OK
    nullable = null
    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

}