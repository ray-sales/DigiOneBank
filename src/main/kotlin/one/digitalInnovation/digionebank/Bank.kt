package one.digitalInnovation.digionebank

data class Bank(
    val name: String,
    val code: Int
){
    fun info() = "$code - $name"
}
