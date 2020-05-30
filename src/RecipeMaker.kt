import model.*

class RecipeMaker(menu:Menu): RecipePanel(menu), IActions {

    private val recipe = Recipe("Nueva Receta")
    private val menuPanels:HashMap<String, IngredientPanel> = HashMap()

    init {
        menu.items["1"] = Item("[A]gua")
        menu.items["2"] = Item("[L]eche")
        menu.items["3"] = Item("[C]arne")
        menu.items["4"] = Item("[V]erdura")
        menu.items["5"] = Item("[F]rutas")
        menu.items["6"] = Item("[CE]real")
        menu.items["7"] = Item("[H]uevos")
        menu.items["8"] = Item("[AC]eites")
        menu.items["9"] = Item("[I]nstrucciones")

        menuPanels["C"] =  MeatPanel(Menu("Carnes"))
        menuPanels["V"] =  VegetablePanel(Menu("Verduras"))
        menuPanels["F"] =  FruitPanel(Menu("Frutas"))
        menuPanels["CE"] =  CerealPanel(Menu("Cereales"))
        menuPanels["AC"] =  OilPanel(Menu("Aceites"))
    }

    override fun waitingForInstruction() {
        println(menu)
        print("¿Qué deseas añadir a tu receta?/" +
                "Cerrar RecipeBook[E]/" +
                "Regresar al menú principal[R]/" +
                "Regresar al menú anterior[B]: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun executeAction() {
        when(actionKey) {
            "A" -> println("Agüita")
            "L" -> println("Leche")
            "C", "V", "F", "CE", "AC" -> {
                val menuPanel:IngredientPanel = menuPanels[actionKey] ?: MeatPanel(Menu("Carnes"))
                menuPanel.run()
                recipe.ingredients.add(menuPanel.ingredient)
            }
        }
    }

    override fun run() {
        waitingForInstruction()
        executeAction()
    }
}