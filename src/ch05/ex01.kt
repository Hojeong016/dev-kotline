package ch05

//생성자
//보조 생성자
// 주 생성자는 한개 , 보조는 여러개로 클래스 바디 영역에 예약어로 선언하는 생성자이다..

//매개변수 없는 기본 주 생성자
class User1{}

//주생성자 선언
class User2(name: String){}

//기본 주 생성자와 함께 보조 생성자(val, var 을 붙이지 못함 즉 멤버 변수로 만들 수 없다)
class User3 {
    constructor(){}
    constructor(name: String){}
    constructor(name: String, age: Int){}
}
fun main(args: Array<String>) {
    val user1 = User1()
    val user2 = User2("John")
    val user3 = User3() //에러 -> 해결하기 위해 다양한 경우의 보조생성자를 만들어줘야한다.
    val user4 = User3("hong")
    val user5 = User5()
}

// 초기화 : 주생성자, init 블럭 , 보조 생성자
// -> 실행 순서 : 주 -> init -> constructor

class User5{
    init{
        println("inti 실행")

    }

    constructor(){
        println("constructor")

    }}

class User6(name: String) {
   // constructor(name: String, age: Int) {} // 에러 이류 : 기본 생성자가 없어서? / 주샌성자가 선언되어있다면 무조건 주 생성자를 같이 호출해 주어야 한다.
    constructor(name: String, age: Int) : this(name) {}
    constructor(name: String, age: Int, email: String) : this(name,age) {}
}