# Ejercicio 04 — Generador de Reportes (StringBuilder)

## Enunciado

Crear una clase abstracta `Reporte` con método abstracto `generarContenido()` y un método concreto `imprimir()` que use `StringBuilder` para armar y mostrar el reporte completo (título + separador + contenido + separador).

Dos clases hijas:
- `ReporteFactura` — muestra una lista de productos con sus precios.
- `ReporteListaTareas` — muestra una lista de tareas indicando si están completadas o pendientes.

En el main, crear un array `Reporte[]` con ambas clases y recorrerlo con for-each llamando a `imprimir()` (polimorfismo).

## Clases

- `Reporte` — clase abstracta (titulo, generarContenido(), imprimir())
- `ReporteFactura` — extends Reporte (productos[], precios[])
- `ReporteListaTareas` — extends Reporte (tareas[], completadas[])

## Conceptos practicados

- Clases y métodos abstractos
- Herencia y super()
- StringBuilder con append()
- Polimorfismo con arrays y for-each
- Método imprimir() que cohesiona título + contenido
