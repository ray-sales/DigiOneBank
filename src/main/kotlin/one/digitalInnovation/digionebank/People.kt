package one.digitalInnovation.digionebank

class People {
    var name: String = ""
    var cpf: String = ""
    private set
    constructor(name:String, cpf:String){
        this.name = name
        this.cpf = cpf
    }

    fun joinPersonInfo() = "$name and $cpf"
}

fun main(){
    val peopleRay = People("Ray", "555555")
    println(peopleRay.joinPersonInfo())

}