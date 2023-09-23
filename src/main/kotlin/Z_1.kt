fun main() {
    println("Введите количество строк: ")
    val x = readln().toInt()
    println("Введите количество столбцов:  ")
    val y = readln().toInt()
    val arr = Array(x) {
        IntArray(y)
    }
    for (row in arr){
        println(row.contentToString())
    }
}