package Buildings

fun main(args: Array<String>) {
    Building(Wood()).build()
    isSmallBuilding(Building(Brick()))
}

//CHAPTER 5: GENERIC CLASSES
open class BaseBuildingMaterial {
    open val numberNeeded = 1
}
class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
            println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

//CHAPTER 5: GENERIC FUNCTIONS
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
