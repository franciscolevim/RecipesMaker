package model

class Recipe(val title:String) {
    val ingredients = ArrayList<Ingredient>()
    var instructions = ""

    override fun toString(): String {
        var ingredientsList = ""
        for (value in ingredients) {
            ingredientsList += "  ${value}\n"
        }
        return """
            *
            *<<<<< ${title} >>>>>
            *
            *Ingredientes:
            *
            *$ingredientsList
            *
            *Instrucciones: $instructions
        """.trimMargin("*")
    }
}