package one.digitalInnovation.digionebank

open class People(
    open val name: String,
    open val cpf:String
    ) {


    fun joinPersonInfo() = "$name and $cpf"
}

