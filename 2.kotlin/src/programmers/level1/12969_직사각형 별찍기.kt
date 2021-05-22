package programmers.level1

import java.lang.NumberFormatException
// https://programmers.co.kr/learn/courses/30/lessons/12969

fun main(args: Array<String>) {

    // given : 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var i = a;
    var j = b;
    val row:StringBuffer = StringBuffer()
    val result:StringBuffer = StringBuffer()

    // when : for문으로 *를 a번, b번반복
    while(i != 0)
    {
        row.append("*")
        i--
    }

    while (j != 0)
    {
        result.append(row).append("\n")
        j--
    }

    // then
    println(result)

}