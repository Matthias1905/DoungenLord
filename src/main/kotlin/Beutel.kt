class Beutel {
    val gegenstaende: MutableList<Gegenstand> = mutableListOf()

    fun gegenstandHinzufuegen(gegenstand: Gegenstand) {
        gegenstaende.add(gegenstand)
    }

    fun gegenstandVerwenden(held: Held, gegenstand: Gegenstand) {
        if (gegenstaende.contains(gegenstand)) {
            gegenstand.anwenden(held)
            gegenstaende.remove(gegenstand)
        } else {
            println("${held.name} versucht, einen nicht vorhandenen Gegenstand zu verwenden.")
        }
    }
}