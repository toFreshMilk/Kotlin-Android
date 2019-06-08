package edu.kotlin.class02

class Person (_name : String) {

    var name = _name

    init {
        //초기화 블록이 보조 생성자보다 먼저 실행된다.
        println("초기화 블록")
        println("${this.name}님 반갑습니다.")

    }

    //안쪽에다가 선언하면 보조 생성자
    constructor(_name : String, city : String) : this(_name){
        println("보조생성자 블록")

        //기본생성자에서 _name 값을 전달 받는다.
        println("${this.name}님은 ${city}에 사시네요")
    }

    fun favorite() {
        println("favorite()")
        println("${name}님은 무엇을 좋아하시나요")
    }

}