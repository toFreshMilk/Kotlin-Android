package edu.kotlin.objects05

/**
 * 데이터 클래스
 * toString(), equals(), copy() 등의 메소드 포함
 *
 * - 요구사항
 * 최소한 하나의 매개변수를 갖는 기본 생성자를 가져야함
 * 기본 생성자의 매개변수에는 val이나 var이 저장되어야함
 * abstract, open, sealed 또는 inner 키워드를 지정할 수 없다.
 *
 * */


class ContactV01(var name : String, var phone : String, var email : String)

data class ContactV02(var name : String, var phone : String, var email : String)



fun main() {
    var name = "토르"
    var phone = "0203303"
    var email = "asdkfj@sakdjf.com"

    var c1 = ContactV01(name, phone, email)
    var c2 = ContactV02(name, phone, email)

    //toStirng() 문자열 형태로 출력
    println(c1)
    println(c2)

    //equals()
    if (ContactV01(name, phone, email).equals(ContactV01(name, phone, email))) {
        println("동일한 객체1111")
    } else {
        println("다른객체11111111")
    }

    //equals()
    if (ContactV02(name, phone, email) == ContactV02(name, phone, email)) {
        println("동일한 객체2222222222")
    } else {
        println("다른객체22222222222")
    }

    //copy() 특정 값만 변경해서 새로운 인스턴스를 복제
    val c3 = c2.copy("스파이더맨")
    println(c3)

}