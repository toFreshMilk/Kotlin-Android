package edu.kotlin.objects06

/**
 일련의 상수값을 정의하는 열거형  enum 클래스
*/

enum class Directions() {

    //코틀린에서도 .NORTH . . .. .?
    NORTH,
    EAST,
    SOUTH,
    WEST
}

data class coordinate(val x: Int, val y : Int) {
    val isInBounds = x >= 0 && y > 0
}

fun getDirectionName (directions: Directions) = when (directions) {
    Directions.EAST -> "동"
    Directions.WEST -> "서"
    Directions.SOUTH -> "남"
    Directions.NORTH -> "북"

}

fun main () {
    println(getDirectionName(Directions.SOUTH))
    println(getDirectionName(Directions.WEST))
    println(getDirectionName(Directions.SOUTH))
    println(getDirectionName(Directions.NORTH))

}