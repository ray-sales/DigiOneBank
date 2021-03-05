package one.digitalInnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    amount: Double,
): Employee(name, cpf, amount) {
    override fun calculoAuxilio(): Double = amount * 0.4
}