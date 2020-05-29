package model

class Menu(title:String): Item(title) {

    val items: HashMap<String, Item> = HashMap<String, Item>()

    override fun toString(): String {
        var itemsList = ""
        for (value in items.values) {
            itemsList += "  ${value.title}\n"
        }
        return """
            *${title}
            *----------------------------------------------------
            *$itemsList
        """.trimMargin("*")
    }
}