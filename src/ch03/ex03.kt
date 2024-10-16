package ch03

//반복문

//for(변수 in {범위, 컬렉션})

fun main2(){
    var sum:Int = 0

    for(i in 1..10){
        sum += i
    }
    println(sum)

    for(i in 1 until 11 step 2){
        print("$i ")
    }
}

//컬렉션 기반으로 돌리기
// for(x in 콜렉션)

fun main1(){
    val list = listOf("hello","world","!") //listOf (읽기 전용)
    val sb = StringBuffer()
    for(str in list){
        sb.append(str)
    }
    println(sb)

    println(list.indices)
    for (i in list.indices){
        println(list[i])
    }

    for((index,value) in list.withIndex()){
        println("$index: $value")
    }
}

//이중 for 문 break??
fun some(vararg a:String){
    val interator = a.iterator()
    while (interator.hasNext()){
        println(interator.next())
    }
}

// 전개 연산자
fun main3() {
    val array1 = arrayOf(10,20,30)

    val list1 = listOf(1,2,array1[0],array1[1],array1[2],100,200)
    list1.forEach { println(it) }

    val list2 = listOf(1,2,*array1,100,200)
    list2.forEach { println(it) }

    val array3 = arrayOf<String>("hello","world")
    some(*array3)

    val list3 = listOf("a","b")
    some(*list3.toTypedArray())
}

//일치 연산자
// 내용 비교 : ==, !=
// 참조 비교 : ===,!==

//null 안전 연산자
