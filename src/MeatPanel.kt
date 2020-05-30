import model.Item
import model.Menu

class MeatPanel(menu: Menu): IngredientPanel(menu) {

    init {
        menu.items["1"] = Item("[R]es")
        menu.items["2"] = Item("[P]uerco")
        menu.items["3"] = Item("[PO]llo")
        menu.items["4"] = Item("[PE]scado")
    }

    override fun waitingForInstruction() {
        println(menu)
        print("Elige un ingrediente/[B] para regresar al menú anterior: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "R" -> ingredient = readIngredient("res", "gramos")
            "P" -> ingredient = readIngredient("puerco", "gramos")
            "PO" -> ingredient = readIngredient("pollo", "gramos")
            "PE" -> ingredient = readIngredient("pescado", "gramos")
        }
    }
}