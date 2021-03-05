package one.digitalInnovation.digionebank.Test

import one.digitalInnovation.digionebank.Employee
import java.math.BigDecimal

fun main(){
    val ray = Employee("ray Sales", "1234567890", BigDecimal(10000))
    println(ray.name)
    println(ray.cpf)
    println(ray.amount)
}