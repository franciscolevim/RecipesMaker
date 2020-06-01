import model.*

class RecipeMaker(menu:Menu): Panel(menu), ICommands {

    val catalog:IngredientsCatalog = IngredientsCatalog(Menu("Ingredientes"))
    var recipe:Recipe? = null
    override var command:String = ""

    init {
        menu.items["1"] = Item("[1] Agregar Ingrediente")
        menu.items["2"] = Item("[2] Agregar Instrucciones")
        menu.items["4"] = Item("[T]erminar")
        menu.options.addAll(arrayListOf("1", "2", "T"))
    }

    private fun setRecipeTitle() {
        var title = ""
        do {
            print("Dale un nombre a tu receta: ")
            title = readLine()?.toUpperCase() ?: ""
            recipe = Recipe(title)
        } while (title.trim() == "")
    }

    override fun display() {
        do {
            print("¿Deseas crear una nueva receta?[Si/No] ")
            command = readLine()?.toUpperCase() ?: ""
        } while (command != "S" && command != "N")

        if (command == "S") {
            setRecipeTitle()
            do {
                waitingForCommand()
                executeCommand()
            } while (command != "T")
        }
    }

    override fun waitingForCommand() {
        do {
            println(menu)
            print("¿Qué deseas hacer? ")
            command = readLine()?.toUpperCase() ?: ""
        } while (!menu.options.contains(command))
    }

    override fun executeCommand() {
        when(command) {
            "1" -> {
                catalog.display()
                recipe?.ingredients?.add(catalog.requestIngredient())
            }
            "2" -> {
                println("Captura las instrucciones de la receta:\n")
                recipe?.instructions = readLine() ?: ""
            }
        }
    }
}