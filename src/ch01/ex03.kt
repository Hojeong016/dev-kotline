package ch01

//null

// val nonNullDate : String = null
val nullableDate : String? = null // 이미 대입이 이루어져있기 떄문에 재대입 불가능 상태 따라서 일반적으로 nullable을 주지 않음
var nullableDate2 :String ? = null // 타입 추론 이 안되기 때문데 반드시 타입 지정


var myBool = false
val myval = "hello"
    get() = if(myBool) field else field.toUpperCase()


fun main() {
    var  nullableDate2 = "hello"
    println(myval)
    myBool = true
    println(myval)
}

//상수와 변수

//val 변수 : 수정은 못하지안 geettet을 사용하여 값을 읽을 수 있음
//const val 상수명 : 타입 = 초기값
//최상위 또는 오브젝트 클래스 안에서만 선언 가능
//: 지역변수 멤버 변수 모두 사용불가
