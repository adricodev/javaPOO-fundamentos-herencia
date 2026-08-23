# Ejercicio 01 — Jerarquía de Personas

## Enunciado

Una compañía maneja empleados y clientes. Entre los empleados hay gerentes que manejan un presupuesto para su área (modificable). A todos los empleados se les puede aumentar el sueldo.

Crear una jerarquía de clases tomando como base `Persona`, con constructores, getters, `toString()` sobrescrito, y un setter de presupuesto solo en `Gerente`. Incluir un main con ejemplos que impriman todos los datos vía `toString()`.

## Clases

- `Persona` — clase base (nombre, apellido, numeroFiscal, direccion)
- `Empleado` — extends Persona (remuneracion, empleadoId)
- `Gerente` — extends Empleado (presupuesto)
- `Cliente` — extends Persona (clienteId)

## Conceptos practicados

- Herencia y super()
- Constructores encadenados
- Sobrescritura de toString()
- Encapsulación con getters y setters
