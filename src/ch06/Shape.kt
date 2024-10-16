package ch06
//상속 : 부모 생성자 어떻게 호출? 오버라이드 어떻게 할거냐??가 포인트
open class Shape {
    var x =0
        set(value) = if(value < 0) field=0 else field = value

    var y =0
        set(value) = if(value < 0) field=0 else field = value

    lateinit var name: String
//즉 부모가 허락한 것만 재정의할 수 있다.
  open fun draw() = println("Draw $name: location : $x $y")
}

open class Rect : Shape() {

}



class Circle : Shape() {
    var radius : Int = 0
        set(value) = if(value < 0) field=0 else field = value

    override fun draw() {
        super.draw() // 부모의 프린트 먼저 호출하겠다
    }
}

fun main() {
    val obj1 : Any = Shape() // 럽캐스팅 : 부모타입으로 자식타입 참조
    val obj2: Any = Shape()
    val obj3 = obj1

    println("obj1.equals(obj2) is ${obj1.equals(obj2)}")
    println("obj1.equals(obj3) is ${obj1.equals(obj3)}")
}

//자바
//클래스 앞에 final 이 붙으면 상속 불가
//메서드 앟에 붙으면 오버 라이딩 라이드 불가

//코플린에서는 디폴트 값이 final -> 기본적으로 상속 불가 따라서 키워드 open 을 명시하여 상속이 가능하게 한다.

open class Parent
//괄호의유뮤에 따라 인터페이스가 될 수 ㅣㅇㅆ다. 즉 생성자 호출이 있으면 상속 없으면 인터페이스 구현
class Child : Parent() // : == 자바의 extends  // 괄호를 쓰는 이유 : 생성자여서 즉 자바의 super() 처럼 부모 생성자의 호출문을 사용하는 것

//오버라이드
// 함수 또한 final  따라서 open 예약어를 부모 클래스 앞에 붙이고 자식은 오버라이드 예약어를 명시적으로 선언한다.

//자바와 다른점 멤버변수도 오버라이드가 된다. 즉 프로퍼티도 오버라이드를 할 수 있다.