package backjoon.kotlin


fun main(args: Array<String>) {

    var sc:String? = readLine()
    var input:String = sc.toString()
    var value:Int = input.toInt()

    if(!(value >= 1 && value <= 9)) {
        println("범위초과 에러")
        return
    }

    // value * i
    for(i in 1 until 10) {
        var output = value * i
        println("$value * $i = $output")
    }

    //    결과예시
    //    2 * 1 = 2
    //    2 * 2 = 4
    //    2 * 3 = 6
    //    2 * 4 = 8
    //    2 * 5 = 10
    //    2 * 6 = 12
    //    2 * 7 = 14
    //    2 * 8 = 16
    //    2 * 9 = 18

}


