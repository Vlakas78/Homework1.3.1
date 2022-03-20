package ru.netology

fun main() {
    agoToText(59)
    agoToText(660)
    agoToText(3605)
    agoToText(87500)
    agoToText(185200)
    agoToText(2685200)
}

fun agoToText(time: Int) {
    val minute = time / 60
    val hour = time / 3600
    when (time) {
        in 0..60 -> println("Пользователь был только что")
        in 61..3600 ->
            when {
                ((minute - 1) % 10 == 0) && minute != 11 -> println("Пользователь был $minute минуту назад")
                ((minute - 2) % 10 == 0) || ((minute - 3) % 10 == 0) || ((minute - 4) % 10 == 0) -> println("Пользователь был $minute минуты назад")
                else -> println("Пользователь был $minute минут назад ")
            }
        in 3601..86400 ->
            when {
                ((hour - 1) % 10 == 0) && hour != 11 -> println("Пользователь был $hour час назад")
                ((hour - 2) % 10 == 0) || ((hour - 3) % 10 == 0) || ((hour - 4) % 10 == 0) -> println("Пользователь был $hour часа назад")
                else -> println("Пользователь был $hour часов назад ")
            }
        in 86401..172800 -> println("Пользователь был сегодня")
        in 172801..259200 -> println("Пользователь был вчера")
        else -> println("Пользователь был давно")
    }
}


