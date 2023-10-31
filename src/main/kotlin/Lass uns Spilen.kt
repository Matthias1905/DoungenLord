fun main() {
    val held1 = Krieger("Conan", 100)
    val held2 = Magier("Gandalf", 80)
    val held3 = Heiler("Sani", 90)
    val endgegner = Endgegner("Dunkler Magier", 200)
    val beutel = Beutel()

    println("Willkommen zum Kampfspiel!")

    while (endgegner.istLebendig() && (held1.istLebendig() || held2.istLebendig() || held3.istLebendig())) {
        val aktion1 = held1.waehleAktion()
        aktion1.ausfuehren(endgegner)

        val aktion2 = held2.waehleAktion()
        aktion2.ausfuehren(endgegner)

        val aktion3 = held3.waehleAktion()
        aktion3.ausfuehren(endgegner)

        endgegner.aktionen.forEach { aktion -> aktion.ausfuehren(held1) }
        endgegner.aktionen.forEach { aktion -> aktion.ausfuehren(held2) }
        endgegner.aktionen.forEach { aktion -> aktion.ausfuehren(held3) }

        val schadenAmHeld1 = endgegner.angriffsschaden()
        val schadenAmHeld2 = endgegner.angriffsschaden()
        val schadenAmHeld3 = endgegner.angriffsschaden()

        held1.schadenZufuegen(schadenAmHeld1)
        held2.schadenZufuegen(schadenAmHeld2)
        held3.schadenZufuegen(schadenAmHeld3)

        val unterboss: Unterboss? = null // Hier sollten Sie den Unterboss initialisieren, wenn er beschworen wird

        if (unterboss != null) {
            val schadenAmUnterboss = unterboss.angriffsschaden()
            held1.schadenZufuegen(schadenAmUnterboss)
            held2.schadenZufuegen(schadenAmUnterboss)
            held3.schadenZufuegen(schadenAmUnterboss)
        }

        println("Spielstand:")
        println("${held1.name}: HP ${held1.hp}")
        println("${held2.name}: HP ${held2.hp}")
        println("${held3.name}: HP ${held3.hp}")
        println("${endgegner.name}: HP ${endgegner.hp}")

        if (unterboss != null) {
            println("${unterboss.name}: HP ${unterboss.hp}")
        }
    }

    if (endgegner.hp <= 0) {
        println("Endgegner besiegt!")
    } else {
        println("Helden besiegt!")
    }
}
// Noch schauen das die Main kürzer wird