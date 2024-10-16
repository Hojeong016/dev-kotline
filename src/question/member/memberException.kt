package question.member

enum class MemberExceptions(val message: String, val code: Int) {
    NOT_FOUND("not found", 404),
    DUPLICATED("Duplicated", 409),
    INVALID("invalid", 400),
    BAD_CREDENTIALS("bad credentials", 401);

    fun toMemberException(): MemberTaskException = MemberTaskException(message, code)
}


data class MemberTaskException(override val message: String, val code:Int) : RuntimeException()

//데이터 클래스와 이니셜 라이자