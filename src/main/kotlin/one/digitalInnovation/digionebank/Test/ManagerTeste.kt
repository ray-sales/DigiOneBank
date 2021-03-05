package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.Analyst
import one.digitalInnovation.digionebank.Employee
import one.digitalInnovation.digionebank.imprimeRelatorioFuncionario

fun main(){
    val maria = Analyst("Maria das Graças", "1234567890", 5500.50)

    imprimeRelatorioFuncionario.imprime(maria)
}
