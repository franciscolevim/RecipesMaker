package model

class Menu(title:String): Item(title) {

    val items:HashMap<String, Item> = HashMap<String, Item>()
    val options:ArrayList<String> = ArrayList()

    override fun toString(): String {
        var itemsList = ""
        for (value in items.values) {
            itemsList += "  ${value.title}\n"
        }
        return """
            *
            *:::: ${title}
            *___________________________________________________
            *$itemsList
        """.trimMargin("*")
    }
}