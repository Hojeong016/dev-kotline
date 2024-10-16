package ch08

//Object 싱글톤 객체
//object 키워드가 붙으면 자동으로 인스턴스가 생성된다
//싱글톤 객체가 되며
//멤버는 클래스 이름으로 접근한다.
//자바의 private static
//코틀린에서는 클래스 명으로 접근

 object Database {
    val conn : String
    init{
        conn ="mySql"
    }

     fun executeQuery(sql: String){
         println("$conn 으로 실행 쿼리 $sql")
     }
}

fun main() {
    Database.executeQuery("select * from table")

    val obj=Outer()

    //스테틱 변수
    Outer2.no
    Outer2.myFunction()

}

//익명 객체 : 상속과 관련된 기법 |
//익명 구현 객체 : 인터페이스 |
//object: 부모 클래스의 생성자 {} 클래스 형태로 상속을 이용할 수 있음

open class SomeClass{
    open fun someFunction(){
        println("someFunction.....")
    }
}

interface SomeInterface{
    fun interfaceFun()
}

class Outer1{
    // 객체를 생성하는 방식? 어떤 방식으로 정의 내릴 수 있을까?//인터페이스나 클래스를 상속하면서 한 번만 사용하는 임시 객체
    val myInner : SomeInterface = object : SomeInterface {
        override fun interfaceFun() {
            TODO("Not yet implemented")
        }
    }
}

//그럼 자바에서 주로 사용하는 static 멤버 는 무엇? = companion object
//바깥클래스와 무관하게 자신은 존재하는 특징을 가진 static
// 이부분이 중요
class Outer2{

    companion object {
        val no : Int = 0
        fun myFunction(){}
    }

    fun myFunction(){
        no
        myFunction()
    }
}





