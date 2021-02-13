fun main() {
    val bob = Bob()
    val kristina = Kristina()

    val guest1 = object : People("Jenny", 24) {
        override fun smallTalk() {
            println("Hi. I am a stalker. I know everything about you.")
        }
    }
}