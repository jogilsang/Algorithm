package book_kotlin_200


// 연산자 오버로딩
class operate_class(var x:Int, var y:Int) {

    operator fun plus(other: operate_class): operate_class {

        return operate_class(x + other.x, y + other.y)

    }

    operator fun minus(other: operate_class): operate_class {

        return operate_class(x - other.x, y - other.y)

    }

    operator  fun times(other: operate_class): operate_class {
        return operate_class(x * other.x, y * other.y)
    }







}