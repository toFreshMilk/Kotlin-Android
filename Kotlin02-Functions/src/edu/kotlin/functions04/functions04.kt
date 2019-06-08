package edu.kotlin.functions04

fun isOddEven(x : Int) : Any {
    if( x % 2 == 1) {
        return "홀수"
    } else {
        return "짝수"
    }
}

// 단일 표현 함수
// 함수가 단일 표현을 리턴할때 중괄호는 생략할수 있고 본문은 = 기호에 저장
fun double(x : Int) : Int = x * 2
//결과를 미리 알 수 있기 때문에 리턴타입을 생략할 수 있다.
fun double2(x : Int) = x * 2

//이거시 람다식이다!!!!!!!!!!!!


fun main() {
    println(isOddEven(2))
}