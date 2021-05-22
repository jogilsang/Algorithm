package programmers.level1

// https://programmers.co.kr/learn/courses/30/lessons/12910?language=kotlin

fun main(args:Array<String>)
{
    var case = intArrayOf(5,9,7,10)
    var divisor = 5
    var arr = solution_12910(case, divisor)
    arr.forEach { println(it) }
}

fun solution_12910(arr: IntArray, divisor: Int): IntArray
{
    var answer = arr.filter { it % divisor == 0 }.toIntArray().sortedArray()
    return if(answer.isEmpty()) intArrayOf(-1) else answer
}
