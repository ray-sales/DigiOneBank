package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.ClientType

fun main(){
    ClientType.values().forEach{element ->
        println("${element.name} - ${element.name.toString()}")
    }

    ClientType.values().forEach{
        println("${it.name} - $it")
    }
}