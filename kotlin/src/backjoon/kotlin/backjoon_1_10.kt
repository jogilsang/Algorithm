package backjoon.kotlin


fun main(args: Array<String>) {

//    var sc: Scanner = Scanner(System.`in`)
//    var book_kotlin_200.input = sc.nextLine()

    // A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

    var sc:String? = readLine()
    var input:String = sc.toString()

    var splitInput = input.split(" ")
    var arr = Array<Int>(100,{0})

    var count:Int = 0
    for(value in splitInput) {
        arr[count++] = value.toInt()
    }

    var sum:Int = 0
    var sub:Int = 0
    var multi:Int = 0
    var div:Int = 0
    var remain:Int = 0

    sum = arr[0] + arr[1]
    sub = arr[0] - arr[1]
    multi = arr[0] * arr[1]
    div = arr[0] / arr[1]
    remain = arr[0] % arr[1]

    println(sum)
    println(sub)
    println(multi)
    println(div)
    println(remain)

}