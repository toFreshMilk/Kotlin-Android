package edu.kotlin.objects01

// 싱글톤을 사용한다. !!@!@
// 프로그램이 실행되는 동안 수시로 변하는 상태 정보를 지속적으로 유지관리시 사용
// object 키워드를 싱글톤 객체를 정의
// 최초 하나만 생성되고 계속 유지

//클래스 선언은 하지 않는다
object Captain {
    //선언만 하면 싱글톤이 된다
    val name : String = "스티브"
    init {
        println("초기화블록")
        println("반값습니다!")
    }
    fun hello() {
        println("헬ㄹ로우")
        println("대장님! 반값습니다.")
    }
}

fun main () {
    val c1 = Captain //()를 붙이지 않는다 !!!!!!!!!!!!!!!!!!
    println(c1)
    val c2 = Captain
    println(c2)

    if(c1 === c2) {
        println("동일한객체")
    }else {
        println("다른 객체")

    }
}

