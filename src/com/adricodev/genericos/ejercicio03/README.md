# Ejercicio 03 — Impresor Genérico (método genérico reutilizable)

## Enunciado

Crear una clase `Impresor` con un método estático genérico `imprimirElemento(T elemento)` que imprima por consola cualquier objeto sin importar su tipo.

En el main, invocarlo con un `String`, un `Integer` y un `Boolean`, comprobando que el mismo método acepta tipos distintos sin sobrecargas ni duplicación.

## Clases

- `Impresor` — clase con el método estático genérico
- `Main` — llamadas con distintos tipos de datos

## Conceptos practicados

- Métodos genéricos estáticos en clases no genéricas
- Inferencia de tipos: el compilador deduce `T` según el argumento recibido
- Reutilización: un único método genérico en lugar de varias sobrecargas
