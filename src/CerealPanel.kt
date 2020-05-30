import model.Ingredient
import model.Item
import model.Menu

class CerealPanel(menu:Menu): IngredientPanel(menu) {

    init {
        menu.items["1"] = Item("[A]venta")
        menu.items["2"] = Item("[T]rigo")
        menu.items["3"] = Item("arro[Z]")
        menu.items["4"] = Item("[M]aiz")
    }

    override fun waitingForInstruction() {
        println(menu)
        print("Elige un ingrediente/[B] para regresar al menú anterior: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "A" -> ingredient = readIngredient("avena", "gramos")
            "T" -> ingredient = readIngredient("trigo", "gramos")
            "Z" -> ingredient = readIngredient("arroz", "gramos")
            "M" -> ingredient = readIngredient("maiz", "gramos")
        }
    }
}