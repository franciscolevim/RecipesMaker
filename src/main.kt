fun main(args: Array<String>) {
    val menu = """
        :: Bienvenido a Recipe Marker ::
        
        Selecciona la opción deseada
        
            1. Crear una receta.
            2. Ver mis recetas.
            3. Salir.
            
    """.trimIndent()

    var input: String?
    do {
        println(menu)
        print("Selección: ")
        input = readLine()
        when(input) {
            "1" -> {
                viewRecipe("Crear una receta")
                makeRecipe()
            }
            "2" -> viewRecipe("Ver mis recetas")
        }
    } while (input?.compareTo("3") ?: -1 != 0 )

    println("Hasta la vista baby")
}


fun makeRecipe() {
    val menu = """
        Selecciona por categoría el ingrediente que buscas
        
            1. Agua
            2. leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceites
            
    """.trimIndent()
    println(menu)
}


fun viewRecipe(title: String) {
    println(":.$title\n")
}