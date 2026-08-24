# Ejercicio 04 — Contenedor Simple (clase genérica con constructores)

## Enunciado

Crear una clase genérica `ContenedorSimple<T>` que almacene un único dato:

- Constructor vacío y constructor que recibe el dato inicial
- `getDato()` y `setDato(T dato)` para acceder al contenido
- `tieneDato()` — indica si el contenedor guarda algo

En el main, crear un `ContenedorSimple<Double>`, asignarle un valor con `setDato()` e imprimirlo junto al resultado de `tieneDato()`.

## Clases

- `ContenedorSimple<T>` — clase genérica con dos constructores sobrecargados
- `Main` — prueba con Double

## Conceptos practicados

- Genéricos a nivel de clase combinados con constructores sobrecargados
- Encapsulación con getter/setter sobre un campo genérico
- Operador diamante (`<>`) en la instanciación
