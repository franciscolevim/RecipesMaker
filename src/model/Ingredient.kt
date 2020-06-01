package model

data class Ingredient(val name:String, val quantity:String) {
    override fun toString(): String {
        return "$quantity de $name"
    }
}