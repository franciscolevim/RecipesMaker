import model.*
import java.util.*

fun main(args: Array<String>) {

    val recipe = Recipe("Nueva Receta")
    for (idx in 1..5) {
        val ingredient = Ingredient("Ingrediente_${idx}", "tazas", 2.5f)
        recipe.ingredients.add(ingredient)
    }
    recipe.instructions = "Moler todo en la licuadora y después tomar como jugo. ¡Liiiiiistooooooo!"
    println(recipe)
}