package string

class RomanToInt {
    fun romanToInt(s: String): Int {
        if (s.length > 15) return 0

        val chars = s.toCharArray()

        var num = 0

        var i = chars.lastIndex
        while (i >= 0) {
            val current = chars[i]
            if (canBeComposite(current)) {
                if (i - 1 >= 0 && getCompositeNumOrNull(chars[i - 1], current) != null) {
                    num += getCompositeNumOrNull(chars[i - 1], current)!!
                    i -= 2
                } else {
                    num += oneSymbolNum(current)
                    i--
                }
            } else {
                num += oneSymbolNum(current)
                i--
            }
        }

        return num
    }

    private fun canBeComposite(char: Char) = when (char) {
        'M', 'D', 'C', 'L', 'X', 'V' -> true
        else -> false
    }

    private fun getCompositeNumOrNull(char1: Char, char2: Char) = when {
        char1 == 'C' && char2 == 'M' -> 900
        char1 == 'C' && char2 == 'D' -> 400
        char1 == 'X' && char2 == 'C' -> 90
        char1 == 'X' && char2 == 'L' -> 40
        char1 == 'I' && char2 == 'X' -> 9
        char1 == 'I' && char2 == 'V' -> 4
        else -> null
    }

    private fun oneSymbolNum(char: Char) = when (char) {
        'M' -> 1000
        'D' -> 500
        'C' -> 100
        'L' -> 50
        'X' -> 10
        'V' -> 5
        'I' -> 1
        else -> error("Not valid $char")
    }
}