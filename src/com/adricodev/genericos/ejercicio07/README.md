# Ejercicio 07 — Primer Elemento No Nulo (genéricos y manejo de null)

## Enunciado

Crear una clase `ElementoUtils` con un método estático genérico `obtenerPrimerNoNulo(T[] array)` que devuelva el primer elemento del array que no sea `null`, o `null` si todos lo son.

En el main, probar tres arrays: uno sin nulos, otro con un `null` al principio y otro donde solo el último elemento es válido.

## Clases

- `ElementoUtils` — clase utilitaria con el método genérico estático
- `Main` — tres casos de prueba con distintas cantidades de nulos

## Conceptos practicados

- Manejo de `null` dentro de métodos genéricos
- Retorno anticipado (`return` dentro del bucle)
- Diseño de pruebas con casos límite
