package programmers.level1

// kotlin

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */

fun main(args: Array<String>) {
    //    [1,2,3,4]
    //    [5,5]
}

fun solution(arr: IntArray): Double {
        var answer:Double = 0.0
        arr.forEach {
            answer += it
        }
        return answer/arr.size
}
