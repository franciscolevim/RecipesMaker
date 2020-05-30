import model.Item
import model.Menu

class VegetablePanel(menu: Menu): IngredientPanel(menu) {
    init {
        menu.items["1"] = Item("[E]spinaca")
        menu.items["2"] = Item("[Z]anahoria")
        menu.items["3"] = Item("[BR]ócoli")
        menu.items["4"] = Item("[L]echga")
    }

    override fun waitingForInstruction() {
        println(menu)
        print("Elige un ingrediente/[B] para regresar al menú anterior: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "R" -> ingredient = readIngredient("espinaca", "gramos")
            "P" -> ingredient = readIngredient("zanahoria", "gramos")
            "PO" -> ingredient = readIngredient("brócoli", "gramos")
            "PE" -> ingredient = readIngredient("lechuga", "gramos")
        }
    }
}