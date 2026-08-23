# Ejercicio 05 — Repositorio de Empleados (paquetes por capas)

## Enunciado

Aplicar la estructura por subpaquetes (`modelo`, `interfaces`, `implementacion`) a un repositorio de empleados con CRUD completo.

En el main, guardar empleados, listarlos, actualizar datos de uno de ellos (nombre, salario, departamento) y borrar otro.

## Clases

- `modelo/Empleado` — entidad (id autogenerado, nombre, salario, departamento)
- `interfaces/EmpleadoRepositorioCrud` — contrato CRUD
- `implementacion/EmpleadoRepoImpl` — implementación sobre ArrayList

## Conceptos practicados

- Estructura modelo / interfaces / implementacion
- CRUD completo
- Actualización campo a campo del objeto persistido
