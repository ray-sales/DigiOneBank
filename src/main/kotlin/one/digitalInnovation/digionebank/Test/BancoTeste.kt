package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.Bank

fun main(){
    val digiOneBank = Bank("DigiOneBank", 100)

    println(digiOneBank.name)
    println(digiOneBank.code)

    val bank2 = digiOneBank.copy(name="SolsBank")

    println(bank2.info())
}