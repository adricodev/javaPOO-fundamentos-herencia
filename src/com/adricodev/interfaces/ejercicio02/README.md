# Ejercicio 02 — Voladores (interfaz + métodos default y static)

## Enunciado

Crear la interfaz `Volador` con un método abstracto `volar()`, un método `default` `aterrizar()` y un método `static` `tipo()`. Dos clases que la implementan: `Pajaro` y `Avion`.

En el main, hacer volar y aterrizar a ambos, y llamar al método estático directamente desde la interfaz.

## Clases

- `Volador` — interfaz (volar(), aterrizar() default, tipo() static)
- `Pajaro` — implements Volador
- `Avion` — implements Volador

## Conceptos practicados

- Declaración de interfaces
- Implementación con `implements`
- Métodos `default` en interfaces
- Métodos `static` en interfaces
- Polimorfismo con tipos de interfaz
