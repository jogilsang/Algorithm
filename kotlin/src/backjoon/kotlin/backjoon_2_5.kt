package backjoon.kotlin


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
    var C: Int = arr[2]

    var rank_1: Int = 0;
    var rank_2: Int = 0;
    var rank_3: Int = 0;

    if (A >= B) {
        rank_1 = A
        rank_2 = B
        if (A >= C) {
            rank_1 = A
            rank_3 = C
        } else {
            rank_1 = C
            rank_3 = A
        }
    } else {
        rank_1 = B
        rank_2 = A

        if (B >= C) {
            rank_1 = B
            rank_3 = C
        } else {
            rank_1 = C
            rank_3 = B
        }
    }

    if (rank_2 >= rank_3) {
        println("$rank_2")
    } else {
        println("$rank_3")
    }


}
