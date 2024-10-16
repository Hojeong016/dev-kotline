package ch01

//변수 초기화

val topDate1: Int = 10// 초기화 하지 않아서 에러
var topDate2: Int = 20// 초기화 하지 않아서 에러

class User{
    val objData1: String = "hello" // 초기화 하지 않아서 에러
    val objData2: String = "world"// 초기화 하지 않아서 에러

    //클래스 안에 정의 되어있기 때문에 함수가 아닌 메서드가 된다.
    fun some(){
        val localDate1: Int
        var localDate2: String

        localDate1 = 40 //val 이기 때문에 딱 한번 대입이 가능하다.
        println(localDate1) // 초기화 없이 참조할 경우 에러

        localDate2 = " hello"
        println(localDate2)
    }
}



// 중요
// null이 될 수 있는 변수와 없는 변수
//널 세이프티 ㅣ
// 널을 허용하는가 아닌가를 표사해주어야 한다.
// 기호 = ?
// 구조 변수 타입 ?