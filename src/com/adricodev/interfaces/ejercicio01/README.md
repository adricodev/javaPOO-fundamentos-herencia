# Ejercicio 01 — Figuras Geométricas (clase abstracta, antesala de interfaces)

## Enunciado

Crear una clase abstracta `Figura` con método abstracto `calcularArea()`. Dos clases hijas: `Circulo` y `Rectangulo`, cada una con sus atributos propios y su fórmula de área.

En el main, crear un círculo y un rectángulo e imprimir el área de cada uno. Este ejercicio es la antesala directa a las interfaces: mismo contrato, distintas implementaciones.

## Clases

- `Figura` — clase abstracta (color, calcularArea())
- `Circulo` — extends Figura (radio)
- `Rectangulo` — extends Figura (base, altura)

## Conceptos practicados

- Clases y métodos abstractos
- Herencia con super()
- Sobrescritura de métodos abstractos
- Antesala al concepto de interfaz
