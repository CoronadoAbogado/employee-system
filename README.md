# employee-system
Tenemos una clase abstracta llamada Employee con los atributos name y salary, y con los métodos abstractos work() y calculateAnnualBonus(), y un método concreto details().

Tenemos los tipos de trabajadores (Developer, Manager y designer) que heredan de employee los atributos y métodos.

Tenemos la interfaz Evaluable con el metodo evaluatePerformance(), que es la interfaz que implementa employee.

El objetivo de todo esto es utilizar la herencia para que los métodos se sobreescriban en las clases de los tipos de trabajadores.
