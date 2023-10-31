open class Held(name: String, hp: Int) : Kreatur(name, hp) {
    val aktionen: MutableList<Aktion> = mutableListOf()

    fun waehleAktion(): Aktion {
        println("$name, wähle eine Aktion:")
        aktionen.forEachIndexed { index, aktion ->
            println("$index. ${aktion.name}")
        }
        val ausgewaehlteIndex = readLine()?.toIntOrNull()
        return aktionen.getOrNull(ausgewaehlteIndex ?: 0) ?: aktionen[0]
    }
}