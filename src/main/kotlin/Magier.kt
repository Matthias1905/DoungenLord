class Magier(name: String, hp: Int) : Held(name, hp) {
    init {
        aktionen.add(Angriff("Feuerball", 20))
        aktionen.add(Heilung("Heilzauber", 30))
        aktionen.add(Heilung("Schutzzauber", 30))
        // Die Zauber noch mal ändern
    }
}