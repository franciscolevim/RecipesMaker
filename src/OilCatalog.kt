import model.Item
import model.Menu

class OilCatalog(menu:Menu): Catalog(menu) {
    override var command:String = ""

    init {
        menu.items["1"] = Item("[O]liva")
        menu.items["2"] = Item("[M]aiz]")
        menu.items["3"] = Item("[C]acahuate")
        makeMenuOptions(1..3)
    }

    override fun executeCommand() {
        when(command) {
            "O" -> {
                requestQuestion = "¿Qué cantidad aceite de oliva deseas agregar?"
                ingredientName = "aceite de oliva"
            }
            "M" -> {
                requestQuestion = "¿Qué cantidad de aceite de maiz deseas agregar?"
                ingredientName = "aceite de maiz"
            }
            "C" -> {
                requestQuestion = "¿Qué cantidad de aceite de cacahuate deseas agregar?"
                ingredientName = "aceite de cacahuate"
            }
        }
    }
}