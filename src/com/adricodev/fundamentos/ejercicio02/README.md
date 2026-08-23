# Ejercicio 02 — Almacén y Verdulería

## Enunciado

Desarrollar un diseño orientado a objetos para un almacén y verdulería. Cuatro clases de producto: `Fruta`, `Limpieza`, `Lacteo`, `NoPerecible`. Todas heredan de `Producto` los atributos comunes `nombre` y `precio`, y cada una tiene dos atributos propios adicionales.

Incluir constructores, getters y `toString()` sobrescrito. En el main, crear un array polimórfico y usar reflexión para mostrar la jerarquía de cada clase en tiempo de ejecución.

## Clases

- `Producto` — clase base (nombre, precio)
- `Fruta` — extends Producto (peso, color)
- `Lacteo` — extends Producto (cantidad, proteinas)
- `Limpieza` — extends Producto (componentes, litros)
- `NoPerecible` — extends Producto (contenido, calorias)

## Conceptos practicados

- Herencia
- super() en constructores
- Sobrescritura de toString()
- Polimorfismo con arreglos
- Java Reflection API (getClass(), getSuperclass())
