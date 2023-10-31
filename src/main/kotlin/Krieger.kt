
class Krieger(name: String, hp: Int) : Held(name, hp) {
    init {
        aktionen.add(Angriff("Schwerhieb", 20))
        // Mehr Aktionen test wahr gut
    }
}