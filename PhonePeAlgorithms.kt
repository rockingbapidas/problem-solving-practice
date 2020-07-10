class PhonePeAlgorithms {
    fun main() {
        val nameList = arrayListOf<String>("Shailash", "Rahul", "Moumita")
        nameSortedAlgorithm(nameList)
        cityNumberAlgorithm(4, 5, intArrayOf(16, 15, 14, 13, 12, 11, 10))
    }

    fun nameSortedAlgorithm(nameList: ArrayList<String>) {
        val uniqueName = mutableMapOf<Int, String>()
        nameList.forEach { uniqueName.set(it.toCharArray().distinct().count(), it) }
        println(uniqueName)
        val newNameList = uniqueName.toSortedMap().values.toList().reversed().sortedBy { it }
        println(newNameList)
    }

    fun cityNumberAlgorithm(k: Int, y: Int, arr: IntArray) {
        val list = MutableList<String>()
    }
}
