package backjoon
// kotlin
// 2019-11-22, time : 03:22, solved by gilsang
fun main(args: Array<String>) {

    var sc:String? = readLine()
    var n = sc.toString().toInt()
    var answer:String = ""

    for (i in 1..n) {
        for(j in 1..i) {
            answer += "*"
        }
        answer += "\n"
    }
    println(answer)

}


