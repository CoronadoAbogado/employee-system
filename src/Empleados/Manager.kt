package Empleados

class Manager(name: String, salary:Double) : Employee(name,salary) {
    override fun work() {
        println("\"Supervising the team and planning projects.\"")
    }

    override fun calculateAnnualBonus() {
        val total = salary*0.2
        println("Bonus del 20% del salario: $total")
    }

    override fun evaluatePerformance(){
        println("Empleado con puesto de trabajo: Manager con nombre $name y con salario $salary ha hecho un gran trabajo")
    }

}