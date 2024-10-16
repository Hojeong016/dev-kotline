package ch02
//함수 사용법

//기본 형식
// fun 함수명 (매개변수 : 타입 (이떄 매개변수는 타입 추론이 안됨):리턴타입{}
//함수의 매개변수는 val 타입이기 떄문에 재대입이 안된다.
//반환값이 없는 경우 unit

//내부함수
// 함수 안에 함수
// 내부 함수는 외부함수의 변수에 접근이 가능하지만 반대는 불가능하다.


fun sum(a: Int, b: Int): Int {
    var sum = 0;
    fun calcSum(){
        for(i in a..b){
            sum += i
        }
    }
    calcSum()
    return sum
}

fun main(args: Array<String>) {
    val result = sum(1, 2)
    println(result)

    sayHello() // 매개변수에 지정해준 기본값사용
    sayHello("kim")

    varargsFun(10,"hi","hihi") // t : strin
    varargsFun(20,11,false,"hihi") // t: any
}


//단일 표현 함수 : 1줄 함수
// 리턴 생략
//주로 컨트롤러에서 많이 나온다.
fun sum1(a: Int, b: Int) = a+b

//기본 인자
//뒤에서 부터 차례대로 지정 즉 기본값 설정이 있는 매개변수를 디폴트 값이 없는 매개변수 뒤에 위치한다.
fun sayHello(name:String ="hong") = println("Hello $name")

//명명된 인수
//파이썬의 키워드 인수 전달 방법과 동일
//이름이 중요하지 순서가 중요하지 않음 기존에는 순서에 맞춰서 전달해야했지만 명명된 인수 -> 이름을 지정해주면 순서 상관없이 전달 가능하다
//주로 매개변수가 많을때 사용한다.

//가변인수
//매개변수 앞에 vararge 키워드
//개수에 제한을 두지 않음
//자바 ...args 즉 배열

fun <T> varargsFun(a1: Int, vararg array: T) {
    for(a in array) {println(a)} // 자바에서는 향상된 for 문
}


// 그럼 대체 ? 함수는 언제 쓰여요??
//static 메서드
//따라서 코플린에서는 static /new 키워드 없음

