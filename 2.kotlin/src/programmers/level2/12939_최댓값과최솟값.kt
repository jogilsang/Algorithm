package programmers.level2

//문제 설명
//      문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//      예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
//
//제한 조건
//      s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
//      입출력 예

fun main(args:Array<String>)
{
    solution_12939("-4 -5 -1 3")
}

fun solution_12939(s: String):String {
    // 1
    var list = s.split(" ").map{it.toInt()}.sorted()
    var answer = "${list.get(0)} ${list.get(list.lastIndex)}"

    // 2
    // list = s.split(" ").map{it.toInt()}
    // answer = "${list.min()} ${list.max()}"
    return answer
}