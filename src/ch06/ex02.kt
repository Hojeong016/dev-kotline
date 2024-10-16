package ch06

//접근제한자
// public(생략시 기폴트 값),internal(모듈/패키지/내에서 허용),protected,private
//open과 private 같이 사용할 수 없다.
//오버라이드할때 접근범위를 줄이는 방식으로 할 수 는 없다.

//단일상속만 허용, 코드 재사용과 다형성을 위해
//엄청난 혼란 <-단일 상속을 위배
//이게 바로 다이아몬드 문제
// 다중 상속을 보완하며 여러 타입을 사용하게 복합기 -> 인터페이스// 따라서 코드의 재사용 입장에서 바라보기 보단 타입을 어떻게 운용할까의 관점에서 바라보기

//추상클래스와 인터페이스
//왜 추상클래스를 사용하는가?

abstract class Super{
    val datal: Int = 10
    abstract val date2: Int
    fun myFun(){

    }

    abstract fun myFun2()
}

class Sub:Super(){
    override val date2: Int = 10
   // 재사용이 아닌 규칙? 다형성을 위해서 상속을 받은 것이다. 따라서 재사용할 필요없으니 추상화 시킴
    override fun myFun2() {
    }
}

fun main() {
    // val obj1 = Super() // 에러
    // 추상 클래스는 직접 인스턴스를 생성할 수 없다
    // 추상 클래스는 반드시 하위 클래스에서 구현된 후에만 사용할 수 있다


    val obj2 = Sub()
}


//인터페이스 만들기
interface MyInterface{
    var date1: String
    fun myFun(){}
    fun myFun2()
}

class MyClass: MyInterface{
    override var date1: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun myFun() {
        super.myFun()
    }

    override fun myFun2() {
        TODO("Not yet implemented")
    }
}

fun main1() {
    //val obj = MyInterface()
    val obj2 = MyClass()
    obj2.myFun()
    obj2.myFun2()
}