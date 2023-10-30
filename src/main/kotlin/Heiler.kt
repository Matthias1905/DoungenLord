class Heiler(name: String, hp: Int) : Held(name, hp) {
    init {
        // Füge spezifische Aktionen für den Heiler hinzu
        aktionen.add(Heilung("Heilzauber", 30))
        aktionen.add(Heilung("Wiederbelebung", 60))
        aktionen.add(Schutzzauber("Schutzschild", 2))
    }

    // Spezifische Methode für den Heiler, um den Heilzauber zu wirken
    fun heilzauberWirken(ziel: Held) {
        println("$name wirkt einen Heilzauber auf ${ziel.name}.")
        // Implementiere die Logik für den Heilzauber hier
        val heilung = 30 // Anpassen der Heilung
        ziel.heilen(heilung)
    }


    fun wiederbelebungAnwenden(ziel: Held) {
        println("$name wendet eine Wiederbelebung auf ${ziel.name} an.")
        // Implementiere die Logik für die Wiederbelebung hier
        val heilung = 60 // Anpassen der Heilung
        ziel.heilen(heilung)
    }


    fun schutzschildAktivieren() {
        println("$name aktiviert einen Schutzschild.")

    }
}
