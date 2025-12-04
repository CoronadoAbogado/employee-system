package Empleados

class Developer(name: String,   salary:Double) : Employee(name,salary) {
    override fun work() {
        println("\"Supervising the team and planning projects.\"")
    }

    override fun calculateAnnualBonus() {
        val total = salary*0.2
        println("Bonus del 20% del salario: $total")
    }

    override fun evaluatePerformance(){

    }

}