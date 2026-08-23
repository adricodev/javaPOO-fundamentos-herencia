# Ejercicio 03 — Repositorio de Productos (CRUD completo)

## Enunciado

Ampliar el repositorio con la operación de **actualización**: interfaz `ProductoRepositorio` con `listar()`, `guardar()`, `actualizar()` y `eliminar()`.

En el main, guardar productos, actualizar el precio o nombre de alguno y eliminar otro, listando antes y después para ver los cambios.

## Clases

- `Producto` — modelo (id autogenerado, datos del producto)
- `ProductoRepositorio` — interfaz (listar(), guardar(), actualizar(), eliminar())
- `ProductoRepoImpl` — implementación con ArrayList

## Conceptos practicados

- CRUD completo: Create, Read, Update, Delete
- Actualización de objetos en colecciones
- Patrón repositorio consolidado
