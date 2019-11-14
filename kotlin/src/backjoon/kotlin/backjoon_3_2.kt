package backjoon.kotlin


fun main(args: Array<String>) {

    var sc:String? = readLine()
    var input:String = sc.toString()
    var T:Int = input.toInt()
    var arr = Array<Int>(T, { 0 })

    for(i in 1..T) {
        sc = readLine()
        input = sc.toString()
        var split = input.split(" ")
        var A:Int = split[0].toInt()
        var B:Int = split[1].toInt()
        var sum = A + B
        arr[i-1] = sum
    }

    for(value in arr) {
        println(value)
    }
}


