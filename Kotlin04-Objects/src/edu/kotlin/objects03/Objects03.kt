package edu.kotlin.objects03

/**
 * 동반 객체(Companion Object)
 * 객체 선언과 유사하지만, 최상위 수준에서 사용할 수 없고 클래스 내부에 정의하여 사용
 * companion object 클래스 이름
 * 동반 객체는 클래스 내부에 정의된 객체 선언
 * 그러나 동반 객체를 포함하는 클래스 내부에서는 동반 객체의 속성이나 함수를
 * 자신의 속성이나 함수인것처럼 인식하므로 동반 객체의 이름을 지정핮 ㅣ않고 사용 가능
 * 하나의 클래스에 하나의 동반 객체만 포함될 수 있다
 * 포함하는 클래스으 ㅣ인스턴스가 얼마나 많이 생성되든 동반 객체으 ㅣ인스턴스는
 * 하나만 생성된다
 *
 * 클래스 내부에 싱글톤이 존재하는것.
*/

class Avengers {
    fun des() {
        println("타노스를 물리처라")
    }

    //내부에서 쓰이고 하나만 생성되기 때문에 이름이 필요 없다.
    companion object {
        val name : String = "스티브"
        init {
            println("초기화블록 반갑습니다")
        }
        fun hello () {
            println("헬로 반갑습니다 대장님")
        }
    }
}

fun main () {
    val avengers = Avengers()
    avengers.des()

    //괄호가 없으면 그 안에 있는 동반오브젝트를 가지고 온다.
    val aven1 = Avengers
    val aven2 = Avengers

    if (aven1 !== aven2) {
        println("참조가 같다")
    } else if (aven1 == aven2) {
        println("값이 같다")
    }
}