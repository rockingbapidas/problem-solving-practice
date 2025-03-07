package array

class SearchSuggestion {
    fun searchSuggestions(repository: Array<String>, customerQuery: String): Array<Array<String>> {
        // Write your code here
        if (customerQuery.length >= 2) {
            val data = repository.filter { it.startsWith(customerQuery) }.sorted().take(3)
            return arrayOf(data.toTypedArray())
        }
        return emptyArray()
    }
}