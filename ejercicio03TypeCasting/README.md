# Ejercicio 03 — Animales (instanceof, cast, reflexión)

## Enunciado

Crear una clase abstracta `Animal` con atributo `nombre` y método abstracto `sonido()`. Tres clases hijas: `Perro`, `Gato`, `Vaca`, cada una con un atributo propio y un método propio adicional.

En el main, crear un array `Animal[]` con varios animales y recorrerlo con for-each aplicando:
- Polimorfismo con `sonido()`
- `instanceof` + cast para llamar a los métodos propios
- Reflexión para mostrar la jerarquía de clases

## Clases

- `Animal` — clase abstracta (nombre, sonido())
- `Perro` — extends Animal (raza, ladrar())
- `Gato` — extends Animal (color, maullar())
- `Vaca` — extends Animal (peso, mugir())

## Conceptos practicados

- Clases y métodos abstractos
- Herencia y super()
- Polimorfismo
- instanceof y casting explícito
- Java Reflection API
