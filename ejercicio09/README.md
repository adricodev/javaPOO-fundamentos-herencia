# Ejercicio 09 — Empleados con Sobrescritura

## Enunciado

Crear una clase base `Empleado` con método `calcularSalario()`. Dos clases hijas: `EmpleadoJornadaCompleta` que suma un bono al salario, y `EmpleadoJornadaParcial` que calcula el salario proporcional a las horas trabajadas.

En el main, crear un array `Empleado[]` con varios empleados de distintos tipos y recorrerlo con for-each mostrando sus datos y salario calculado.

## Clases

- `Empleado` — clase base (nombre, salarioBase, calcularSalario())
- `EmpleadoJornadaCompleta` — extends Empleado (bono, calcularSalario() con bono)
- `EmpleadoJornadaParcial` — extends Empleado (horasTrabajadas, calcularSalario() proporcional)

## Conceptos practicados

- Herencia
- Sobrescritura de métodos
- Arrays polimórficos
- División con decimales (40.0 para evitar truncamiento)
