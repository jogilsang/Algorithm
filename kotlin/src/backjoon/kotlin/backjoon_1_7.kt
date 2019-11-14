package backjoon.kotlin

fun main(args: Array<String>) {

//    var sc: Scanner = Scanner(System.`in`)
//    var book_kotlin_200.input = sc.nextLine()

    var sc:String? = readLine()
    var input:String = sc.toString()

    var splitInput = input.split(" ")
    var arr = Array<Int>(100,{0})

    var count:Int = 0
    for(value in splitInput) {
        arr[count++] = value.toInt()
    }

    var sub:Int = 0

    sub = arr[0] - arr[1]

    println(sub)

}
