import model.Item
import model.Menu

class CerealCatalog(menu: Menu): Catalog(menu) {

    override var command:String = ""

    init {
        menu.items["1"] = Item("[A]vena")
        menu.items["2"] = Item("[T]rigo]")
        menu.items["3"] = Item("arro[Z]")
        menu.items["4"] = Item("[M]aiz")
        makeMenuOptions(1..4)
    }

    override fun executeCommand() {
        when(command) {
            "A" -> {
                requestQuestion = "¿Qué cantidad de avena deseas agregar?"
                ingredientName = "avena"
            }
            "T" -> {
                requestQuestion = "¿Qué cantidad de trigo deseas agregar?"
                ingredientName = "trigo"
            }
            "Z" -> {
                requestQuestion = "¿Qué cantidad de arroz deseas agregar?"
                ingredientName = "arroz"
            }
            "M" ->  {
                requestQuestion = "¿Qué cantidad de maiz deseas agregar?"
                ingredientName = "maiz"
            }
        }
    }
}