package backjoon
// kotlin
// 2019-11-23, time : 10:37, solved by gilsang
fun main(args: Array<String>) {

    var answer:String = ""

    var str = readLine().toString()
    var arrStr = str.split(" ")
    var N:Int = arrStr.get(0).toInt()
    var X:Int = arrStr.get(1).toInt()

    str = readLine().toString()
    arrStr = str.split(" ")

    for(i in 0 .. N-1) {
        var value = arrStr[i].toInt()
        if(value < X) {
            answer += value.toString() + " "
        }
    }
    println(answer)
}


