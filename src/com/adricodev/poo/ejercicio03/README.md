# Ejercicio 03 — Instrumentos Musicales (ENUM + Herencia)

## Enunciado

Crear un enum `TipoInstrumento` con valores `CUERDA`, `VIENTO`, `PERCUSION`. Crear una clase abstracta `Instrumento` con método abstracto `tocar()` y tres clases hijas: `Guitarra`, `Piano`, `Bateria`, cada una con un atributo propio.

En el main, crear un array `Instrumento[]` con varios instrumentos y recorrerlo con for-each mostrando nombre, tipo y el sonido de cada uno.

## Clases

- `TipoInstrumento` — enum (CUERDA, VIENTO, PERCUSION)
- `Instrumento` — clase abstracta (nombre, tipo, tocar())
- `Guitarra` — extends Instrumento (cuerdas)
- `Piano` — extends Instrumento (teclas)
- `Bateria` — extends Instrumento (tambores)

## Conceptos practicados

- Declaración de enum
- Clases y métodos abstractos
- Herencia y super()
- Arrays polimórficos con for-each
- Sobrescritura de toString()
