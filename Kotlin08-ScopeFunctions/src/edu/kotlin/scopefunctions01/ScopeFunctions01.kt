package edu.kotlin.scopefunctions01

/**
 *  - 확장함수
 * 기존 타입(클래스나 인터페이스)의 정의를 직접 변경하지 않고 새로운 기능을 추가할 수 있음
 * 우리가 정의한 타입과 표준 라이브러리의 타입에서도 사용가능
 * 내장 라이브러리를 수정해서 사용할수 있는것.
 */

fun String.addExclamation(amount : Int = 1) = this + "!".repeat(amount)
fun Int.hihi(amount : Int = 1) = this + 10
fun Any.p() = println(this)

//변수에도 가능하다
val String.numExclamation
    get() = count{ "!".contains(it)} //get함수 재정의
    //get() = count({ "!".contains(it)}) //()를 생략가능함 it, this

fun main() {
    println("안녕".addExclamation(3))
    println("안녕".addExclamation())
    println(3.hihi())
    "하이".p()

    println("느낌표의 개수 새기!!!!!".numExclamation)

}

