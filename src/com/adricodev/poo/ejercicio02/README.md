# Ejercicio 02 — Transferencias Bancarias con Herencia

## Enunciado

Crear un sistema bancario con herencia de cuentas. Clase base `Cuenta` con métodos `depositar()`, `retirar()` y `transferir()`. Dos clases hijas: `CuentaAhorro` (con tasa de interés) y `CuentaCorriente` (con límite de descubierto). Una clase `Banco` que agrupa cuentas y muestra resúmenes de transferencias usando StringBuilder.

En el main, crear clientes, cuentas de distintos tipos, realizar depósitos, aplicar intereses y ejecutar transferencias entre cuentas.

## Clases

- `Cliente` — (nombre, dni)
- `Cuenta` — clase base (iban, titular, saldo, depositar(), retirar(), transferir())
- `CuentaAhorro` — extends Cuenta (tasaInteres, aplicarInteres())
- `CuentaCorriente` — extends Cuenta (limiteDescubierto, sobrescribe retirar())
- `Banco` — (nombre, cuentas[], mostrarTransferencia())

## Conceptos practicados

- Herencia con super()
- Sobrescritura de métodos
- Métodos que reciben objetos por parámetro
- Composición (Banco tiene Cuentas, Cuenta tiene Cliente)
- Polimorfismo con this.retirar() en transferir()
- Condicionales en la lógica de negocio
- StringBuilder para armar reportes
