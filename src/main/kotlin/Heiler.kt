class Heiler(name: String, hp: Int) : Held(name, hp) {
    init {
        aktionen.add(Angriff("Lichtsäule", 20)) // Namen geändert
        aktionen.add(Heilung("Heilzauber", 30))
        // Mehr Aktionen noch hinzu fügen
    }
}