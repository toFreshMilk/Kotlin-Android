package edu.kotlin.lambdas05

/**
 *  인라인 함수
 * 람다를 사용하면 유연성이 매우 증가
 * 람다를 사용하면 JVM에서 객체로 생성
 * JVM은 람다를 사용하는 모든 변수의 메모리 할당을 수행하므로 메모리가 많이 사용됨
 * 코틀린에서는 다른 함수의 인자로 람다를 사용할 때 부담을 없앨 수 있는
 * 인라인 이라는 최적화 방법을 제공
 * 인라인을 사용하면 람다의 객체 사용과 변수의 메모리 할당을 JVM이 하지 않아도 됨
 */

/**
 * 안쓸때도 JVM STATIC에 올라간다.
 * 그래서 구현부에 inline 추가
 * 람다를 인자로 받는 함수를 인라인 처리하면 람다 코드가
 * 별도 객체로 생성되지 않고 내용이 복사됨
 * 단, 람다를 인자로 받는 재귀함수의 경우 인라인이 허용되지 않음
 * 같은 코드가 무수히 많이 복사 및 붙여넣기 때문에.
 * 호출을 안하고 복사를 한다.
 */

inline fun runRandomDice(playerName : String, playerInfo : (String, Int) -> String) {
    val randomNum = (1..6).shuffled().last()
    println(playerInfo(playerName, randomNum))
}

fun main () {

    //람다를 만든다
    val playerInfo = {
        /**
         * 최초 선언이므로 타입선언을 해줘야 컴파일러가 알수 있다.
         */
            playerName : String, diceNum : Int ->

        val currentDay = "Saturday"
        println("요일 정보 : $currentDay")
        println("$playerName 님 주사위 게임에 오신것을 환영합니다")
        "당신의 숫자는 $diceNum"
    }

    val otherInfo = {
        playerName : String, diceNum : Int ->
        val currentDay = "Sunday"
        println("요일 정보 : $currentDay")
        println("$playerName 님 주사위 게임에 오신걸 화녕ㅇ합니다")
        "당신으 ㅣ숫자는 $diceNum 입니다"
    }

    runRandomDice("이성민", playerInfo)
    println("-----------------------")
    runRandomDice("우유", otherInfo)
  }