package interview

class AmazonInterview {
    fun countDecreasingRatings(ratings: Array<Int>): Long {
        var res = ratings.count()
        ratings.sort()
        ratings.forEachIndexed { index, _ ->
            if (ratings[index] + 1 != ratings[index + 1]) {
                res++
            }
        }
        return res.toLong()
    }

    fun findMinSwaps(arr: Array<Int>): Int {
        val n = arr.size
        val noOfZeroes = IntArray(n)
        var count = 0
        noOfZeroes[n - 1] = 1 - arr[n - 1]
        var i: Int = n - 2
        while (i >= 0) {
            noOfZeroes[i] = noOfZeroes[i + 1]
            if (arr[i] == 0) noOfZeroes[i]++
            i--
        }
        i = 0
        while (i < n) {
            if (arr[i] == 1) count += noOfZeroes[i]
            i++
        }
        return count
    }
}