package edu.kotlin.lambdas06

/**
 * - 함수 참조
 * 람다 이외에도 함수를 다른 함수의 인자로 전달이 가능
 * 이름이 있는 함수(fun 키워드로 정의된 함수)가 인자로 전달될 수 있게 해줌
 * 람다 표현식을 사용할 수 있는 곳이면 어디든 함수 참조를 사용 가능
 */

fun runSimulation(playerName : String,
                  costPrinter : (Int) -> Unit,
                  greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings : Int) {
    val cost = 500
    println("건축 비용 : ${cost * numBuildings}")
}

fun main() {
    // 람다로 만들어진게 아니기 때무에 ::printConstructionCost 함수를 참조
    runSimulation("이성민", :: printConstructionCost) {
        playerName, numBuildings ->
        val currentYear = 2019
        println("${numBuildings}채의 건물이 추가됨")
        "$playerName 님 방문을 환영합니다 copyright $currentYear"
    }
}