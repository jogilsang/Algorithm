package programmers.level1

import kotlin.test.assertNotEquals

//문제 설명
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//제한 조건
//s의 길이는 1 이상 5이하입니다.
//s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는 "0"으로 시작하지 않습니다.
//입출력 예
//예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
//str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

fun main(args:Array<String>)
{
    // 1. 시작이 -,+,'' 세 가지 케이스다
    // 2. +랑 ''은 toInt 하면되고, -인경우 제거하고 *-1을통해 음수로 바꿔준다.

    println(solution_12925("-123123"))
}

fun solution_12925(s: String): Int {

    var answer:Int

    if(s.get(0).toString().equals("-")) answer = s.substring(1).toInt() * -1
    else if (s.get(0).toString().equals("+")) answer = s.substring(1).toInt() * 1
    else answer = s.substring(0).toInt() * 1

    return answer
}