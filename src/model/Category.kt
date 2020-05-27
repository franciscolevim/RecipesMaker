package model

abstract class Category(val name: String): ICategoryOperations {

    protected val ingredients: ArrayList<Ingredient> = ArrayList<Ingredient>()

    override fun toString(): String {
        var result: String = ""
        for (idx: Int in ingredients.indices) {
            result += "${idx + 1}) ${ingredients[idx].description}.\n"
        }
        result += "${ingredients.size + 1}) Regresar al menú anterior."
        return result
    }

    override fun getIngredient(idx: Int): Ingredient {
        return ingredients[idx]
    }

}