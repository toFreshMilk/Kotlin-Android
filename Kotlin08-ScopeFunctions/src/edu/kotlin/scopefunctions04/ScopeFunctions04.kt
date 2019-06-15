package edu.kotlin.scopefunctions04

fun main() {

    /**
     * with 함수
     * - run과 동일하게 동작하지만 호출 방식이 다름
     * - 수신자 객체를 첫번째 매개변수의 인자로 받음
     *
     * - *******with 대신 run을 권장함 ***********
     */

    val nameTooLong = with("김수한무거북이와두루미") {
        //this가 이미 있다고 생각해서 this.length를 안해도 됨
        length >= 10
    }
    println(nameTooLong)

    /**
     * also 함수
     * - let과 비슷하게 동작
     * - let처럼 자신을 호출한 수신자 객체를 람다의 인자로 전달(it)
     * - also는 람다의 결과를 반환하지 않고 수신자 객체를 반환
     */

    var 메뉴 = listOf("피자", "족발", "곱창")
    var myFavorite : String
    메뉴.also {
        println(it[2])
    }.also {
        myFavorite = it[0]
    }
    println(myFavorite)


    /**
     * takeIf 함수
     * - 람다에 제공된 조건식을 실행한 후 그 결과에 따라 true 또는 false 를 반환
     * - 만일 조건식의 결과가 true면 수신자 객체, false이면 null이 반환됨
     * - 어떻게 써먹을지는 좀 ... 널체크??
     */

    var haveRest = "안녕, 코틀린".takeIf {
        it.contains(',')
    }
    println(haveRest)
}
