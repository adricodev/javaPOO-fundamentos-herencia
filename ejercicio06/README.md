# Ejercicio 06 — Envíos y Paquetes (ENUM + Herencia)

## Enunciado

Crear un enum `CategoriaEnvio` con valores `ESTANDAR`, `EXPRESS`, `INTERNACIONAL`, cada uno con un recargo asociado. Crear una clase abstracta `Paquete` con atributos `codigo`, `pesoKg` y `categoria`, y tres clases hijas: `PaquetePequeno`, `PaqueteMediano`, `PaqueteGrande`, cada una con su propia lógica de cálculo de costo.

En el main, crear un array `Paquete[]` con varios paquetes de distintos tipos y categorías, y recorrerlo con for-each mostrando información detallada y costos calculados.

## Clases

- `CategoriaEnvio` — enum (ESTANDAR, EXPRESS, INTERNACIONAL) con recargo
- `Paquete` — clase abstracta (codigo, pesoKg, categoria, calcularCosto())
- `PaquetePequeno` — extends Paquete (tarifaBase = 5.0)
- `PaqueteMediano` — extends Paquete (tarifaBase = 10.0, cargoExtra por peso)
- `PaqueteGrande` — extends Paquete (tarifaBase = 20.0, adicionalFragil)

## Conceptos practicados

- Declaración de enum con atributos y métodos
- Uso de enum como tipo de atributo
- Clases y métodos abstractos
- Herencia y super()
- Cálculos con condicionales (peso, fragilidad)
- Arrays polimórficos con for-each
- Separación de responsabilidades (cálculo vs. impresión)
