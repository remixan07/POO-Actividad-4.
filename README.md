## Modelado UML

Apliqué modelado de abstracciones para representar las entidades principales del sistema escolar:

Student representa a los alumnos con matrícula, nombre, edad y curso

Professor representa a los docentes con nómina, salario por hora y materia

Subject modela las materias con créditos y horas semanales

Course representa el curso formado por tres materias

## ------------------------

## Versión 1

## ------------------------

Apliqué la estructura básica orientada a objetos basada en el UML

Definí las clases principales sin encapsulación completa ni copias profundas

Implementé constructores simples y métodos básicos de cálculo

### === Añadí ===

Clases Student, Professor, Subject, Course

Atributos principales de cada entidad

Método para calcular créditos del curso

Método para calcular salario semanal

### === Eliminé ===

Variables sueltas sin encapsulación

### === Modifiqué ===

Uso de tipos primitivos → reemplazados por objetos del modelo

## ------------------------

## Versión 2

## ------------------------

Mejoré el diseño aplicando encapsulación completa y constructores copia en las clases principales

Implementé composición correcta entre Course y Subject

Omtimizé el cálculo de créditos y salario

### === Añadí ===

Constructores copia en Subject y Course

Copia de materias dentro de Course

Métodos de acceso controlado

### === Eliminé ===

Referencias directas a objetos sin copia

## ------------------------

## Versión 3

## ------------------------

El programa crea objetos reales y ejecuta cálculos correctamente.

### === Añadí ===

Copia en Student y Professor

Constructores copia en todas las clases

Flujo completo en main

Cálculo final de créditos y salario

### === Eliminé ===

Dependencias  entre objetos

### === Modifiqué ===

Relaciones entre clases, pues ahora respetan totalmente composición, agregación y dependencia


"* Durante algún tiempo, no pude actualizar los archivos hasta hece poco, por ello es que la hora que indica en que momento se guardaron y cuando se subieron no concuerda del todo"
