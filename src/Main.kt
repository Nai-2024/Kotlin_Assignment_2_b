//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
    * Check if two words are anagrams of each other
    * @param word 1 the first word
    * @param word2 the second word
    * @return true if the words are anagrams, else false
 */

fun areAnagrams(word1: String, word2: String): Boolean {
    if (word1.length != word2.length)
        return false // Anagrams must be of the same length

    // Convert both strings to lowercase to ensure the comparison is case-insensitive
    val word1ToLowerCase = word1.lowercase()
    val word2ToLowerCase = word2.lowercase()

    // Sort the characters of both strings
    val sortedWord1 = word1ToLowerCase.toCharArray().sorted()
    val sortedWord2 = word2ToLowerCase.toCharArray().sorted()

    // Compare the sorted character arrays
    return sortedWord1 == sortedWord2
}

fun main() {
    val word1Anagrams = areAnagrams("Listen", "Silent")
    val word2Anagrams = areAnagrams("Night", "Thing")
    val word3Anagrams = areAnagrams("Test", "Taste")
    println("Are 'Listen' and 'Silent' anagrams? : $word1Anagrams")
    println("Are 'Night' and 'Thing' anagrams? : $word2Anagrams")
    println("Are 'Test' and 'Taste' anagrams? $word3Anagrams")
}


// Alternate approach
/*
fun areAnagrams(word1: String, word2: String): Boolean {
    return word1.toLowerCase().toCharArray().sorted() == word2.toLowerCase().toCharArray().sorted()
}

fun main() {
    println(areAnagrams("dusty", "study"))  // Output: true
    println(areAnagrams("Love", "Hate"))    // Output: false
    println(areAnagrams("cinema", "iceman")) // Output: true
}
*/