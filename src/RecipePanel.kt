import model.Item
import model.Menu
import model.Recipe

abstract class RecipePanel(menu:Menu): Panel(menu) {
    protected val recipes:ArrayList<Recipe> = ArrayList()
}