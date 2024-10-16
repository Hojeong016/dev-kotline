package ch01

//데이터 타입
// 원래 자바에서는 프리미티브 타입과 참조 타입으로 두가지로 나눌 수 있음.
// 코틀린에서는 모든것이 참조타입이다. 즉 null 대입이 모두 가능하다는 뜻
//숫자
//놀리
//문자/문자열

// 문자열 포맷팅 기능 추가 : ${표현식} / $단일변수
//'''''' '''''' = 삼중 따옴표 : 여러줄 도입 할 때 사용

fun sum(no: Int): Int{
    var sum = 0
    for(i in 1..no){
        sum += i
    }
    return sum
}

fun main() {
    var str: String = "Hello"
    println("str[1] : ${str[1]}")

    val str2:String = "Hello \n world"
    val str3:String = """
        hello 
        world
    """
    println(str2)
    println(str3)

    val name: String = "hong"
    println("result : $name.. $${sum(10)}")

    println(getLength("Hello"))
    println(getLength(10))
}
//unit 타입 : 자바의 void
// 생략 가능하다

//any : 최상위 클래스

//타입 확인 연산자
// 변수 is 타입 -> Boolean
//is 연산자와 자동 형변환 (스마트 캐스팅 )

fun getLength(obj: Any): Int{
    return if(obj is String) obj.length else 0
}

//프리미터 타입은 코틀린에서 기초 데이터 타입이라고 부름
//이 타입읗 형변환 하려고 할때 = () 없기 때문에 메서드를 통해 형변환을 해주어어야 한다.
//암묵적으로 형변환이 자동으로 이루어지는ㄴ 경우는 다음밖에 없음 ㅣ 리터럴 값을 사용한 경우 / as 연산자 사용하여 캐스팅