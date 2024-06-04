package Spices

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }

}

class Spice(val name: String, val spiciness: String = "mild") {
    // Getter para la variable heat
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    // Bloque init que imprime los valores del objeto
    init {
        println("Spice created: $name, spiciness level: $spiciness, heat: $heat")
    }
}

// Función auxiliar makeSalt
fun makeSalt(): Spice {
    return Spice("Salt")
}


// Definición de la clase de datos SpiceContainer
data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}