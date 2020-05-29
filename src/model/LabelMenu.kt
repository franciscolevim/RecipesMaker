package model

class LabelMenu(title:String): Item(title) {

    val items:HashMap<String, String> = HashMap<String, String>()

    override fun toString(): String {
        var itemsList = ""
        for (value in items.values) {
            itemsList += "  ${value}\n"
        }
        return """
            *
            *:::: ${title}
            *--------------------------------------------------
            *$itemsList
        """.trimMargin("*")
    }
}