# Ejercicio 01 — De Array a Lista (primer método genérico)

## Enunciado

Crear una clase utilitaria `ArrayUtils` con un método estático genérico `arrayToList(T[] array)` que reciba un array de cualquier tipo y devuelva una `List<T>` con los mismos elementos.

En el main, convertir un array de `String` a lista usando el método propio (no `Arrays.asList()`) y añadir elementos nuevos para comprobar que es una lista modificable.

## Clases

- `ArrayUtils` — clase utilitaria con el método estático genérico
- `Main` — prueba del método con un array de String

## Conceptos practicados

- Declaración de un método genérico estático (`static <T>`)
- `T` como tipo del parámetro y del retorno
- Inferencia de tipos al invocar el método
- Diferencia entre genérico de método y genérico de clase
