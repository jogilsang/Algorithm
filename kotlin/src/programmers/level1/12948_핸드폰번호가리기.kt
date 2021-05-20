package programmers.level1

fun main(args:Array<String>)
{
    print(solution_12944("01093149874"))
}

fun solution_12944(phone_number: String): String {
    var answer = StringBuffer()
    val NUM_VISIBLE:Int = 4

    repeat(phone_number.length - 4){answer.append("*")}
    answer.append(phone_number.subSequence(phone_number.length - 4 , phone_number.length))

    return answer.toString()
}