package backjoon


fun main(args: Array<String>) {

    var sc: String? = readLine()
    var input: String = sc.toString()

    var value:Int = input.toInt();

    if((value / 4 == 1 && value / 100 != 1) || value / 400 == 1) {
        println("1")
    }
    else {
        println("0")
    }

}
