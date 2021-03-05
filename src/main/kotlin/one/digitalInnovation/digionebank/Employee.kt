package one.digitalInnovation.digionebank


abstract class Employee(
    name: String,
    cpf: String,
    val amount: Double
) : People(name, cpf) {

    protected abstract fun calculoAuxilio(): Double

    override fun toString():String = """
        Nome: $name
        CPF: $cpf
        Salário: $amount
        Auxílio: ${calculoAuxilio()}
    """.trimIndent()
}