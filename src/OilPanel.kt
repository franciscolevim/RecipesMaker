import model.Item
import model.Menu

class OilPanel(menu: Menu): IngredientPanel(menu) {
    init {
        menu.items["1"] = Item("[O]liva")
        menu.items["2"] = Item("[M]aiz")
        menu.items["3"] = Item("[C]oco")
    }

    override fun waitingForInstruction() {
        println(menu)
        print("Elige un ingrediente/[B] para regresar al menú anterior: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "O" -> ingredient = readIngredient("oliva", "cucharadas")
            "M" -> ingredient = readIngredient("maiz", "cucharadas")
            "C" -> ingredient = readIngredient("coco", "cucharadas")
        }
    }
}