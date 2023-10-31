class Beschwoerung(name: String, private val beschwoerungsAktion: MutableList<Aktion>) : Aktion(name) {
    override fun ausfuehren(ziel: Kreatur) {
        if (ziel.istLebendig()) {
            println("$name auf ${ziel.name} angewandt. Ein Unterboss wurde beschworen!")
            beschwoerungsAktion
        } else {
            println("$name auf ${ziel.name} kann nicht ausgeführt werden, da der Endgegner bereits besiegt wurde.")
        }
    }
}
