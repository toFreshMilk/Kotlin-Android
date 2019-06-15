package edu.kotlin.collections04

/**
 * 맵
 * 매개변수화 타입(eg. Map<String, Double>)을 사용
 * 키와 값의 쌍으로 데이터를 접근하며 키로 데이터 처리
 */

fun main() {
    //맵 생성
    val players = mutableMapOf("손흥민" to 7, 10 to "이승우", "이강인" to 16)
    println(players.keys)
    println(players.values)
    println(players["손흥민"])

    //players.plus(10 to "황의조") 얘는 아닌가봄

    //있으면 변경하고 없으면 추가
    players += 10 to "황의조"
    println(players)
    players[10] = "황희찬"
    println(players)
}