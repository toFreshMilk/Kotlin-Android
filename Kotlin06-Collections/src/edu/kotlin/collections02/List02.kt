package edu.kotlin.collections02

data class Player (var name : String, var position: String, var num : Int) {

}

fun main() {

    /**
     * 리스트 요소 변경
     * - listOf 함수는 저장된 요소를 변경할 수 없는 읽기 전용 list를 반환
     * - mutableListOf(인자1, 인자2, ...) 을 써야 변경 가능하다.
     * */

    val player1 = Player("손흥민", "MD", 7)
    val player2 = Player("이승우", "MD", 10)

    val playerList = mutableListOf(player1, player2)
    val player3 = Player("이강인", "MD", 16)

    //요소 추가
    //playerList.add(player3) // 마지막에 추가된다.
    //playerList += player3
    //playerList[2] = player3 //얘는 안됨
    println(playerList + "플레이어 리스트")


    //요소 삭제
//    playerList.removeAt(2) //특정 인덱스로 삭제
    playerList.remove(player1) //특정 객체로 삭제

    playerList -= player1 //복합연산자로 삭제
    for( p in playerList) {
        println(p)
    }


    //읽기 전용으로 변환
    playerList.toList()
    //변경 가능으로 변환, 여러 구조로 변환이 가능하다.
    playerList.toMutableList()

    //변수를 한번에 선언할 수 있다 어레이에서는
    //변수 길이만큼 할당되고 버려진다.
    var (a, b, c) = listOf(1, 2, 3)

    //해체선언
    var ranking = "1등, 2등, 3등"
    var (first, second, third) = ranking.split(',')
    var (one, _, three) = ranking.split(',')
    println("$first, $second, $third")
    println("$one, $three")
}