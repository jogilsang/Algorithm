package programmers.level1

//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//      예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//제한 조건
//      a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//      a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//      a와 b의 대소관계는 정해져있지 않습니다.


fun main(args:Array<String>)
{
    // 1. 시작이 -,+,'' 세 가지 케이스다
    // 2. +랑 ''은 toInt 하면되고, -인경우 제거하고 *-1을통해 음수로 바꿔준다.

    println(solution_12912(1, 5))
}

fun solution_12912(a: Int, b:Int): Long {
    // given
    var answer:Long = 0L
    var start:Long = (if(a>b) b else a).toLong()
    var end:Long = (if(a>b) a else b).toLong()

    // when
    answer = (start..end).toList().sum()

    // then
    return answer
}