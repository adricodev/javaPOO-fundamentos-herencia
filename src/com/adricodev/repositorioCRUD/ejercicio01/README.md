# Ejercicio 01 — Repositorio de Facturas (primer CRUD)

## Enunciado

Crear el primer repositorio: una interfaz `FacturaRepositorio` que defina las operaciones de acceso a datos y su implementación `FacturaRepositorioImpl` sobre un `ArrayList`.

En el main, guardar varias facturas, listarlas, consultar por id y eliminar alguna.

## Clases

- `Factura` — modelo (id autogenerado)
- `FacturaRepositorio` — interfaz (listar(), guardar(), eliminar())
- `FacturaRepositorioImpl` — implementación con ArrayList (añade porId())

## Conceptos practicados

- Patrón repositorio
- Interfaz como contrato de acceso a datos
- Colecciones (ArrayList, List)
- Búsqueda por id
