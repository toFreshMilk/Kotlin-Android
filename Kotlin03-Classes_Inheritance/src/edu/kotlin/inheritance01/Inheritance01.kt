package edu.kotlin.inheritance01

//상속스
// 코틀린은 모든 클래스가 상위 클래스로 Any를 가진다. 스마트 캐스팅에서 중요함
// 상속이 가능하게 하려면 open 키웓드 필요

//override나 open 키워드를 명확히 사용해야함
//속성에도 오버라이드 할 수 있다.

open class BasicTv {
    var powerOn = true
    open val channel = 0
    var volume = 1

    open fun turnOnOff() {
        println("turnOnOff()")

        if(powerOn) {
            powerOn = false
            println("Tv가 꺼졋어")
        } else {
            powerOn = true
            println("Tv가 켜졌얼")
        }
    }
}

class SmartTv : BasicTv() {
    var ip = "111.222.333.444"

    //open과 override를 명확히 해줘야함
    override val channel : Int = 7

    //override를 통하면 val도 값이 변할수 있구나@!

}

fun main() {
    val tv1 = BasicTv()
    tv1.turnOnOff()

    val tv2 = SmartTv()
    tv2.turnOnOff()
    tv2.turnOnOff()
    tv2.ip = "0.0.0.0"
    println(tv2.channel)
}