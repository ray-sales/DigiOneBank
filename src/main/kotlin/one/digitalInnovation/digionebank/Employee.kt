package one.digitalInnovation.digionebank

import java.math.BigDecimal

class Employee(
    override val name: String,
    override val cpf: String,
    val amount: BigDecimal
) : People(name, cpf) {
}