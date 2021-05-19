package programmers.level1

// https://programmers.co.kr/learn/courses/30/lessons/12969
// refactor : 2021-05-19

fun main(args: Array<String>) {

    // given : 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    // when
    val result: StringBuffer = getStartSquare(a, b)
    // then
    println(result)

}

fun getStartSquare(a: Int, b: Int): StringBuffer {

    val row: StringBuffer = StringBuffer()
    val StartSquare: StringBuffer = StringBuffer()

    for (i in 1..a) row.append("*")
    for (j in 1..b) StartSquare.append(row).append("\n")

    return StartSquare
}