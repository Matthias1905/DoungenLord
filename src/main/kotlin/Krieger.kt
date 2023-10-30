class Krieger(name: String, hp: Int) : Held(name, hp) {
    init {
        // Füge spezifische Aktionen für den Krieger hinzu
        aktionen.add(Angriff("Schwertangriff", 15))
        aktionen.add(Heilung("Trank", 25))
        aktionen.add(Schutzzauber("Verteidigungsaura", 2))
    }

    // Spezifische Methode für den Krieger, um den Schwertangriff auszuführen
    fun schwertangriff(ziel: Held) {
        println("$name führt einen Schwertangriff auf ${ziel.name} aus.")
        // Implementiere die Logik für den Schwertangriff hier
        val schaden = 15 // Anpassen des Schadens
        ziel.schadenZufügen(schaden)
    }


    fun trankVerwenden(ziel: Held) {
        println("$name verwendet einen Trank, um ${ziel.name} zu heilen.")
        // Implementiere die Logik für die Verwendung des Tranks hier
        val heilung = 25 // Anpassen der Heilung
        ziel.heilen(heilung)
    }


    fun verteidigungsauraAktivieren() {
        println("$name aktiviert die Verteidigungsaura.")

    }
}
