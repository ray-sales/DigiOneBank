package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.Analyst
import one.digitalInnovation.digionebank.imprimeRelatorioFuncionario

fun main(){
    val ray = Analyst("ray Sales", "1234567890", 100.01)

    imprimeRelatorioFuncionario.imprime(ray)
}
