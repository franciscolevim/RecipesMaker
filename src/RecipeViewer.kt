import model.Item
import model.Menu
import model.Recipe

class RecipeViewer(menu:Menu): Panel(menu), ICommands {
    var recipes = ArrayList<Recipe>()
    override var command:String = ""

    override fun display() {
        do {
            waitingForCommand()
            executeCommand()
        } while(command != "R")
    }

    override fun waitingForCommand() {
        do {
            displayMenu()
            print("¿Qué receta deseas ver? ")
            command = readLine()?.toUpperCase() ?: ""
        } while (!menu.options.contains(command))
    }

    override fun executeCommand() {
        if (command != "R") {
            println(recipes[command.toInt() - 1])
            readLine()
        }
    }

    private fun displayMenu() {
        for (idx in recipes.indices) {
            menu.items["${idx + 1}"] = Item("${idx + 1}.- ${recipes[idx].title}")
            menu.options.add("${idx + 1}")
        }
        menu.items["${recipes.size + 1}"] = Item("[R]egresar al menú principal.")
        menu.options.add("R")
        println(menu)
    }
}