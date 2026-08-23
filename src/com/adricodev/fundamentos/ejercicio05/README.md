# Ejercicio 05 — Electrodomésticos (Herencia + instanceof + Reflexión)

## Enunciado

Crear una clase abstracta `Electrodomestico` con atributos `marca` y `consumo`, y un método abstracto `encender()`. Tres clases hijas: `Lavadora`, `Heladera`, `Microondas`, cada una con un atributo propio y un método propio adicional.

En el main, crear un array `Electrodomestico[]` con varios electrodomésticos y recorrerlo con for-each aplicando:
- Polimorfismo con `encender()`
- `instanceof` + cast para llamar a los métodos propios
- Condicional en Heladera para detectar si tiene freezer o no
- Reflexión para mostrar la jerarquía de clases

## Clases

- `Electrodomestico` — clase abstracta (marca, consumo, encender())
- `Lavadora` — extends Electrodomestico (capacidadKg, lavar())
- `Heladera` — extends Electrodomestico (tieneFreezer, enfriar())
- `Microondas` — extends Electrodomestico (potenciaMaxima, calentar())

## Conceptos practicados

- Clases y métodos abstractos
- Herencia y super()
- Polimorfismo con arrays
- instanceof y casting explícito
- Java Reflection API
- Condicionales con atributos booleanos
- Uso de setters para asignación dinámica
