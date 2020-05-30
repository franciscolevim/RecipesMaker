import model.Ingredient
import model.Recipe

abstract class IngredientPanel(menu:model.Menu): Panel(menu), IActions {

    var ingredient:Ingredient = Ingredient("", "", 0.0f)

    fun readIngredient(name:String, measure:String): Ingredient {
        print("Ingresa la cantidad de $name en $measure: ")
        val inputQty:Float = readLine()?.toFloat() ?: 1.0f
        return  Ingredient(name, measure, inputQty)
    }

    override fun run() {
        waitingForInstruction()
    }
}