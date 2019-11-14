package backjoon.kotlin


fun main(args: Array<String>) {

    //    var sc: Scanner = Scanner(System.`in`)
//    var book_kotlin_200.input = sc.nextLine()
//
//    while (sc.hasNextLine()) {
//
//        sc.nextLine()
//
//    }
//

    while (true) {

        var sc: String? = readLine()
        if (sc == null) {
            break;
        }
        var input: String = sc.toString()

        var splitInput = input.split(" ")
        var arr = Array<Int>(100, { 0 })

        var count: Int = 0
        for (value in splitInput) {
            arr[count++] = value.toInt()
        }

        var A: Int = arr[0]
        var B: Int = arr[1]

        if ((A < 0 || B < 0) || (A > 10 || B > 10)) {
            break;
        } else {
            println(A + B)

        }


    }

}

