package ch03

//제어문

// if 표현식
// 만약 문으로 쓰더라도 마지막 줄이 표현식이 되어 return 을 사용하지 않아도 된/

fun main() {
    val a = 10;

    val result2 =
        if(a < 10){
            println("hello")
            10 + 20
        }else{
            println("world")
            20 + 20
        }

    println(result2)

val a1 = 1
    when(a1){
        1 -> println("1")
        2 -> println("2")
        else -> println("다른 값을 가짐")
    }

val a2 = "hello"
    when(a2){
        "world" -> println("world")
        "hello" -> println("hello")
        else-> println("다른 값을 가짐")
    }


}


//when
//다양한 타입의 데이터 또는 타입 자체 지정 가능


