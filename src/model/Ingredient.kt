package model

class Ingredient(val name:String, var measure:String, var quantity:Float) {
    override fun toString():String {
        return "$name: $quantity $measure"
    }
}