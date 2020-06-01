import model.Menu

abstract class Panel(val menu:Menu) {
    val panels:HashMap<String, Panel> = HashMap()
    abstract fun display()
}