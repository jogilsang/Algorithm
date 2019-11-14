package book_kotlin_200

typealias Number = Int

fun main(args: Array<String>): Unit {
//
//    //  001
//    println("Hello kotlin!");
//
//    // 002
//    println(53 + 62 - 126)
//
//    // 003
//    var total: Int
//    total = 0;
//
//    val a: Int = 10 + 53 - 7
//    println(a);
//    val b: Int = 43 + 75 + a
//    println(b);
//
//    total = a + b;
//    println(total);
//
//    // 004
//    val variable = 10 + 12 -5
//    println(variable)
//
//     011
//    var str:String = "Hello"
//
//    println(str)
//
//    str = str + "\nKotlin"
//    println(str)
//
//    println(str[5]) // 개행은 화면에 안나옴
//    println(str[8])
//
//    // 012
//    var a = 10
//    var b = 20
//
//    println("a+b = ${a+b}")
//    println("a+b =" + (a + b))
//
//    // 013
////
////    val a:book_kotlin_200.Number = 10
////    println(a)
//
//    // 017
//
//    var isRight: Boolean = (10 + 70) > (3 * 25)
//    println(isRight)
//
//    isRight = false
//    println(isRight)
//
//    isRight = 30 == (10 + 20)
//    println(isRight)
//
//    var a = 15
//    var b = 17
//
//    var bool: Boolean = (a - b) > (a + b)
//    println(bool)
//
//    // 022
//    var values: Int = if (10 > 5) {
//
//        10
//    } else {
//        5
//    }
//
//    var values2 : Long = if(15 < 20) {
//        30
//    }else {
//        20
//    }
//
//    // 코틀린은 삼항연산자 없음
//
//    println(values2)
//
//     023
//
//        when(타깃 표현식)
//        {
//            타깃 표현식과 비교할 값
//                    {
//                        N개의 문장
//                    }
//        }
//
//    val score: Int = 64
//
//    when (score / 10) {
//
//        6 -> {
//            println('D')
//        }
//        7 -> {
//            println('C')
//        }
//        8 -> {
//            println('B')
//        }
//        9,10 -> {
//            println('A')
//        }
//        else -> {
//            println("test")
//        }
//
//    }
//
//     024
//
//    var score = 95
//
//    var grade:Char = when(score/10) {
//
//        6 -> 'D'
//        7 -> 'C'
//        8 -> 'B'
//        9 -> 'A'
//        10 -> 'S'
//        else ->'F'
//    }
//
//    var grade2:String = when(score/10) {
//
//        10 -> "S++"
//        9 -> "A+"
//        8 -> "B+"
//        7 -> "C+"
//        6 -> "D+"
//
//        else -> "null"
//
//    }
//
//    var grade3:String = when {
//
//        score >= 10 -> "S++"
//        score >= 9 -> "A+"
//        score >= 8 -> "B+"
//        score >= 7 -> "C+"
//        score >= 6 -> "D+"
//
//        else -> "null"
//
//    }
//
//    println(grade2)
//
//    // 029
//
//    var x = 0
//    var y = 0
//
//    // 레이블 기능
//    outer@ while (x <= 20) {
//
//        y = 0
//        while (y <= 20) {
//
//            if (x + y == 15 && x - y == 5)
//                break@outer
//            y = y + 1
//
//        }
//        x += 1
//    }
//
//
//    println("x:$x, y:$y")
//
//    // 030
//    book_kotlin_200.myFuntion()
//
//
//      // 031
//      println(book_kotlin_200.cToF(30))
//
//    // 032
//    book_kotlin_200.cToF2(50)
//    book_kotlin_200.cToF3(50)
//
//    // 033
//    book_kotlin_200.cToF4(5,3)
//    book_kotlin_200.cToF4(5,3,true)
//    book_kotlin_200.cToF4(print=true)
//    book_kotlin_200.cToF4(b=0, print=true)
//
//    // 034
//
//    // 040
//    println(max(100,200))
//
//    // 043
//    book_kotlin_200.ex_func_in_another_package.max(100,200)
//
//    // 045
//
//    val person = object {
//        val name:String ="홍길동"
//        val age:Int = 36
//    }
//
//    println(person.name)
//    println(person.age)
//
//
//     046
//
//    val person = object {
//        val name:String = "홍길동"
//        val age:Int = 36
//    }
//
//    val person2 = object {
//        val name:String = "김미영"
//        val age:Int = 29
//    }
//
//    val person3 = object {
//
//        val name:String = "John"
//        val age:Int = 52
//    }
//
//    val person:book_kotlin_200.Person
//    person = book_kotlin_200.Person()
//    person.name = "홍길동"
//    person.age = 36
//
//    val person2:book_kotlin_200.Person
//    person2 = book_kotlin_200.Person()
//    person2.name = "조길상"
//    person2.age = 20
//
//    val person3:book_kotlin_200.Person
//    person3 = book_kotlin_200.Person()
//    person3.name = "박수미"
//    person3.age = 28
//
// 051
//
// 코틀린의 == 은 자바의 equals
// 코틀린의 ===은 참조
//
//    val a = book_kotlin_200.AAA()
//    a.memberFunc(53)
//
//     59 연산자 오버로딩
//
//     61 invoke(호출 연산자)
//     ()연산자를 오버로딩
//
//    // 62
//    println('o' in "Kotlin")
//    println("in" !in "Kotlin")
//
//    // 63 중위표기법
//    val pt = book_kotlin_200.Point(6,3) - book_kotlin_200.Point(1,1)
//    println(pt.x)
//    println(pt.y)
//
//     64 상속
//     코틀린은 class가 기본적으로 final
//     상속을 허용하려면 open을 붙여야함
//     부모클래스 -> 슈퍼클래스 , 자식클래스 -> 서브클래스
//
//    // 65 업캐스팅
//    // 서브클래스의 인스턴스를 슈퍼클래스로 지정할수있음, 가리킬수있음
//    val person2: book_kotlin_200.Person2 = book_kotlin_200.Student("john", 32, 20171218)
//
//    // 66 오버라이딩(Overriding)
//    // final을 붙여서 더이상 오버라이딩 할수없게 할수도있음, final overide
//    book_kotlin_200.AAA3().func()
//    book_kotlin_200.BBB3().func()
//
//    // 67. 프로퍼티를 오버라이딩하기
//    val test = book_kotlin_200.BBB()
//    test.number = 5 // book_kotlin_200.BBB()의 setter 호출
//    test.number     // book_kotlin_200.AAA()의 getter 호출
//
//      // 68. 다형성(Polymorphism)의 활용
//     val one = book_kotlin_200.AAA68()
//     val two = book_kotlin_200.BBB68()
//     val three:book_kotlin_200.AAA68 = two
//
//     // 오버라이딩 된 멤버 함수를 호출하면 참조 변수가 실제로 가리키고 있는 객체의 멤버함수 호출
//    one.book_kotlin_200.hello()
//    two.book_kotlin_200.hello()
//    three.book_kotlin_200.hello()
//
//    // 69 클래스를 상속하는 객체
//    // 상속해야될 클래스를 굳이 안만들어도 되는...?
//    val custom: book_kotlin_200.Person69 = object : book_kotlin_200.Person69("길상", 27) {
//        override fun print() {
//            println("object function printed")
//
//        }
//    }
//    custom.print()
//
//    // 70 모든 클래스는 Any를 상속한다
//    val test:book_kotlin_200.Person69 = book_kotlin_200.Person69("길상", 27)
//    book_kotlin_200.printObject(test)
//
//    // 72 예외처리
//    // try : 예외를 감지하는 부분
//    // catch : 예외가 발생했을때 대신 실행하는 코드
//    // finally : 예외와 관계없이 무조건 실행
//    try{
//        val str = "abcd"
//        val num = str.toInt()
//
//        println(num)
//    }catch (e:NumberFormatException) {
//        println("문자열을 숫자로 변경하지못함")
//    }finally {
//        println("프로그램 종료")
//    }
//
//     73 예외 던지기
//     throw Exception("0으로 나눌수없습니다")
//     그 순간 실행문은 아래로 더 이상 진행하지않고,
//     예외처리 해주는 부분까지 거슬러올라간다
//     예외처리를 해주지않으면, 프로그램을 종료한다.
//
//     74 Nothing 타입
//     Nothing 타입은 모든 타입과 호환가능
//     특정 타입으로 return하는 구문에대해서
//     throw Exception이 Nothing Type이기때문에 가능함
//
//    // 75 Nullable 타입과 Null
//    // Nullable이란 null값을 지정할수있게 하는것
//    // null은 참조변수가 어떠한 객체도 가리키지 않고 있음을 나타내는 키워드
//    // 참조변수 선언
//    // null 은 nothing? 타입, nothing타입은 모든것에 호환되기때문에, Int?타입에 대응될수있음
//    // 실제 데이터는 stack이 아닌 heap에 저장된다
//    // 자바랑 다르게 코틀린은 아무거나 null을 넣을수없음
//    var num: Int? = null
//    num = 10
//    println(num)
//
//     // 76 Safe Call Operator (안전한 호출 연산자)
//     // Nullable 한 참조 변수의 프로퍼티와 멤버 함수에 접근할라면
//     // ?. 키워드를 사용, null 값에 안전
//     // 참조변수가 null이 더라도 프로퍼티와 멤버함수에 대해서 null이 됨
//     var obj:book_kotlin_200.Building? = null
//     obj?.print()
//     obj?.height = 10
//     obj?.width = 10
//     obj?.print()
//
//     obj = book_kotlin_200.Building()
//     obj?.height = 10
//     obj?.width = 10
//     obj?.print()
//
//      // 77 Not Null 단정 연산자(Not-null Assertion Operator)!!
//
//     var obj:book_kotlin_200.Building? = book_kotlin_200.Building()
//     obj!!.width = 10
//     println(obj!!.width)
//
//    // KotlinNullPointerException 발생
//    // !!는 Not-null Assertion Operator이다
//    // obj가 null이 아니였기때문에, obj!!는 book_kotlin_200.Building?에서 book_kotlin_200.Building 타입으로 캐스팅된다
//    // 따라서 에러없이 가능
//    // 하지만 아래는 null을 가리키기때문에, 캐스팅안됨
//
//    obj = null
//    obj!!.print()
//
//      // 78 엘비스 연산자 ?:
//      // 참조변수가 null이면, 오른쪽피연산자
//      // 참조변수가 null이 아니면, 왼쪽피연산자 (참조하는 데이터)
//
//      var obj:Int? = null
//      println(obj ?: 100)
//
//      obj = 200
//      println(obj ?: 300)
//
//        80 is 연산자
//        java의 instanceof
//        book_kotlin_200.Person, book_kotlin_200.Student, Professor
//        var person:book_kotlin_200.Person = book_kotlin_200.Student()
//        person is book_kotlin_200.Person : True
//        person is book_kotlin_200.Student : True
//        person is Professor : false
//
//       when(person) {
//
//           is book_kotlin_200.Person -> {}
//           is book_kotlin_200.Student -> {}
//           is Professor -> {}
//
//       }
//
//       81 as연산자와 다운캐스팅
//       var person3:book_kotlin_200.Student = person as book_kotlin_200.Student
//       person3 = person2 as book_kotlin_200.Student

////  중급 시작
//
//    // 88 객체 선언
//    // 싱글톤 패턴 필요없게됨
//    // 프로그램 전체에서 하나뿐인 객체 공유가능
//
//    // 식별자 Person으로 바로 객체에 접근가능
//
//    book_kotlin_200.Person88.name = "길상"
//    book_kotlin_200.Person88.age = 30
//    book_kotlin_200.Person88.print()
//
//    var test:book_kotlin_200.Person88 = book_kotlin_200.Person88
//    test.name = "수미"
//    test.age = 10
//    test.print()
//
//    var test2:book_kotlin_200.Person88 = book_kotlin_200.Person88
//    test2.name = "길상"
//    test2.age = 35
//    test2.print()
//
//    test.print()
//    test2.print()

//    // 89 동반자 객체
//    // 코틀린에는 더이상 static이 존재하지않음
//    // 특정 클래스의 모든 인스턴스가 공유하는 객체를 만들떄 companion 키워드 사용
//    // 클래스당 companion은 한개
//
//    var a = book_kotlin_200.Person89.book_kotlin_200.create()
//    var b = book_kotlin_200.Person89.book_kotlin_200.create()
//    var c = book_kotlin_200.Person89 // 적용안됨
//
//    println(c.countCreated)
//    println(book_kotlin_200.Person89.countCreated)
//    println(book_kotlin_200.Person89.Companion.countCreated)

//    // 90 인라인 함수
//    // 실행흐름을 점프하지않고, 함수 호출문을 함수 몸체로 대체하기때문에 성능이 좀 좋아짐
//    // 재귀호출하면 무한대로 늘어날수있기때문에 불가
//    // 문작이 적고, 빈번히 호출되는 것만 추천
//
//    // 91 const
//
//    // 92 lateinit
//    // 사용자 정의클래스의 경우 어떡해 초기화하는가
//    // 나중에 초기화하겠다고 var 앞에 붙이는것
//
//    val rect:book_kotlin_200.Rect92 = book_kotlin_200.Rect92()
//
//    rect.pt= book_kotlin_200.Point92(3,2)
//    rect.pt2= book_kotlin_200.Point92(5,4)
//
//
//    println(rect.width)
//    println(rect.height)
//    println(rect.area)

//    // 93 Nullable 리시버
//
//    // 94 동반자 객체의 확장함수
//
//    book_kotlin_200.Person94.Companion.book_kotlin_200.create()
//    book_kotlin_200.Person94.Companion.book_kotlin_200.empty()
//    book_kotlin_200.Person94.Companion.book_kotlin_200.input(3,5)

//     // 95 확장 함수의 리시버 타입이 상속관계에 있을경우
//     // 확장함수는 참조변수를 따라가게됨
//     // 부모를 따라감
//    var aaa:book_kotlin_200.AAA95 = book_kotlin_200.BBB95()
//    aaa.book_kotlin_200.hello()

//    // 96 abstract
//    // 공통 멤버
//
//    // 97 인터페이스
//    // 인터페이스는 플러그인을 추가하는것
//
//    // 98 다이아몬드문제
//    // 똑같은 인터페이스를 상속한 각각의 인터페이스를
//    // 한 클래스가 구현하게되는경우, 어떤 함수를 사용해야하는가
//    // super<> 키워드로 구별가능
//
//    book_kotlin_200.Child98().like()

//    // 99 중첩 클래스
//    val instance99:book_kotlin_200.Outer99.Nested99 = book_kotlin_200.Outer99.Nested99()
//    instance99.book_kotlin_200.hello()

    // 100 내부클래스(Inner class)
    // this@className으로 참조가능
    // 따로 만들어줘야됨
    // 참조변수형태

    val instance100: Outer100 = Outer100(610)
    val innerInstance100: Outer100.Inner = instance100.Inner(40)
    val innerInstance200: Outer100.Inner = instance100.Inner(100)

    instance100.print()
    innerInstance100.print()
    innerInstance200.print()

}

// 내부 클래스(Inner Class)
class Outer100(private val value: Int) {

    fun print() {
        println(this.value)
    }

    inner class Inner(private val innerValue:Int) {
        fun print(){
            this@Outer100.print()
            println(this.innerValue + this@Outer100.value)
        }
    }

}


// 중첩클래스
class Outer99 {
    class Nested99 {
        fun hello() = println("중첩된 클래스")
    }

}


interface Parent98 {
    fun like()
}

interface Mother98 : Parent98 {
    override fun like() = println("i like mom")
}

interface Father98 : Parent98 {
    override fun like() = println("i like dad")
}

class Child98 : Mother98, Father98 {

    override fun like() {
        super<Mother98>.like()
    }


}


interface Prinable97 {
    fun print()
    fun print2(): Unit
}

abstract class Person96 {

    abstract fun getSalary(): Int
}

class Student96(private val tuition: Int) : Person96() {

    override fun getSalary(): Int = -tuition
}

class Teacher96(private val ClassCount: Int) : Person96() {

    override fun getSalary(): Int = ClassCount * 200
}

open class AAA95
class BBB95 : AAA95()

fun AAA95.hello() = println("book_kotlin_200.hello aaa95")
fun BBB95.hello() = println("book_kotlin_200.hello bbb95")

class Person94 {
    companion object
}

fun Person94.Companion.create() = Person94
fun Person94.Companion.empty() = println("ddd?")
fun Person94.Companion.input(x: Int, y: Int) = println(x + y)

// 점을 표현하는 클래스
class Point92(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect92 {

    lateinit var pt: Point92
    lateinit var pt2: Point92

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y

    val area get() = width * height

}


inline fun hello90() {
    println("Hello")
    println("Kotlin")
}


class Person89 private constructor() {

    var test = 0

    companion object {

        var countCreated: Int = 0
            private set

        fun create(): Person89 {
            // test += 1
            countCreated += 1
            return Person89()
        }


    }

}

object Person88 {

    var name: String = ""
    var age: Int = 0
    fun print() {
        println(name)
        println(age)
    }

}

class Building {

    var height: Int = 0
    var width: Int = 0

    fun print() {
        println(this.height)
        println(this.width)
    }

}


fun printObject(any: Any) {

    println(any.toString())
    println(any)
}


open class Person69(val name: String, val age: Int) {
    open fun print() {
        println("이름 : $name")
        println("나이 : $age")
    }


}

open class AAA68 {
    open fun hello() = println("AAA입니다.")
}

class BBB68 : AAA68() {

    override fun hello() = println("BBB입니다.")
}

open class AAA67 {

    open var number = 10
        get() {
            println("book_kotlin_200.AAA book_kotlin_200.Number Getter 호출됨")
            return number
        }
        set(value) {

            println("book_kotlin_200.AAA 호출됨")
            field = value
        }
}

class BBB : AAA67() {

    override var number: Int
        get() {
            return number
        }
        set(value) {
            println("book_kotlin_200.BBB book_kotlin_200.Number Setter 호출됨")
            super.number = value
        }
}


open class AAA3 {
    open fun func() = println("book_kotlin_200.AAA")
}

class BBB3 : AAA3() {
    override fun func() {
        super.func()
        println("book_kotlin_200.BBB")

    }

}

open class Person2(name: String, age: Int)

class Student(name: String, age: Int, id: Int) : Person2(name, age)

class Point(var x: Int = 0, var y: Int = 0) {

    infix fun from(base: Point): Point {
        return Point(x - base.x, y - base.y)
    }
}

class product(val id: Int, val name: String) {

    operator fun invoke(value: Int) {
        println(value)
        println("id:$id\nname:$name")
    }
}


class Person {
    var name: String = ""
    var age: Int = 0
}


fun myFuntion(): Int {

    // 프로퍼티
    var a = 3
    var b = 5
    println(a + b)

    return a + b
}

fun cToF(celsius: Int): Double {
    return celsius * 1.8 + 32
}

fun cToF2(celsius: Int): Unit {
    println("celsius : " + celsius * 1.8 + 32)
}


fun cToF3(celsius: Int) {
    println("No UNIT Needed")
    println("celsius : " + celsius * 1.8 + 32)
}

fun cToF4(a: Int = 0, b: Int = 1, print: Boolean = false) {

    when (print) {

        false -> println(a)
        true -> println(b)

    }

}

fun getSumOf(vararg numbers: Int): Int {
    var count = numbers.size
    var i = 0
    var sum = 0


    while (i < count) {
        sum += numbers[i]
        i++
    }

    return sum
}
