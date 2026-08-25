# Ejercicio 09 — Filtro de Nulos (limpiar listas genéricas)

## Enunciado

Crear un método genérico estático que reciba una lista que puede contener elementos nulos y devuelva una **lista nueva** únicamente con los elementos válidos, sin modificar la lista original.

En el main, crear una lista de `String` intercalando `null` a propósito entre elementos reales, aplicar el filtro e imprimir el resultado.

## Clases

- `FiltroUtilsList` — clase utilitaria con el método genérico de filtrado
- `Main` — prueba con una lista de String que contiene nulos

## Conceptos practicados

- Método genérico que trabaja con `List<T>` en lugar de arrays
- Construcción de una lista nueva a partir de otra
- Filtrado por condición (`null`) manteniendo intacta la entrada
