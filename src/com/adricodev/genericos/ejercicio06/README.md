# Ejercicio 06 — Buscador Genérico (buscar elemento en un array)

## Enunciado

Crear una clase `BuscadorUtils` con un método estático genérico `buscarUtils(T[] array, T elemento)` que recorra el array y devuelva `true` si encuentra el elemento (comparando con `equals()`) o `false` si no aparece.

En el main, buscar dentro de un array de `String` un nombre que existe y otro que no, imprimiendo ambos resultados.

## Clases

- `BuscadorUtils` — clase utilitaria con el método genérico estático de búsqueda
- `Main` — búsquedas existente e inexistente sobre un array de String

## Conceptos practicados

- Método genérico que combina un array `T[]` con un elemento `T`
- Recorrido de arrays genéricos con for-each
- Comparación de objetos con `equals()` en lugar de `==`
