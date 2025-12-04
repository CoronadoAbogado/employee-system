import Empleados.Designer
import Empleados.Developer
import Empleados.Manager

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val empleados=mutableListOf<Employees>()

    val manager1=Manager("Carlos Jose",1050.50)
    val developer1=Developer("Luis",1250.25)
    val designer1=Designer("José Luis",8500.24)

    empleados.add(manager1)
    empleados.add(developer1)
    empleados.add(designer1)

    for (emp in empleados) {
        emp.work()
        println(emp.calculateAnnualBonus(emp))
        emp.details()
    }

    manager1.evaluatePerformance()
    developer1.evaluatePerformance()
    designer1.evaluatePerformance()
}
}