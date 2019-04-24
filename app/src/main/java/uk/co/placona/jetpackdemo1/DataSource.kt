package uk.co.placona.jetpackdemo1

class DataSource {
    private val tag = MainActivity::class.java.simpleName

    fun getMagicNumber() = (1..42).shuffled().first()
}