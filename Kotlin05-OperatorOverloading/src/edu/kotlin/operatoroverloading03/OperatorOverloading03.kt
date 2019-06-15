package edu.kotlin.operatoroverloading03

/**
 *  복합 대입 연산자
 *  += | plusAssign | 객체를 다른 객체와 더한 후 그 결과를 왼쪽 피연산자 객체에 지정
 *  컬렉션에서 사용할 때는 마지막 위치 다음에 객체를 추가하는 기능
 * */

data class Poiont(var x : Int, var y: Int) {

}

operator fun Poiont.plusAssign(other : Poiont) {
    x += other.x
    y += other.y
}

fun main() {
    val point1 = Poiont(3, 4)

    //+= 기능이 위에서 정의한대로 작동하게 된다/.
    point1 += Poiont(5,6)
    println(point1)

    var arr = arrayOf(1, 2, 3, 4)

    //얘는 내가 위에서 구현한애가아닌 내장된애
    // 배열의 고정된 사이즈가 있지만 사이즈를 재정의해서 집어넣음
    //appen 등의 메서드로 집어 넣는게 아니라 그냥 집어넣음
    arr += 5

    for(a in arr) {
        println(a)
    }

}