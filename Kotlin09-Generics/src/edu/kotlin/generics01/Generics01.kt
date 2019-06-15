package edu.kotlin.generics01

/**
 * Generics
 * - 클래스, 인터페이스, 함수의 매개변수와 반환 타입을 미리 확정하지 않고
 *   정의한 후에 사용되는 시점에서 특정 타입을 지정할 수 있도록 해주는 기법
 * - 타입추론과 헷갈릴수 있다
 * - 제네릭은 매개변수의 형태로 타입을 지정
 * - 따라서 동일한 클래스와 인터페이스 및 함수의 정의를 재사용할 수 있어 중복줄임
 * - 컴파일 시점에서 사용 타입의 적합성을 확인할 수 있으므로 타입안전 보장
 */


class LootBox<T> (info : T) { //T는 모든 타입을 나타냄 Any타입
    var pInfo : T = info
}

class Weapon(val name : String, val grade : Int)

class Potion(val name : String, val effect : String)

fun main() {
    val lootBox1 : LootBox<Weapon> = LootBox(Weapon("영웅의 검", 5))
    val lootBox2                   = LootBox(Potion("HP포션", "체력 회복"))

    println("축하합니다! ${lootBox1.pInfo.grade}등급 ${lootBox1.pInfo.name} 획득")
    println("축하합니다! ${lootBox2.pInfo.effect}효과가 있는 ${lootBox2.pInfo.name} 획득")

}