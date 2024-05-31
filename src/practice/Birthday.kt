package practice

object Birthday {
    @JvmStatic
    fun main(args: Array<String>) {
        val squares = IntArray(5)
        squares[0] = 1
        squares[1] = 2
        squares[2] = 1
        squares[3] = 3
        squares[4] = 2
        println(getWays(squares, 3, 2))
    }

    private fun getWays(squares: IntArray, d: Int, m: Int): Int {
        var ways = 0
        var sum = 0
        //Find if there is a way to break the chocolate at all
        if (m <= squares.size) for (i in 0 until m) sum += squares[i]
        if (sum == d) ways++

        ///////////////////////////////////////////////////////

        //Check other possible ways to break it by using a sliding window
        for (i in 0 until squares.size - m) {
            sum = sum - squares[i] + squares[i + m]
            if (sum == d) ways++
        }

        return ways
    }

    fun birthday(s: List<Int>, d: Int, m: Int): Int {
        var numberOfWaysCanDivide = 0

        for (i in s.indices) {
            var daysForTest = 0
            var j = i
            while (j < i + m && i + m <= s.size) {
                daysForTest += s[j]
                j++
            }

            if (daysForTest == d) {
                numberOfWaysCanDivide++
            }
        }

        return numberOfWaysCanDivide
    }
}

