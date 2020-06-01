import model.Item
import model.Menu

class FruitCatalog(menu:Menu): Catalog(menu) {

    override var command:String = ""

    init {
        menu.items["1"] = Item("[F]resa")
        menu.items["2"] = Item("[P]látano]")
        menu.items["3"] = Item("[U]vas")
        menu.items["4"] = Item("[M]anzana")
        menu.items["5"] = Item("[PE]ra")
        menu.items["6"] = Item("[PI]ña")
        makeMenuOptions(1..6)
    }

    override fun executeCommand() {
        when(command) {
            "F" -> {
                requestQuestion = "¿Qué cantidad de fresa deseas agregar?"
                ingredientName = "fresa"
            }
            "P" -> {
                requestQuestion = "¿Qué cantidad de plátano deseas agregar?"
                ingredientName = "plátano"
            }
            "U" -> {
                requestQuestion = "¿Qué cantidad de uva deseas agregar?"
                ingredientName = "uva"
            }
            "M" ->  {
                requestQuestion = "¿Qué cantidad de manzana deseas agregar?"
                ingredientName = "manzana"
            }
            "PE" ->  {
                requestQuestion = "¿Qué cantidad de pera deseas agregar?"
                ingredientName = "pera"
            }
            "PI" ->  {
                requestQuestion = "¿Qué cantidad de piña deseas agregar?"
                ingredientName = "piña"
            }
        }
    }
}