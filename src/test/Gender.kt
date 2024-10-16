package test

import java.util.*
import kotlin.random.Random

enum class Gender() {
    MALE,FEMAL;
    // 코틀린 랜덤 값 설정하기
    companion object {
        fun random() = Gender.values().random()
    }
}

enum class City() {
    서울, 인천, 안양, 수원;
    // 코틀린 랜덤 값 설정하기
    companion object {
        fun random() = City.values().random().toString()
    }
}

// 디폴트 값 설정 하는 또다른 방법? : 보조 생성자로 설정 = constructor(): this("",Gender.random(),"",0)
data class Student(
    var name: String = "기본",
    var gender: Gender =Gender.random(),
    var city: String = "기본",
    var score:Int = 0)
{
    override fun toString(): String {
        return "$name($gender) $score - $city"
    }
    //run 을 활용하여 메인에서 출력해보기
}

object StudentDB{
    val students : MutableList<Student> = mutableListOf()

    //객체를 초기화하거나 설정하는 데 사용하는 스코프 함수 =apply
    //객체 자신을 반환
    //this 키워드를 사용하지 않아도 됨
    init{
        for(i in 1..100){
            var student =  Student().apply {
                name = "student $i"
                gender = Gender.random()
                city = City.random()
                score = Random.nextInt(100)
            }
            students.add(student)
        }
    }
}

fun main() {
    val student1 = StudentDB.students
   /* println(student1.forEach(::println))*/
   /* student1.stream().sorted().forEach{println(it)}*/
    //특정 기준
    //run 함수
    //val result = obj.run {
    //    // 리시버 객체의 속성 및 메서드에 접근 가능
    //    // 작업 수행
    //    // 마지막 표현식이 결과로 반환됨
    //}
    val scan : Scanner = Scanner(System.`in`)
    val cityScan = scan.nextLine()

    student1.filter { it.city ==cityScan }.sortedBy { it.score }.forEach { println(it.run{"$name($gender) $score - $city"}) }


    var seoul = student1.filter { it.city == "서울"}.map{it.score}.average()
    var su = student1.filter { it.city == "수원"}.map{it.score}.average()
    var a = student1.filter { it.city == "안양"}.map{it.score}.average()
    var inc = student1.filter { it.city=="인천"}.map{it.score}.average()
    println("도시별 학생 평균 \n 서울 : $seoul \n 수원 : $su \n 안양 : $a \n 인천 : $inc")


    println("상위 10명")
    student1.sortedBy { it.score }.reversed().take(10).forEach { println(it.run{"$name($gender) $score - $city"}) }
    /*  student1.forEach{ println(it)}*/
    // 전체 평균

    var avg = student1
        .map { it.score }
        .average()

    println("전체 평균 : $avg")
    // 여학생 별 평균
    var gAvg = student1.filter { it.gender == Gender.FEMAL}.map { it.score }.average()
   println("여학생 : $gAvg")
    //남학생별 평균
    var mGAvg = student1.filter { it.gender == Gender.MALE}.map { it.score }.average()
    println("남학생 : $mGAvg")
}


// 아직 남은 것 예외 처리
// 테스트 코드 진행
//파일 입출력 클래스가 있는가? 없다 자바의 파일쓴다.
// 활용 내용
// 평균 구하는 함수
// stream 활용 법
// run ,apply 함수 스코프 사용법