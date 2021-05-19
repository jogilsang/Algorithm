package programmers.level1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */

fun main(args: Array<String>) {
    solution_12954_1(0, 3).forEach { println(it) }
}

fun solution_12954_1(x: Int, n: Int): LongArray {
    // given
    if(x < -10000000 && x > 10000000) throw IllegalArgumentException ("ERROR : Constraint 1")
    if(n > 1000) throw IllegalArgumentException ("ERROR : Constraint 2")

    var answer: LongArray = LongArray(n)
    var cnt: Int = 0

    // when
    while(cnt != n)
    {
        answer[cnt] = x.toLong() * (cnt+1)
        cnt++
    }

    // then
    return answer

}

// BP
// LongArray(n) { x.toLong() * (it+1)}