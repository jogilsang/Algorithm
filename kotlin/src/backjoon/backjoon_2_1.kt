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

    if(A > B) {
        println(">")
    }
    else if( A == B) {
        println("==")
    }
    else {
        println("<")
    }

}
