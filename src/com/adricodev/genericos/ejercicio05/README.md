# Ejercicio 05 — Comparador Genérico (sonIguales)

## Enunciado

Crear una clase `Utilidades` con un método estático genérico `sonIguales(T a, T b)` que devuelva `true` si ambos objetos son iguales (usando `equals()`).

En el main, comparar cadenas idénticas, cadenas que solo difieren en mayúsculas/minúsculas y pares de números enteros, imprimiendo cada resultado.

## Clases

- `Utilidades` — clase utilitaria con el método genérico estático
- `Main` — casos de prueba con String e Integer

## Conceptos practicados

- Método genérico con dos parámetros del mismo tipo `T`
- Comparación de objetos con `equals()` en lugar de `==`
- Diseño de métodos utilitarios reutilizables para cualquier tipo
