package ch04

//클래스
//자바 : 하나의 public 클래스 파일명과 클래스명이 동일해야한다.
//코틀린: 상관 없음

//코틀린의 생성자 = 주 생성자와 보조 생성자

//주생성자, 기본 생성자일 결우 () 생략 가능
// 주생성자는 필수
class MyClass(){

    val myVariable = 10
    constructor(value: Int) : this() { }
    // 보조 생성자  this(): 다른생성자 호출 즉 이 코드는 주생성자를 호출하겠다,
    //보조 생성자는 있어도 되고 없어도 된다.
    fun myFun(){} // 메서드
    class Inner { }

}