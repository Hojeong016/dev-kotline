package ch05

// 권장되는 형식
class User9(var name: String, var age: Int?, var email: String) {
    constructor(name: String) : this(name,null,"") {}
    constructor(name: String,age: Int):this(name, age,""){}
}
fun main(args: Array<String>) {
    val user  = User9("Alice", 28, "demo")
    val user2 = User9("Alice", 28)
    val user3 = User9("Alice")
}