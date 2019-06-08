package edu.kotlin.class01

//클래스 파일은 따로 생성하는게 좋다.
//constructor를 헤더에 만든다, 만들면 기본 생성자가 된다.
//constructor를 생략가능하다
//파라미터를 받는 모습으로 기본 생성자가 된다.

class Person (firstName : String, secondName : String){
//class Person constructor(fristName : String, secondName : String){

    var fullName = firstName + secondName

    var noSpaceFullName = firstName + secondName

        set(value) {
         field = value.trim()
        }
        get() = field.capitalize()

    val readOnly = "lee Seongmin"

        get() = field.capitalize()

    //초기화 코드는 init 블록에서 작성한다.
    init {
       //println("$firstName $secondName 님 안녕하세요")
        //println("$readOnly 님 안녕하세요")

        //컨트롤 E 방금 작성하던 클래스 목록
    }
}

