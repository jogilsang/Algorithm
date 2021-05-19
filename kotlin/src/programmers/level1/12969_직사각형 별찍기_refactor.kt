package programmers.level1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */

fun main(args: Array<String>) {

    // given
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    // when
    val result: StringBuffer = getStarSqure(a, b)
    // then
    println(result)

}

/**
 * 별(*)를 a번 반복한 문자열을 b번 반복한 뒤, 출력한다.
 *
 * @param {Int} a 별(*)를 반복하는 횟수(=StarRow.length)
 * @param {Int} b 반복된 별(*)을 개행할 횟수
 * @return {StringBuffer} StarSquare 출력 시, 별(*)이 a*b 로 구성된 문자열
 */

fun getStarSqure(a: Int, b: Int): StringBuffer {

    val StarRow: StringBuffer = StringBuffer()
    val StarSqure: StringBuffer = StringBuffer()

    repeat(a){StarRow.append("*")}
    repeat(b){StarSqure.append(StarRow).append("\n")}

    return StarSqure
}