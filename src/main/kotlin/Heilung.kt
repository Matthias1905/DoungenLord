class Heilung(name: String, private val heilung: Int) : Aktion(name) {
    override fun ausfuehren(ziel: Kreatur) {
        println("$name auf ${ziel.name} angewandt.")
        ziel.heilen(heilung)
        println("${ziel.name} wird um $heilung HP geheilt.")
    }
}
