import model.Item
import model.Menu
import model.Recipe

class RecipeBook(menu:Menu): Panel(menu), ICommands {
    val recipes = ArrayList<Recipe>()
    override var command:String = ""

    init {
        menu.items["1"] = Item("[C]rear Receta")
        menu.items["2"] = Item("[V]er Recetas")
        menu.items["3"] = Item("c[E]rrar RecipeBook")
        menu.options.addAll(arrayListOf("C", "V", "E"))
        panels["C"] = RecipeMaker(Menu("Crear Receta"))
        panels["V"] = RecipeViewer(Menu("Ver Recetas"))
    }

    override fun display() {
        do {
            waitingForCommand()
            executeCommand()
        } while (command != "E")
    }

    override fun waitingForCommand() {
        do {
            println(menu)
            print("¿Qué deseas hacer? ")
            command = readLine()?.toUpperCase() ?: ""
        } while (!menu.options.contains(command))
    }

    override fun executeCommand() {
        val panel = panels[command]
        if (panel is RecipeViewer) {
            panel.recipes = recipes
        }
        panel?.display()

        if (panel is RecipeMaker) {
            recipes.add(panel.recipe ?: Recipe("Nueva Receta"))
        }
    }
}