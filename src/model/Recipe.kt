package model

class Recipe(val title: String) {

    val ingredients: ArrayList<Ingredient> = ArrayList()
    var instructions: String = ""

    override fun toString(): String {
        var ingredientsList = ""
        for (idx in ingredients.indices) {
            ingredientsList += " ${idx + 1}.- ${ingredients[idx]}.\n"
        }
        return """
            *${this.title}
            *---------------------------------------------------------
            *
            *Ingredientes:
            *
            *${ingredientsList}
            *Instrucciones: ${this.instructions}
        """.trimMargin("*")
    }
}