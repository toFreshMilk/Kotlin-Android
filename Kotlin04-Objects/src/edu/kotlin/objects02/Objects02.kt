package edu.kotlin.objects02

/**
 *객체 표현식
 * 기존 클래스의 서브클래스를 언하는 코드 안에 이름 없이 정의한 후
 * 바로 인스턴스를 생성해서 사용 가능
 * 이 경우 이름이 없어도 되는데 이것을 익명 클래스라 함
 * 위와 같은 경우 object 키워드로 객체 표현식을 정의
 *
*/

open class Town {
    open fun myTown () {
        println("마이 타운")
        println("나으 ㅣ고향은 아스가르드 입니다")
    }
}

fun main () {
    //object는 기본적으로 클래스이기 때문에 클래스타운을 상속 받을 수 있다.
    val thorIsWhere = object : Town() {
        override fun myTown() {
            super.myTown()
            println("지금은 어딜까요?")
        }
    }

    thorIsWhere.myTown()

    val hulkSays = object {
        //익명 클래스 사용. 이름이 굳이 필요한 이유가 없다
        fun speak() {
            println("으어엉")
        }
    }
    hulkSays.speak()
}

















