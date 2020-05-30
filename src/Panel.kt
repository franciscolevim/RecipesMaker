import model.Menu

abstract class Panel(val menu:Menu) {
    protected var actionKey:String = ""
    abstract fun run()
    fun getActionkey():String = actionKey
}