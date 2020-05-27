import model.*
import java.util.*

fun main(args: Array<String>) {

    println(":::: Bienvenido a Recipe Marker ::::")
    val menu = """
        
            [C]rear una receta.
            [V]er mis recetas.
            [S]alir.
            
    """.trimIndent()

    var input: String?
    do {
        println(menu)
        print("Selecciona una opción: ")
        input = readLine()
        input = input?.toUpperCase()
        when(input) {
            "C" -> makeRecipe()
            "V" -> viewRecipe("Ver mis recetas")
        }
    } while (input?.compareTo("S") ?: -1 != 0 )

    println("\nHasta la vista baby")
}

val categories: Array<Category> = arrayOf(Water(), Milk(), Meat(), Vegetables(), Fruits(), Cereals(), Eggs(), Oils())

fun makeRecipe() {
    println("\n:: Ingredientes\n")
    var menu: String = ""
    val exitOption = categories.size + 1
    for (idx: Int in categories.indices) {
        menu += "${idx + 1}) ${categories[idx].name}\n"
    }
    menu += "${categories.size + 1}) Regresar al menú anterior\n"
    val reader = Scanner(System.`in`)
    var option: Int = 0
    do {
        println(menu)
        print("Selecciona una opción: ")
        option = reader.nextInt()
        when(option) {
            in 1..categories.size -> selectIngrediente(categories[option - 1])
        }
    } while (option != exitOption)
}

fun selectIngrediente(category: Category) {
    println("\n${category}\n")
}

fun viewRecipe(title: String) {
    println(":: $title")
}