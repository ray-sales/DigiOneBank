package one.digitalInnovation.digionebank

class Analyst(
    name:String,
    cpf:String,
    amount: Double
):Employee(name, cpf, amount) {
    override fun calculoAuxilio() = amount * 0.1
}