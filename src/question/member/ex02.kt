package question.member

import java.util.*

class Member(val userId: String, var password: String){
    override fun toString(): String {
        return "Member(id=$userId, password=$password)"
    }

    //toString ,getter,setter - 프로퍼티를 자동으로 생성해주는 것 아니었어? 그런데 왜 오버라이딩을 했을까?
    //기본 toString() 메서드는 클래스 이름과 객체의 **참조값(hash code)**을 문자열로 반환
    //따라서 내용을 출력하고 싶으면 재정립 과정이 필요
    //하지만 코틀린에서는 data class**를 사용하면 toString(), equals(), hashCode()가 자동으로 생성되기 때문에 위 코드를 간소화 시킬 수 있다.
}

val scanner: Scanner = Scanner(System.`in`)

fun main() {


    val list = mutableListOf<Member>(
        Member("a", "abc"),
        Member("b", "def"),
         Member("c", "ghi")
    )
   //  mutableListOf() - 수정 가능 리스트

    for(i in list){
        println("member: ${i.userId}, ${i.password}")
    }

    for((index, value ) in list.withIndex()){
    println(" $index : ${value.userId}, ${value.password}")
    }}