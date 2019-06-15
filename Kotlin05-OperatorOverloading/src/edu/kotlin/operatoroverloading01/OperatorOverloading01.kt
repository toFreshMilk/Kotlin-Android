package edu.kotlin.operatoroverloading01

/**
 *연산자 오버로딩(Operator Overloading)
 * 피연산자의 타입에 상관없이 같은 연산자를 사용해서 동일한 기능을 구현 가능하게 해줌
 * Int와 같은 기본타입을 포함해서 대부분으 ㅣ내장타입에는
 * 연산자를 오버로딩할 함수가 정의되어 있음
 * 그러나 우리가 정의한 클래스의 인스턴스에 코틀린의 연산자를 사용할 때는
 * 관련 함수를 우리가 정의한 클래스에 오버로딩해주어야함
 * 이 상황에서 operator 키워드를 사용
 */

//단한 연산자
// plus(+), minus(-)

data class Point(val x : Int, val y : Int)

operator fun Point.unaryMinus() = Point(-x, -y)

data class Direct(val x : Int, val y : Int)

fun main () {
    val point = Point(10, 20)

    /**
     * 객체에 -를 붙이는게 이상하지만, 위에 정의해 놨기때문에
     * 특히 unaryMinus라고 - 기능이 내장되어있지만
     * = 이후에 새로 오버로딩해서 정의해서 새로운 기능을 작성함
     * -를 객체에 붙이면 operator로 선언된 함수가 호출됨
     */
    val minusPoint = -point

    println(minusPoint)
    println(minusPoint.x)
    println(minusPoint.y)


    //에러나는 경우
    //포인트처럼 설정해줘야 - 를 쓸수 있다.
    //println(-Direct(10, 20))
}
