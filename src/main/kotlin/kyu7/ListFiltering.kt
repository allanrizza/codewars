package kyu7

fun filterList(l: List<Any>): List<Int> {
    val listint: MutableList<Int> = mutableListOf()

    listint.addAll(l.stream().filter { it is Int }.toList() as Collection<Int>)

    return listint
}

// Solução BEM melhor:
//fun filterList(l: List<Any>): List<Int> = l.filterIsInstance<Int>()

fun main() {
    println(filterList(listOf<Any>(1, 2, "a", "b", "aasf", "1", "123", 123)))
}