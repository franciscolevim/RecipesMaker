import model.*
import java.util.*

fun main(args: Array<String>) {

    val menu = Menu("Menucito")
    for (counter in 1..4) {
        val item = Item("Itemcito_$counter")
        menu.items.put("$counter", item)
    }
    println(menu)
}