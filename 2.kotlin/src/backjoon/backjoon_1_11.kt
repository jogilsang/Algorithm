package backjoon


fun main(args: Array<String>) {

//    var sc: Scanner = Scanner(System.`in`)
//    var book_kotlin_200.input = sc.nextLine()

    // 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

    var sc: String? = readLine()
    var input: String = sc.toString()

    var splitInput = input.split(" ")
    var arr = Array<Int>(100, { 0 })

    var count: Int = 0
    for (value in splitInput) {
        arr[count++] = value.toInt()
    }

    var A: Int = arr[0]
    var B: Int = arr[1]
    var C: Int = arr[2]

    var line_1 = (A + B) % C
    var line_2 = (A % C + B % C) % C
    var line_3 = (A * B) % C
    var line_4 = (A % C * B % C) % C

    println(line_1)
    println(line_2)
    println(line_3)
    println(line_4)

}