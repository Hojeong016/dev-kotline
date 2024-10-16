package question

//보조 생성자?? dto??
class Member( name: String, var age: Int){
/*    var name = name
    var age = age*/
}

fun main() {

    val member1 =Member("ho", 12)
    val member2 =Member("go", 18)
    val member3 =Member("so", 20)

    println("member1 = ${member1.age}, age = ${member2.age}")
    println("member2 = ${member2.age}, age = ${member3.age}")
    println("member3 = ${member3.age}")
}

//자바 생성자 -> 주 생성자 / 보조생성자