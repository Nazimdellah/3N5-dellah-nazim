package org.example
import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
    val name = "Nazim"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
*/

    fun afficher(nom: String) {
        println("Bonjour $nom!")
    }

    fun main(args: Array<String>) {
        if (args.isNotEmpty()) {
            val nom = args[0]
            afficher(nom)
        } else {
            println("SVP veuillez fournir un nom!")
            exitProcess(1) // optional, to indicate an error
        }
    }
