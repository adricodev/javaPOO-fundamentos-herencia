# Ejercicio 04 — Repositorio de Libros (paquetes por capas)

## Enunciado

Repetir el CRUD de libros organizando el código en **subpaquetes por responsabilidad**: `modelo` para la entidad, `interfaces` para el contrato y `implementacion` para la clase concreta.

En el main, guardar libros, listarlos con for-each, consultar por id, actualizar un registro corrigiendo sus datos y eliminar otro.

## Clases

- `modelo/Libro` — entidad (id autogenerado, autor, precio)
- `interfaces/LibroRepositorioCrud` — contrato CRUD
- `implementacion/LibroRepoImpl` — implementación sobre ArrayList

## Conceptos practicados

- Organización en paquetes: modelo / interfaces / implementacion
- Imports entre subpaquetes
- CRUD completo con actualización de campos
- Patrón repositorio escalable
