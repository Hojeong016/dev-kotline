package ch7
//주생성자가 반드시 존재해야하며 매개변수는 무조건 하나이상이 존재해야한다. 지역변수 노 멤버로
//반드시 하나의 인자가 있어야한다면 기존 스츠링에서 객체를  컨트롤 user() -> set() 그럼 이미 1번에서 코플린은 막힌다 -> 자동으로 해주었으면 좋겠어 ... 변환과정에서 디퐇트 생성자가 들어가겠끔 만들어주기 -> no-args 플러그인을 사용하기
// 추상화 안됨, 상속 안됨, 인터페이스 사용 안됨
// @Enitty, dto 모두 심플하게 정의 가능
data class User(val name: String, val age: Int){

    override fun toString(): String {
        return "User(name='$name', age=$age,email='$email')"
    }

    var email: String = "a@a,com"
}

fun main() {
    val user = User("Alice", 29)
    val user1 = User("Alice", 29)
    user1.email = "b@b.com"
    println(user.equals(user1)) //
    println(user1.toString()) //

val direction: Direction = Direction.NORTH

    val direction2: Array<Direction> = Direction.values() // 배열로
    direction2.forEach { t -> println(t) }


}

//copy() : 객체를 복사

enum class Direction(val no: Int) {
    NORTH(0), SOUTH(1), EAST(2), WEST(3)
}

/*enum class Direction {
    NORTH, SOUTH, EAST, WEST
}*/
