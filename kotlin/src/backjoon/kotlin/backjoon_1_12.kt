package backjoon.kotlin


fun main(args: Array<String>) {

//    var sc: Scanner = Scanner(System.`in`)
//    var book_kotlin_200.input = sc.nextLine()

    // 첫번쨰 숫자 입력받음
    var sc_1: String? = readLine()
    var conversion_1: String = sc_1.toString()
    var A: Int = conversion_1.toInt()

    // 두번쨰 숫자 입력받음
    var sc_2: String? = readLine()
    var conversion_2: String = sc_2.toString()
    var B: Int = conversion_2.toInt()

    // 두 숫자 모두 세자리

    var line_1 = A * ((B % 100) % 10)
    var line_2 = A * ((B % 100) / 10 )
    var line_3 = A * (B / 100)
    var line_4 = A * B

    println(line_1)
    println(line_2)
    println(line_3)
    println(line_4)

}