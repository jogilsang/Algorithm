package programmers.level1

//
//문제 설명
//  함수 solution은 정수 n을 매개변수로 입력받습니다.
//  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//  예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//제한 조건
//  n은 1이상 8000000000 이하인 자연수입니다.
//  입출력 예
//

fun main(args:Array<String>)
{
    println(solution_12933(121221))
}

fun solution_12933(n: Long): Long{
    // TODO
    // (1) charSequence나 String으로 바꾼다
    // (2) 내림차순으로 정렬한다.
    var value = n.toString().split("").sortedDescending().joinToString ("")

    // (3) 합쳐서 Int로 바꾼다.
    var answer:Long = value.toLong()
    return answer
}