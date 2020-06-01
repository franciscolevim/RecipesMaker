import model.Ingredient
import model.Item
import model.Menu

class MeatCatalog(menu: Menu): Catalog(menu) {

    override var command:String = ""

    init {
        menu.items["1"] = Item("[R]es")
        menu.items["2"] = Item("[P]ollo")
        menu.items["3"] = Item("[C]erdo")
        menu.items["4"] = Item("[PE]scado")
        makeMenuOptions(1..4)
    }

    override fun executeCommand() {
        when(command) {
            "R" -> {
                requestQuestion = "¿Qué cantidad de carne de res deseas agregar?"
                ingredientName = "carne de res"
            }
            "P" -> {
                requestQuestion = "¿Qué cantidad de carne de pollo deseas agregar?"
                ingredientName = "carne de pollo"
            }
            "C" -> {
                requestQuestion = "¿Qué cantidad de carne de cerdo deseas agregar?"
                ingredientName = "carne de cerdo"
            }
            "PE" ->  {
                requestQuestion = "¿Qué cantidad de pescado deseas agregar?"
                ingredientName = "pescado"
            }
        }
    }
}