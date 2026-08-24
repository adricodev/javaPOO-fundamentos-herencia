# Ejercicio 02 — Caja Genérica (genéricos a nivel de clase)

## Enunciado

Crear una clase genérica `Caja<T>` que representa una caja donde solo cabe un elemento:

- `guardar(T contenido)` — mete un elemento en la caja
- `obtener()` — devuelve el elemento guardado
- `estaVacia()` — indica si no hay nada dentro
- `vaciar()` — deja la caja vacía

En el main, crear una `Caja<String>` y una `Caja<Integer>`, comprobando si están vacías antes de guardar, tras obtener el contenido y después de vaciarlas.

## Clases

- `Caja<T>` — clase genérica con campo interno de tipo `T`
- `Main` — pruebas con String e Integer

## Conceptos practicados

- Parámetro de tipo a nivel de clase (`class Caja<T>`)
- `T` como tipo de campo, de parámetro y de retorno
- Instanciación con distintos tipos usando el operador diamante (`new Caja<>()`)
- Comparación con `null` para determinar si hay contenido
