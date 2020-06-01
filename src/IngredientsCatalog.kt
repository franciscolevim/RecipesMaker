import model.Ingredient
import model.Item
import model.Menu

class IngredientsCatalog(menu:Menu): Catalog(menu) {

    val catalogs = HashMap<String, Catalog>()
    override var command:String = ""

    private var catalog:Catalog? = null

    init {
        menu.items["1"] = Item("[A]gua")
        menu.items["2"] = Item("[L]eche]")
        menu.items["3"] = Item("[C]arne")
        menu.items["4"] = Item("[V]erdura")
        menu.items["5"] = Item("[F]ruta")
        menu.items["6"] = Item("[CE]real")
        menu.items["7"] = Item("[H]uevo")
        menu.items["8"] = Item("[AC]eite")

        catalogs["C"] = MeatCatalog(Menu("Carne"))
        catalogs["V"] = VegetableCatalog(Menu("Vegetales"))
        catalogs["F"] = FruitCatalog(Menu("Frutas"))
        catalogs["CE"] = CerealCatalog(Menu("Cereales"))
        catalogs["AC"] = OilCatalog(Menu("Aceites"))

        makeMenuOptions(1..9)
    }

    override fun executeCommand() {
        when(command) {
            "C", "V", "F", "CE", "AC" -> {
                catalog = catalogs[command]
            }
            else -> {
                when(command) {
                    "A" -> {
                        requestQuestion = "¿Qué cantidad de agua deseas agregar?"
                        ingredientName = "agua"
                    }
                    "L" -> {
                        requestQuestion = "¿Qué cantidad de leche deseas agregar?"
                        ingredientName = "leche"
                    }
                    "H" -> {
                        requestQuestion = "¿Cuántos huevos deseas agregar?"
                        ingredientName = "huevo"
                    }
                }
            }
        }
    }

    override fun requestIngredient(): Ingredient {
        when(command) {
            "C", "V", "F", "CE", "AC" -> {
                catalog?.display()
                return catalog?.requestIngredient() ?: Ingredient("", "")
            }
            else -> {
                var quantity:String = ""
                do {
                    print("$requestQuestion ")
                    quantity = readLine() ?: ""
                } while (quantity.trim() == "")
                return Ingredient(ingredientName, quantity)
            }
        }
    }
}