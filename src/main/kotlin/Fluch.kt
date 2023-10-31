class Fluch(name: String, private val schadenProRunde: Int, private val schwellenwert: Int) : Aktion(name) {
    private var gestartet = false

    override fun ausfuehren(ziel: Kreatur) {
        if (!gestartet) {
            println("$name auf ${ziel.name} angewandt. Der Fluch beginnt zu wirken.")
            gestartet = true
        }

        if (ziel.hp > schwellenwert) {
            println("$name verursacht $schadenProRunde Schaden auf ${ziel.name}.")
            ziel.schadenZufuegen(schadenProRunde)
        } else {
            println("$name hat keinen Einfluss mehr auf ${ziel.name}, da die HP zu niedrig sind.")
        }
    }
}