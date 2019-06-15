package edu.kotlin.collections01

/**
 * 컬렉션(collectios)
 * 연관된 값들을 모아서 저장하고 사용하는 방법을 제공
 * List, Set, Map 이 존재
 * List : 각 요소를 특정 순서로 저장
 * Set : 중복되지 않는 값을 갖는 요소들로 저장
 * Map : 키(Key) - 값(Value) 쌍으로 저장
 *
 * */



fun main() {

    //Player 인스턴스 생성 ,,, Arrayof, Setof, Mapof ...
    //리스트 내의 요소들이 타입이 동일하지 않다... any 타입이 된다

    val player1 = listOf("손흥민", "MD", 7)
    val player2 = listOf("이승우", "MD", 10)

    println(player1)
    println(player2)

    //array in array
    val playerList = listOf(player1, player2)
    println(playerList + "ㅇㅇㅇ")


    //리스트 요소 출력

    println("선수정보")
    println("이름 | 포지션 | no.")

    println("${playerList[0][0]} | ${playerList[0][1]} | ${playerList[0][2]} ")

    for (p in playerList) {
        println("${p[0]} | ${p[1]} | ${p[2]} ")
    }

    //index 번호가 넘어가서 생기는 에러를 미리 처리해줄 수 있다.

    playerList.getOrElse(3) {
        println("명단에 없음")
    }

    //요소검사
    //객체자체의 값으로 비교함
    //val player3 = listOf("이강인", "MD", 16)
    //val player3 = listOf("손흥민", 7, "MD") 순서도 같아야함
    val player3 = listOf("손흥민", "MD", 7)
    if (playerList.contains(player3)) {
        println("${player3[0]}은 선발")
    } else {
        println("${player3[0]}은 선발이 아님")
    }
}











