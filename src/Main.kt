import Empleados.Designer
import Empleados.Developer
import Empleados.Manager

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Dime un nombre para probarlo con todos los empleados:")
    val nombre = readLine().toString()
    println("Dime un salario para probarlo con todos los empleados")
    val salario = readLine()?.toDouble()

    val Designer1 = Designer(nombre, salario ?:0.0)
    val Developer1 = Developer("PEPE", 1200.0)
    val Manager1 = Manager("PEPE", 1200.0)
    println("DESIGNER:")
    Designer1.evaluatePerformance()
    Designer1.work()
    Designer1.calculateAnnualBonus()
    println()
    println("DEVELOPER:")

    Developer1.evaluatePerformance()
    Developer1.work()
    Developer1.calculateAnnualBonus()
    println()
    println("MANAGER")
    Manager1.evaluatePerformance()
    Manager1.work()
    Manager1.calculateAnnualBonus()
}