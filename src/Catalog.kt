import model.Ingredient
import model.Menu

abstract class Catalog(menu:Menu) : Panel(menu), ICommands {

    var requestQuestion = ""
    var ingredientName = ""

    override fun waitingForCommand() {
        println(menu)
        print("¿Qué ingrediente deseas agregar a tu receta? ")
        command = readLine()?.toUpperCase() ?: ""
    }

    override fun display() {
        waitingForCommand()
        executeCommand()
    }

    protected fun makeMenuOptions(menuRange:IntRange) {
        for (number in menuRange) {
            menu.options.add(number.toString())
        }
    }

    open fun requestIngredient(): Ingredient {
        var quantity:String = ""
        do {
            print("$requestQuestion ")
            quantity = readLine() ?: ""
        } while (quantity.trim() == "")
        return Ingredient(ingredientName, quantity)
    }
}