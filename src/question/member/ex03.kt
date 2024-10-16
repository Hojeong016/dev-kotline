package question.member

import java.util.*

//Map<UserId, Member>

val scan = Scanner(System.`in`)

fun main() {
    val map: Map<String, Member> = mapOf(
        Pair("lee",Member("lee","1234")),
        "dee" to Member("dee","1234")

    )
    println("아이디를 입력해주세요")
    val id = scan.nextLine()

    println("페스워드를 입력해주세요")
    val password = scan.nextLine()

    val member: Member? = map[id] // 멤버 객체가 담김 수정: 널 처리 해주기
    if(id == member?.userId && password == member?.password) "로그인에 성공했습니다" else "로그인에 실패했습니다"

}