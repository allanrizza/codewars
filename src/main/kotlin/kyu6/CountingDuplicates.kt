package kyu6

fun duplicateCount(text: String): Int {
    val map: MutableMap<Char, Boolean> = HashMap()
    for(c in text.lowercase()) {
        map[c] = map.containsKey(c)
    }
    return map.count{(_, v) -> v}
}

fun main() {
    duplicateCount("abcdeaB")
}