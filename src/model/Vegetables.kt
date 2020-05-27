package model

class Vegetables: Category("Vegetales") {

    init {
        this.ingredients.add(Ingredient("Espinaca", "tazas"))
        this.ingredients.add(Ingredient("Zanahoria", "tazas"))
        this.ingredients.add(Ingredient("Brócoli", "tazas"))
        this.ingredients.add(Ingredient("Lechuga", "tazas"))
    }
}