abstract class People(
    val name: String,
    val age: Int
) {

    fun introduce() {
        println("My name is $name and I am $age.")
    }

    abstract fun smallTalk()

    init {
        println("$name has arrived!")
    }
}