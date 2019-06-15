package edu.kotlin.lambdas04

/**
 * 함수를 인자로 받는 함수 정의 (고차 함수)
 * - 함수 매개변수는 함수를 포함해서 어떤 타입의 인자도 받을 수 있음
 * - 함수 타입의 매개변수도 다른 타입의 매개변수처럼 정의
 */
                                        //함수타입의 매개변수
fun runRandomDice(playerName : String, playerInfo : (String, Int) -> String) {
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
    runRandomDice("이성민", playerInfo)
    println("-----------------")

    runRandomDice("우유", {
        /**
         * 파라미터로 들어갈 때는 목적지가 정해져 있고
         * runRandomDice함수의 구현 파라미터에서 타입을 설정해주므로
         * 컴파일러가 안심하고 진행할 수 있다.
         * 하지만 컴파일러는 이런식보다는 외부 변수에 선언해주는걸 권고함. 밑줄쫙
         */
            playerName, diceNum ->

        val currentDay = "Saturday"
        println("요일 정보 : $currentDay")
        println("$playerName 님 주사위 게임에 오신것을 환영합니다")
        "당신의 숫자는 $diceNum"
    })
}