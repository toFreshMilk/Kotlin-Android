package edu.kotlin.class06

//초기화 지연시키기

// 생성자가 호출되는 방법이나 시점을 제어할 수 없는 경우가 생길때 사용
// 지연 초기화와 늦은 초기화가 존재
// String이나 Int 같은애들이 아닌 경우임.

//지연초기화 속성, Lateinit var/val
// 클래스의 인스턴스 생성 시점 이후에 속성을 초기화할때.


fun main() {
    val hulk = Player( "헐크", 350)

    hulk.initialState()
    print(hulk.state)
    //이니셔라이즈 때문에 코드 사용 가능해짐.
}
