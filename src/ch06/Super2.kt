package ch06
//상속을 통한 자식 클래스 정의
open class Super2 {
    open var x:Int =10

    open fun someFun() = println("Suer....someFun")
}

class Sub2 : Super2() {
    override var x: Int = 20

    override fun someFun() {
        super.someFun()
        println("sup...${super.x}....$x")
    }
}

fun main() {
    var sup=Sub2()
    sup.someFun()
}