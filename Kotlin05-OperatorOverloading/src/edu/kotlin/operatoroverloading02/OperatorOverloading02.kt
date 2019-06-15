package edu.kotlin.operatoroverloading02

import java.lang.IndexOutOfBoundsException

/**
 * getter / setter 연산자도 오버로딩 해서 쓸수 있다
 * [] | get/set | 지정된 인덱스의 컬렉션 요소를 반환/변경한다.
 */

data class Point(var x : Int, var y : Int) {
//내부에서 선언하고 싶다


}

operator fun Point.get(index : Int) : Int {

    //게터를 오버로딩
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}


operator fun Point.set(index : Int, value : Int) {
    return when(index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}


fun main() {
    //기존 방법
    val point = Point(10, 20)
    point.x = 30
    point.y = 40

    //연산자 오버로딩으로 가져오는 바업ㅂ
    point[0] = 100
    point[1] = 200
    println(point)
}