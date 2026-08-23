# Ejercicio 05 — Dispositivos (interfaces múltiples + instanceof entre interfaces)

## Enunciado

Crear tres interfaces: `Encendible` (encender()), `Apagable` (apagar()) y `Reproducible` (reproducir()). Dos clases que las implementan según sus capacidades: `Televisor` (encender, apagar) y `EquipoSonido` (encender, apagar y reproducir).

En el main, un método `encenderYUsar(Encendible e)` que encienda cualquier dispositivo y, con `instanceof Reproducible` + cast, reprodusca solo los que puedan.

## Clases

- `Encendible` — interfaz (encender())
- `Apagable` — interfaz (apagar())
- `Reproducible` — interfaz (reproducir())
- `Televisor` — implements Encendible, Apagable
- `EquipoSonido` — implements Apagable, Encendible, Reproducible

## Conceptos practicados

- Implementación múltiple de interfaces
- Interfaces como tipo de parámetro
- `instanceof` contra interfaces + casting explícito
- Capacidades modeladas como contratos independientes
