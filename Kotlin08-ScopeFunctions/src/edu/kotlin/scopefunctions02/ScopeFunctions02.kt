package edu.kotlin.scopefunctions02

/**
 *  표준 함수(Scope functions)
 * 코틀린 라이브러리에 있는 보편적으로 사용될 수 있는 유틸리티 함수
 * apply, let, run, with, also, takeif 등이 주로 사용됨
 * 표준 함수는 내부적으로 확장 함수 (Extension Function)이며,
 * 확장 함수를 실행하는 주체를 수신자 또는 수신자 객체라고 함
 */

/**
 * apply 함수
 * - 구성함수라고 불림
 * - 반복되는 코드의 양을 줄이기 위해 사용
 * - 람다의 실행이 끝나면 구성된 수신자 객체가 반환
 */

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.add(3, 5)
    list.add(4, 8)

    //list.addAll() 이랑 차이점이 모지
    list.apply {
        add(5, 7)
        add(6, 8)
        add(7, 9)
    }

    println(list)
println()
    val listApply = list.apply {
        //내부 결과와 리턴값은 무관함
        //결과를 리턴하려면 apply가 아니라 run함수를 써야함
        contains(10)
    }
    println(listApply)

}


