package aoc.days

fun listChecksum(IDs: List<String>) : Int {
    var two = 0
    var three = 0
    IDs.forEach {
        it.groupingBy { char -> char}
            .eachCount()
            .filter { it.value == 2 || it.value == 3 }
            .values
            .distinct()
            .forEach {
                if (it == 2)
                    two++
                else
                    three++
            }
    }
    return two * three
}

fun commonLetters(IDs: List<String>) : String {
    IDs.forEach {id ->
        IDs.minus(id)
            .forEach {
                val commons = getCommonLetters(it, id)
                if (it.length - commons.length == 1)
                    return commons
            }
    }
    return ""
}

fun getCommonLetters(it: String, id: String): String {
    var res = ""
    it.forEachIndexed { index, c ->
        if (c.equals(id[index]))
            res += c
    }
    return res
}
