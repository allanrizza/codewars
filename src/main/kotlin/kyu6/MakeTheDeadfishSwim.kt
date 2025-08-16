package kyu6

fun parse(data: String): List<Int> {
    var num = 0;
    var res: MutableList<Int> = mutableListOf();
    for (i in data) {
        when(i) {
            'i' -> num+=1
            'd' -> num-=1
            's' -> num*=num
            'o' -> res.add(num)
        }
    }

    return res
}

fun main() {
    println("iiisdosodddddiso")
}