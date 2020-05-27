package model

class Oils: Category("Aceites") {

    init {
        this.ingredients.add(Ingredient("Oliva", "cucharadas"))
        this.ingredients.add(Ingredient("Maiz", "cucharadas"))
        this.ingredients.add(Ingredient("Coco", "cucharadas"))
    }

}