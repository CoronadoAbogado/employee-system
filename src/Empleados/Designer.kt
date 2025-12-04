package Empleados

class Designer(name: String, salary: Double) : Employee(name,salary){
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus() {
        val total = salary*0.15
        println("Bonus del 15% del salario: $total")
    }

    override fun evaluatePerformance(){
        println("Empleado con puesto de trabajo: Designer con nombre $name y con salario $salary ha hecho un gran trabajo")
    }

}