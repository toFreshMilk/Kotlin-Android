package edu.kotlin.basicType05

//when문

//자바의 switch문과 대응되고 콤마나 in 연산자로 값으 ㅣ범위를 지정한다.

fun main() {
    var x1 = 1
    when(x1) {

        //-> 화살표를 사용한다!
        1 -> println("1이여")
        2 -> println("2이여")

        //나머지는 else문을 사용한다
        else -> {
            println("엘스문처리")
        }
    }
}