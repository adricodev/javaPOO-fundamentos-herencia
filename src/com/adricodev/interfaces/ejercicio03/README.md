# Ejercicio 03 — Medios de Pago (interfaz + clase base)

## Enunciado

Combinar herencia e interfaz: clase abstracta `MedioPago` con el saldo y `consultarSaldo()`, interfaz `Pagable` con `pagar(monto)`. Dos clases hijas que extienden de `MedioPago` e implementan `Pagable`: `TarjetaCredito` y `Paypal`.

En el main, crear ambos medios de pago, consultar saldos y realizar pagos comprobando cómo baja el saldo.

## Clases

- `MedioPago` — clase base (saldo, consultarSaldo())
- `Pagable` — interfaz (pagar())
- `TarjetaCredito` — extends MedioPago implements Pagable
- `Paypal` — extends MedioPago implements Pagable

## Conceptos practicados

- Combinación de herencia (`extends`) e interfaz (`implements`)
- Clases y métodos abstractos
- Sobrescritura de métodos
- Estado común en la clase base
