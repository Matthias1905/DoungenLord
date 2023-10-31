open class Kreatur(val name: String, var hp: Int) {
    open fun schadenZufuegen(schaden: Int) {
        hp -= schaden
    }

    open fun heilen(heilung: Int) {
        hp += heilung
    }

    open fun istLebendig(): Boolean {
        return hp > 0
    }

    open fun angriffsschaden(): Int {
        return 0
    }
}