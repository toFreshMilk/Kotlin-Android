package edu.kotlin.interface01

//인터페이스

//상속으로는 다중상속이 불가능하지만 인터페이스로는 다중구현이 가능하다.
// 여럿이서 코드 작성시 규약을 정의할 때
//추상클래스는 본체에 구현코드가 있는 일반함수도 가질 수 있음

interface FightInfo {

    var healthPoint : Int
    var manaPoint: Int
    var offensePower : Int
    var defencePower : Int
    fun finalDamage(opponent : FightInfo) : Int
}

class Player(
    //기본 생성자다
    //생성자에 적던지 알트 엔터, implement로 오버라이드 코드를 적어주던지 해야한다.


    var name : String,
    override var healthPoint : Int = 100,
    override var manaPoint : Int = 100,
    level : Int,
    _offencePower : Int,
    _defencePower : Int
) : FightInfo {
    override var offensePower: Int = _offencePower
        //get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        //set(value) {}
    override var defencePower: Int = _defencePower
        //get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        //set(value) {}

    override fun finalDamage(opponent: FightInfo): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        var damage = opponent.offensePower - defencePower

        if( damage < 0) damage = 0
        return damage

    }

}

fun main() {
    var ironMan = Player("아이언맨", level = 150, _defencePower = 3, _offencePower = 50)
    var thanos = Player("타노스", level = 250, _defencePower = 10, _offencePower = 20)

    println("${ironMan.name}은 ${thanos.name}")
    println("${thanos.name}은 ${thanos.finalDamage(ironMan)}의 데미지를 입었다")
}