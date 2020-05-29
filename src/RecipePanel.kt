import model.Item
import model.Menu
import model.Recipe

abstract class RecipePanel(val menu: Menu) {

    protected val recipes: ArrayList<Recipe> = ArrayList()
    protected var actionKey:String? = ""
    abstract fun run()
    fun getActionkey(): String? = actionKey
}