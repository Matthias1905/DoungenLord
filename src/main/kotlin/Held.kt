open class Held(val name: String, var hp: Int) {
    // Eigenschaften der Helden
    val aktionen: MutableList<Aktion> = mutableListOf()

    constructor(name: String, hp: Int, aktionen: List<Aktion>) : this(name, hp) {
        this.aktionen.addAll(aktionen)
    }

    fun anzeigenStatus() {
        println("$name (HP: $hp)")
    }

    open fun aktionAusführen(aktion: Aktion, ziel: Held) {
        // Implementiere die Logik für die Aktion hier
    }

    fun istLebendig(): Boolean {
        return hp > 0
    }

    fun heilen(heilung: Int) {
        hp += heilung
    }

    fun schadenZufügen(schaden: Int) {
        hp -= schaden
        if (hp < 0) {
            hp = 0
        }
    }
}

class Aktion {

}
