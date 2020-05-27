package model

interface ICategoryOperations {
    fun getIngredient(idx: Int = 0): Ingredient
}