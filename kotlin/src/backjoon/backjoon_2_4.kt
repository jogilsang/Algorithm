package backjoon


fun main(args: Array<String>) {

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

    // A값 변화 X
    if(B >= 45) {
        B -= 45
    }
    // A값 변화 O
    else {
        // 0 이 아니면 당일

        B = 45 - B
        B = 60 - B

        if(A != 0) {
            A -= 1
        }
        // 0 이면 전날로 변경
        else {
            A = 23
        }
    }
    println("$A $B")

}
