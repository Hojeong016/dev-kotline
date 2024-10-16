package ch08

// Nested 클래스
// 특정 클래스 내에 선언된 클래스
// 자바의 static 내부 클래스에 해당한다.
//보통 앱에서 자주 쓰인다..
// 왜 쓰일까?
//스테틱의 특징을 유의하면서 static 유무 생각하기
//바깥 클래스의 멤버변수를 사용하는가 아닌가? 내부 클래스에서는 바깥클래스의 멤버를 getter,setter 사용없이 자유롭게 사용가능하다. 접근 제한자 상관없이
//하지만 코틀린에서는 static 키워드가 없다
//따라서 Inner 키워드로 위를 구분한다.

class Outer{
    val age:Int =10
    fun outerFun() = println("Outer Fun")
    inner class Nested{
        val name:String = "Nested name"
        fun myFun() = println("Nested fun")
    }
    fun createdNestedFun():Nested = Nested()
}

fun main() {
    // 내부 클래스이기 때문에 새롭게 생성하지 않아도 .으로 호출해서 사용이 가능하다..?
    // 단독으로..? 자바의 스테틱 내부 클래스에 해당한다.
    // 특징 : 바깥 클래스의 멤버에는 인스턴스를 모르고 있기 때문에
    // val obj: Outer.Nested = Outer.Nested()//inner 키워드를 붙이면 오류 -> 이유
    val obj:Outer.Nested = Outer().createdNestedFun()// 외부 클래스에서 생성할 수 있는 팩토리 메서드 생성하여 활용
    println(obj.name)
    obj.myFun()
}

//inner 없는 일반 중첩 클래스
// 기본적으로 static 개념과 유사하게 동작
// 외부 클래스의 인스턴스와 무관하게 동작 따라서, 바깥클래스의 멤버에 접근할 수 없다.
// 따라서 메인 클래스에서 외부 클래스의 인스턴스 없이 직접 생성이 가능했다.

//inner 클래스
//외부 클래스의 인스턴스와 연결이 된다.
//따라서 외부 클래스의 멤버에 접근할 수 있다.
//하지만 메인에서 내부 클래스 인스턴스를 생성하기 위해서는 외부 클래스의 인스턴스가 필요하다.

//사용
/*
Nested 클래스: 바깥 클래스의 인스턴스와 관계없이 독립적인 역할을 할 때 사용
예: 바깥 클래스의 유틸리티 역할을 하는 클래스라면 Nested로 만드는 것이 적절

Inner 클래스: 바깥 클래스의 멤버와 밀접하게 관련된 로직이 있을 때 사용.
→ 바깥 클래스의 상태(age 등)에 따라 동작이 달라지는 경우 inner 클래스로 만들어야 함.*/
