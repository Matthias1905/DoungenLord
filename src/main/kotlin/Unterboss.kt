class Unterboss(name: String, hp: Int) : Kreatur(name, hp) {
    val aktionen: MutableList<Aktion> = mutableListOf()

    init {
        aktionen.add(Angriff("Mächtiger Schlag", 40))
        // Mehr angriffe noch und auf rendom setzen
    }

    override fun angriffsschaden(): Int {
        return 40
    }
}
