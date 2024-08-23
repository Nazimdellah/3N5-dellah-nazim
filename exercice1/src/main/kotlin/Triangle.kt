package org.example
fun main(){
    triangle(5)
}
fun triangle(hauteur : Int) : String {

    for (row in 1..hauteur ){

        for (col in 1..row){
            print("*")


        }
        println()


    }
    return "0"


}
