package edu.kotlin.inheritance02

import java.lang.IllegalArgumentException

//타입 검사
// is !is

//타입 변환
//스마트 캐스팅 또한 가능

open class Town {

    fun itIsTown() {
        println("Town 클래스")

    }
}

class House : Town() {
    fun itIsHouse() {
        println("Town 클래스의 하위클래스, House")

    }
}

fun main() {
    var town = Town()
    var houseIsTown = when (town) {
        is Town -> println("town 타입")
        is House -> println("House 타입")
        else -> throw IllegalArgumentException() //예외처리인듯
    }

    //Any는 최상위 클래스로 모든 클래스는 이 클래스를 상속받음
    var townIsAny = when(town) {
        is Any -> println("Any 타입")
        else -> throw IllegalArgumentException() //예외처리인듯
    }

    var any = Any()
    var typeCast = if( any is Town) {
        any.itIsTown()
    } else {
        println("Any 타입이 아님")
    }
}