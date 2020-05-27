package model

class Meat: Category("Carne") {

    init {
        this.ingredients.add(Ingredient("Res","gramos"))
        this.ingredients.add(Ingredient("Puerco","gramos"))
        this.ingredients.add(Ingredient("Pollo","gramos"))
        this.ingredients.add(Ingredient("Pescado","gramos"))
    }

}