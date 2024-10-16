package ch04.ch04_01

class  MyClass {
    var name:String ="world"

    fun sayHello(){
        println("Hello $name")
    }
} //public 클래스이기때문에 다른 파일애았자먼 동일 패키지 이름을 정의

class MyClass2

fun main(args: Array<String>) {
    val obj1: MyClass? = MyClass()
    obj1?.sayHello()
    val obj2 = MyClass()

    obj1?.name = "hoJeong"
    obj1?.sayHello()

   println(user1.uppername)
   println(user1.name)
}

// 주생성자는 클래스의 선언부에 작성
// 하나의 클래스에 하나의 주 생성자만 정의 가능
// 주생성자는 반드시 존재해야한다. 기본 생성자의 경우 생략 가능

// 매개변수를 가지는 주생성자

class User1(name: String, age: Int){
    //주생성자의 역할을 여기에 넣어 사용
    //init 블럭에서는 생성자의 매개변수를 사용할 수 있다.

   //초기화 진행
    init{
        println("$name, $age")
       //// 생성자 (초기화 작업)
       //    public User1(String name, int age) {
       //        this.name = name;  // this로 필드 초기화
       //        this.age = age;
       //        this.upperName = name.toUpperCase();  // 필드 초기화
       //        System.out.println(name + ", " + age);  // 초기화 과정에서 출력
       //    }
    }

    //프로퍼티
    val uppername = name.toUpperCase()
    val name = name
}

class User2(name: String, age: Int){}

val user1 = User1("John", 25)

val user2 = User2("ho", 25)