package uk.co.placona.jetpackdemo1

class DataSource {
    private val tag = MainActivity::class.java.simpleName
    private lateinit var myRandomNumber:Number

    private fun createMagicNumber(){
        myRandomNumber = (1..42).shuffled().first()
    }

    fun getMagicNumber(): Number {
        if(!::myRandomNumber.isInitialized){
            createMagicNumber()
        }
        return myRandomNumber
    }
}