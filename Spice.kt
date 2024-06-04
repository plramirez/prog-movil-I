package Spices

fun main(args: Array<String>){
    //CAPITULO 4: CLASES - DEFINING CLASSES PRACTICE
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")


    //CAPITULO 4: CLASES - CONSTRUCTORS PRACTICE
    // Crear una lista de objetos Spice
    val spices = listOf(
        Spice("Curry", "mild"),
        Spice("Pepper", "medium"),
        Spice("Chili", "spicy"),
        Spice("Jalapeno", "very spicy"),
        Spice("Habanero", "extremely spicy"),
        makeSalt()
    )

    // Filtrar las especias que son "spicy" o menos picantes
    val mildOrSpicySpices = spices.filter { it.heat <= 5 }

    // Imprimir la lista de especias filtradas
    println("Spices that are spicy or less than spicy:")
    mildOrSpicySpices.forEach { println(it.name) }



    //CAPITULO 4: CLASES - DATA CLASSES PRACTICE
    // Crear instancias de Spice
    val curry = Spice("Curry", "mild")
    val pepper = Spice("Pepper", "medium")
    val chili = Spice("Chili", "spicy")

    // Crear instancias de SpiceContainer
    val curryContainer = SpiceContainer(curry)
    val pepperContainer = SpiceContainer(pepper)
    val chiliContainer = SpiceContainer(chili)

    // Imprimir las etiquetas de los contenedores
    println("Spice container label: ${curryContainer.label}")
    println("Spice container label: ${pepperContainer.label}")
    println("Spice container label: ${chiliContainer.label}")
}