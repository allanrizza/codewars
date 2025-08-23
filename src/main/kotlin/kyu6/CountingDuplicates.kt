package kyu6

fun duplicateCount(text: String): Int {
    val map: MutableMap<Char, Boolean> = HashMap<Char, Boolean>()
    val textLower = text.lowercase()
    for(c in textLower) {
        if(!map.containsKey(c)) {
            map[c] = false
        } else {
            map[c] = true
        }
    }
    return map.count{(_, v) -> v}
}

fun main() {
    duplicateCount("abcdeaB")
}