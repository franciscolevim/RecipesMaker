import model.Item
import model.Menu

class FruitPanel(menu: Menu): IngredientPanel(menu) {

    init {
        menu.items["1"] = Item("[F]resa")
        menu.items["2"] = Item("[P]látano")
        menu.items["3"] = Item("[U]vas")
        menu.items["4"] = Item("[M]anzana")
        menu.items["5"] = Item("[N]aranja")
        menu.items["6"] = Item("[PE]ra")
        menu.items["7"] = Item("[CE]rezas")
    }

    override fun waitingForInstruction() {
        println(menu)
        print("Elige un ingrediente/[B] para regresar al menú anterior: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "F" -> ingredient = readIngredient("fresa", "gramos")
            "P" -> ingredient = readIngredient("plátano", "piezas")
            "U" -> ingredient = readIngredient("uvas", "tazas")
            "M" -> ingredient = readIngredient("manzana", "piezas")
            "N" -> ingredient = readIngredient("naranja", "piezas")
            "PE" -> ingredient = readIngredient("pera", "piezas")
            "CE" -> ingredient = readIngredient("cerezas", "gramo")
        }
    }
}