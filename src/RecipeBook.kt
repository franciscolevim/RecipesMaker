import model.Item
import model.Menu
import model.Recipe

class RecipeBook(menu: Menu): RecipePanel(menu), IActions {

    var actionKey:String? = ""
    val recipies: ArrayList<Recipe> = ArrayList()

    init {
        menu.items.put("1", Item("[C]rear"))
        menu.items.put("2", Item("[V]er"))
        menu.items.put("3", Item("[S]alir"))
    }

    override fun waitingForInstruction() {
        waiting@ while (true) {
            println(menu)
            print("¿Qué deseas hacer? ")
            actionKey = readLine()?.toUpperCase() ?: ""
            when(actionKey) {
                "C","V","S" -> break@waiting;
            }
        }
    }

    override fun executeAction() {
        println("Acción: $actionKey")
    }

    override fun run() {
        do {
            waitingForInstruction()
            executeAction()
        } while(actionKey != "S")
    }
}