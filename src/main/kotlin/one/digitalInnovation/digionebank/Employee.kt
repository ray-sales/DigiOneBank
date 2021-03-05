package one.digitalInnovation.digionebank

import java.math.BigDecimal

abstract class Employee(
    name: String,
    cpf: String,
    val amount: BigDecimal
) : People(name, cpf) {

    abstract fun calculoAuxilio()
}