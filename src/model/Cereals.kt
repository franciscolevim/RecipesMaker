package model

class Cereals: Category("Cereales") {

    init {
        this.ingredients.add(Ingredient("Avena", "gramos"))
        this.ingredients.add(Ingredient("Trigo", "gramos"))
        this.ingredients.add(Ingredient("Arroz", "gramos"))
        this.ingredients.add(Ingredient("Maiz", "gramos"))
    }

}