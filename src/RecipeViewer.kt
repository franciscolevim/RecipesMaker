import model.Item
import model.LabelMenu
import model.Menu
import model.Recipe

class RecipeViewer(menu: Menu): RecipePanel(menu), IActions {

    private val recipesMenu:LabelMenu = LabelMenu("Recetas")

    init {
        menu.items.put("1", Item("[L]istar"))
        menu.items.put("2", Item("[R]egresar al menú principal"))
        menu.items.put("3", Item("c[E]rrar RecipeBook"))

        for (idx in recipes.indices) {
            recipesMenu.items.put("${idx + 1}", "${idx + 1}.- ${recipes[idx].title}")
        }
    }

    override fun waitingForInstruction() {
        waiting@ while (true) {
            println(menu)
            print("¿Qué deseas hacer? ")
            actionKey = readLine()?.toUpperCase() ?: ""
            when(actionKey) {
                "L","R","E" -> break@waiting;
            }
        }
    }

    override fun executeAction() {
        println(recipesMenu)
        print("¿Qué receta deseas ver?/Cerrar RecipeBook[E]/Regresar al menú principal[R]/" +
                "Regresar al menú anterior[B]: ")
        actionKey = readLine()?.toUpperCase() ?: ""
    }

    override fun run() {
        runloop@ while (true) {
            waitingForInstruction()
            if ("L" == actionKey) {
                executeAction()
            }
            when(actionKey) {
                "E", "R" -> break@runloop
            }
        }
    }
}