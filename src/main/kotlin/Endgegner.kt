class Endgegner(name: String, hp: Int) : Gegner(name, hp) {
    val aktionen: MutableList<Aktion> = mutableListOf()

    init {
        aktionen.add(Angriff("Feueratem", 30))
        aktionen.add(Fluch("Schwarzer Fluch", 15, 30))
    }

    fun beschwoereUnterboss() {
        val unterboss = Unterboss("Troll", 50)
        println("$name auf ${unterboss.name} angewandt. Ein Unterboss wurde beschworen!")
        unterboss.aktionen.forEach { aktion -> aktion.ausfuehren(this) }
    }
}
