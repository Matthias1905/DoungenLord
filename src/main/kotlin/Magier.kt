class Magier(name: String, hp: Int) : Held(name, hp) {
    init {
        // Füge spezifische Aktionen für den Magier hinzu
        aktionen.add(Angriff("Feuerball", 20))
        aktionen.add(Heilung("Heilzauber", 30))
        aktionen.add(Schutzzauber("Magischer Schild", 1))
    }


    fun feuerballZaubern(ziel: Held) {
        println("$name zaubert einen Feuerball auf ${ziel.name}.")
        // Implementiere die Logik für den Feuerball hier
        val schaden = 20 // Anpassen des Schadens
        ziel.schadenZufügen(schaden)
    }

    fun heilzauberAnwenden(ziel: Held) {
        println("$name wendet einen Heilzauber auf ${ziel.name} an.")
        // Implementiere die Logik für den Heilzauber hier
        val heilung = 30 // Anpassen der Heilung
        ziel.heilen(heilung)
    }

    fun magischerSchildAktivieren() {
        println("$name aktiviert einen magischen Schild.")

    }
}

