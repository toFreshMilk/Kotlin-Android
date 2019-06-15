package edu.kotlin.scopefunctions03

fun main() {

    /**
     * let 함수
     * - let 함수의 인자로 전달된 람다를 실행한 후 결과를 반환
     * - it 키워드를 사용하여 let을 호출한 수신자 객체 참조
     */

    val list = listOf(4, 2, 3).toMutableList()
    val firstNumPower = list.first().let {
        //결과를 it으로 받는다
        it * it
    }
    println(firstNumPower)



    /**
     * run 함수
     * - apply와 동일한 연관 범위를 제공
     * - apply와 다르게 객체를 반환하지 않음
     * - 람다의 결과(중괄호 안의 결과)가 반환됨
     * - 맨 마지막 줄이 리턴되게 된다.
     */

    val listRun = list.run {
        add(3, 5)

        contains(3)
    }
    println(listRun)

    fun nameIsLong(name : String) = name.length >= 10

    fun playerMessage(nameTooLong : Boolean) : String {
        return if(nameTooLong) {
            "이름이 너무 길어요"
        } else {
            "가능해요"
        }
    }

    //run이 ""의 ::nameIsLong에 대하여 트루를 반환함
    var nameValid = "김수한무거북이와두루미".run(::nameIsLong)
    println(playerMessage(nameValid))

    /*
        val message = "이성민".run(::nameIsLong).run {
            println("와우" + this)
        }
    */

    //체인작용
    val message = "이성민".run(::nameIsLong).run(::playerMessage)
    println(message)

}