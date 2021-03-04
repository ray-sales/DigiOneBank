package one.digitalInnovation.digionebank

class People {
    var name: String = "Ray"
    var cpf: String = "123.456.789-90"
    private set
}

fun main(){
    val rayssa = People()
    println(rayssa.name)
    println(rayssa.cpf)

}