class Angriff(name: String, private val schaden: Int) : Aktion(name) {
    override fun ausfuehren(ziel: Kreatur) {
        println("$name auf ${ziel.name} angewandt.")
        ziel.schadenZufuegen(schaden)
    }
}