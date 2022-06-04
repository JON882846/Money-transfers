package ru.netology

fun main() {
    val amount = 190999
    var message = 0
    val сommission = 0.75
    val fixedCommission = 3500

    message = (((amount/100 * сommission))*100).toInt()

    if(message<fixedCommission) {
        println("Комиссия в копейках: $fixedCommission")
    } else println("Комиссия в копейках: $message")
}
