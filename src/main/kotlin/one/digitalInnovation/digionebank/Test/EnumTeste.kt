package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.ClientType

fun main(){
    ClientType.values().forEach{element ->
        println("${element.name} - ${element.description}")
    }

    ClientType.values().forEach{
        println("${it.name} - ${it.description}")
    }

    val clientTypePF = ClientType.PF
    println("${clientTypePF.name} - ${clientTypePF.description}")
}