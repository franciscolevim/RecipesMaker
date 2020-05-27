package model

class Fruits: Category("Frutas") {

    init {
        this.ingredients.add(Ingredient("Fresa", "tazas"))
        this.ingredients.add(Ingredient("Plátano", "piezas"))
        this.ingredients.add(Ingredient("Uvas", "tazas"))
        this.ingredients.add(Ingredient("Manzana", "piezas"))
        this.ingredients.add(Ingredient("Naranja", "piezas"))
        this.ingredients.add(Ingredient("Pera", "tazas"))
        this.ingredients.add(Ingredient("Cerezaz", "tazas"))
    }

}