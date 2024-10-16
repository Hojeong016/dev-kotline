package ch03

import java.util.*
val scanner: Scanner = Scanner(System.`in`)

fun main() {
    val x = score()
    println("성적 : ${x} 학점 : ${grade(x)}")
}
// when 또한 표현식이기 때문에 대입연산자에서 사용이 가능하다.


fun score() =  scanner.nextInt()

fun grade(x : Int) = when (x) {
    in 90..100 -> "A"
    in 80..89  -> "B"
    in 70..79  -> "C"
    in 60..69  -> "D"
    in 50..59  -> "E"
    in 1..49   -> "F"
    else -> "0 ~ 100사이의 정수를 입력해 주세요" }


/*   val scanner: Scanner = Scanner(System.`in`)

   print("성적:")
   val score = scanner.nextInt()

   val grade = when (score) {
       in 90..100 -> println("A")
       in 80..89 -> println("B")
       in 70..79 -> println("C")
       in 60..69 -> println("D")
       in 50..59 -> println("E")
       in 1..49 -> println("F")
       else -> println("0 ~ 100사이의 정수를 입력해 주세요")

   }*/
