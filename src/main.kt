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
            "1" -> println("Crear")
            "2" -> println("Ver")
        }
    } while (input?.compareTo("3") ?: -1 != 0 )

    println("Hasta la vista baby")
}