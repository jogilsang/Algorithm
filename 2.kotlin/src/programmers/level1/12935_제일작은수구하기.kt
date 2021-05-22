package programmers.level1


fun main(args: Array<String>) {

    var test:IntArray = IntArray(4) {Math.abs(it - 4) }
    var result:IntArray = solution_12935(test)
    result.forEach{println(it)}
}
    fun solution_12935(arr: IntArray): IntArray {
        // given
        var min:Int = arr[0]

        // when
        arr.forEach {
            if(it < min) min = it
        }
        // then
        when(arr.size) {
            1 -> return IntArray(1) {-1}
            else -> {
                var mutableList = arr.toMutableList()
                mutableList.remove(min)
                return mutableList.toIntArray()
            }
        }
    }
