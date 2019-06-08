package edu.kotlin.class02

//보조 생성자
//constructors 접두사를 사용하여, 보조 생성자를 선언


fun main() {
    var person1 = Person("이성민")
    println("person1님의 이름은 : ${person1.name}")

    var person2 = Person("최성민", "인천")
    println("person2님의 이름은 : ${person2.name}")

    person2.favorite()
}