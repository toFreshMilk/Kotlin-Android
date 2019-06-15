package edu.kotlin.objects04


/**
 * 중첩 클래스
 * 다른 클래스 내부에 중첩된 클래스에 class 키워드를 사용해서 이름을 정할 수 있다.
 * */

object Game {
    //GameChatting 클래스는 Game 객체에서만 필요하고 다른 코드에서는 사용하지 않음

    private class GameChatting(var id : String, var message : String?) {

        //message가 널값이 들어온다면 빈문자열을 대입한다!!!@!@!@@@
        private var myMessage = message ?: ""

        //금지 단어를 필터링 하는 함수
        private var forbiddenWord = "임마"
        fun flitering() = when {
            myMessage.contains(forbiddenWord) -> alert()
            else -> fullMessage()
        }

        private fun alert () = println("${forbiddenWord}는 금지어입니다.")
        private fun fullMessage() = println("${id} : ${myMessage}")
    }

    fun testChat(id: String, message: String?) {
        GameChatting(id, message).flitering()
    }
}

fun main () {

    Game.testChat("tofreshmilk", "임마!!!!")
    Game.testChat("tofreshmilk", "하이요")
}