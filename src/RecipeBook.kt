import model.Item
import model.Menu
import model.Recipe

class RecipeBook(menu: Menu): RecipePanel(menu), IActions {

    init {
        menu.items.put("1", Item("[C]rear Receta"))
        menu.items.put("2", Item("[V]er Recetas"))
        menu.items.put("3", Item("c[E]rrar RecipeBook"))
    }

    override fun waitingForInstruction() {
        waiting@ while (true) {
            println(menu)
            print("¿Qué deseas hacer? ")
            actionKey = readLine()?.toUpperCase() ?: ""
            when(actionKey) {
                "C","V","E" -> break@waiting;
            }
        }
    }

    override fun executeAction() {
        when(actionKey) {
            "C" -> {
                var option:String = ""
                waiting@ while (true) {
                    print("¿Deseas generar una nueva receta? [S]í/[N]o: ")
                    option = readLine()?.toUpperCase() ?: ""
                    when(option) {
                        "S" -> {
                            val maker = RecipeMaker(Menu("Nueva Receta"))
                            maker.run()
                            break@waiting
                        }
                        "N" -> {
                            println("Nel pastel")
                            break@waiting
                        }
                    }
                }
            }
            "V" -> {
                val viewer = RecipeViewer(Menu("Ver Recetas"))
                viewer.run()
                actionKey = viewer.getActionkey()
            }
        }
        if ("E" == actionKey) {
            println("Exit")
        }
    }

    override fun run() {
        do {
            waitingForInstruction()
            executeAction()
        } while(actionKey != "E")
    }
}