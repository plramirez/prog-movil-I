
//CAPITULO 4: CLASES - INHERITANCE PRACTICE
open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("Current page of $title: $currentPage")
    }
}

// Definición de la subclase eBook
class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
        println("Current word count of $title: $wordCount")
    }
}