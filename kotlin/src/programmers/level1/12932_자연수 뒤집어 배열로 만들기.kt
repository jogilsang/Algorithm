package programmers.level1

fun main(args:Array<String>)
{
    solution_12932(12345)
}

fun solution_12932(n: Long): IntArray {
    // (1) size를 받는다.
    var size = n.toString().length
    // (2) 문자열을 뒤집는다.
    var value = n.toString().reversed()
    // (3) 뒤집힌 문자열을 배열로만든다.
    var answer = IntArray(size) {Character.getNumericValue(value.get(it))}



    return answer
}