package ch09

// 표준 함수
// 클래스의 기능 확장
// 상속을 통해 기능 확장 -> 자바 extends
// 코틀린은 위 상속의 방법과 다른 한가지의 방법을 더 제안
// 확장 함수, 확장 프로퍼티

// 정통적인 확장 , 상속을 통한 확장


// 확장 함수를 통한 기능 확장
class Super{
    val superData: Int = 10
    fun superFun() = println("superFun")
}

//확장 프로퍼티(Extension Property)
val Super.subData: Int
    get() = 20

fun Super.subFun() = println("Super.subFun")

fun main() {
    val obj: Super = Super()
    println("superData: ${obj.superData}, subData: ${obj.subData}")
    obj.superFun()
    obj.subFun()
}

// 기능을 추가한 느낌이네? 내가 여기에서 사용한 확장함수는 뭐야?


//한번 생성 후 모든 곳에써 쓰이게 할려면?
// log
