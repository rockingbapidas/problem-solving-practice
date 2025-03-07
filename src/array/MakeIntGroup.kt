package array

class MakeIntGroup {
    fun makeGroups(a: Array<Int>) {
        val n = a.size
        val v = IntArray(n + 1)

        // Store the number of
        // occurrence of elements
        for (i in 0 until n) {
            v[a[i]]++
        }
        var no_of_groups = 0

        // Make all groups of similar
        // elements and store the
        // left numbers
        for (i in 1..n) {
            no_of_groups += v[i] / i
            v[i] = v[i] % i
        }
        var i = 1
        var total = 0
        i = 1
        while (i <= n) {

            // Condition for finding first
            // leftover element
            if (v[i] != 0) {
                total = v[i]
                break
            }
            i++
        }
        i++
        while (i <= n) {
            // Condition for current
            // leftover element
            if (v[i] != 0) {
                total += v[i]

                // Condition if group size
                // is equal to or more than
                // current element
                if (total >= i) {
                    val rem = total - i
                    no_of_groups++
                    total = rem
                }
            }
            i++
        }

        // Printing maximum
        // number of groups
        print("""$no_of_groups""".trimIndent())
    }
}