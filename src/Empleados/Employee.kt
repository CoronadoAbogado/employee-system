package Empleados

import Interfaz.Evaluable

open abstract class Employee(val name: String, var salary: Double): Evaluable {


       open abstract fun work()
        open abstract fun calculateAnnualBonus()
        open fun details(){
            println("Nombre $name salario $salary")
        }


    }