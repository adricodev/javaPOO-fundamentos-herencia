# Ejercicio 05 — Vehículos (ENUM + instanceof + Reflexión)

## Enunciado

Crear un enum `TipoCombustible` con valores `GASOLINA`, `DIESEL`, `ELECTRICO`, `HIBRIDO`. Crear una clase abstracta `Vehiculo` con método abstracto `mover()` y dos clases hijas: `Bicicleta` y `Coche`, cada una con un atributo propio y un método propio.

En el main, crear un array `Vehiculo[]` con varios vehículos y recorrerlo con for-each aplicando:
- Polimorfismo con `mover()`
- `instanceof` + cast para llamar a los métodos propios
- Filtro para mostrar solo bicicletas
- Reflexión para mostrar la jerarquía de clases

## Clases

- `TipoCombustible` — enum (GASOLINA, DIESEL, ELECTRICO, HIBRIDO)
- `Vehiculo` — clase abstracta (marca, anio, mover())
- `Bicicleta` — extends Vehiculo (velocidades, sonarTimbre())
- `Coche` — extends Vehiculo (tipoCombustible, abrirMaletero())

## Conceptos practicados

- Enum como tipo de atributo
- Clases y métodos abstractos
- Herencia y super()
- instanceof y casting explícito
- Filtrado por tipo con instanceof
- Java Reflection API
