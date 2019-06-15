package edu.kotlin.lambdas01

import kotlin.test.currentStackTrace

/**
 * 람다
 * 이름이 없는 함수라고 하여 익명 함수라고 도 함
 * 함수 정의 부분에 이름이 없음
 * 주로 다른 함수의 인자로 전달되거나 반환되는 형태로 사용됨
 * */

fun main() {
    println(
        {
            val currntYear = 2019
            "방문을 환영합니다. (copyright $currntYear)"
        }
    )

    val numLetters = "Mississippi".count()
    println(numLetters)

    // 특정 문자만 세고 싶다, count 메소드를 오버로딩 ()를 제거하는 것을 권장한다.
    val numSletters = "Mississippi".count{ letter ->
        letter == 's'
    }

    /*
    val numSletters = "Mississippi".count({ letter ->
        letter == 's'
    })
    */
    println(numSletters)

}