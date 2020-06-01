import model.Item
import model.Menu

class VegetableCatalog(menu:Menu): Catalog(menu) {

    override var command:String = ""

    init {
        menu.items["1"] = Item("[L]echuga")
        menu.items["2"] = Item("[E]spinaca")
        menu.items["3"] = Item("[Z]anahoria")
        menu.items["4"] = Item("[B]rócoli")
        makeMenuOptions(1..4)
    }

    override fun executeCommand() {
        when(command) {
            "L" -> {
                requestQuestion = "¿Qué cantidad de lechuga deseas agregar?"
                ingredientName = "lechuga"
            }
            "E" -> {
                requestQuestion = "¿Qué cantidad de espinaca deseas agregar?"
                ingredientName = "espinaca"
            }
            "Z" -> {
                requestQuestion = "¿Qué cantidad de zanahoria deseas agregar?"
                ingredientName = "zanahoria"
            }
            "B" ->  {
                requestQuestion = "¿Qué cantidad de brócoli deseas agregar?"
                ingredientName = "brócoli"
            }
        }
    }
}