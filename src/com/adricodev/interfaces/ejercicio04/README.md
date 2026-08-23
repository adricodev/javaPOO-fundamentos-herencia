# Ejercicio 04 — Procesador de Pagos (interfaz como parámetro + cast)

## Enunciado

Sobre la jerarquía del ejercicio 03, crear en el main un método `procesarPago(Pagable medio, double monto)` que reciba **cualquier** medio de pago por su tipo de interfaz, ejecute el pago y luego haga cast a `MedioPago` para consultar el saldo.

En el main, procesar un pago con tarjeta y otro con Paypal usando el mismo método.

## Clases

- `MedioPago` — clase base (saldo, consultarSaldo())
- `Pagable` — interfaz (pagar())
- `TarjetaCredito` — extends MedioPago implements Pagable
- `Paypal` — extends MedioPago implements Pagable
- `Main` — método procesarPago() polimórfico

## Conceptos practicados

- Interfaces como tipo de parámetro de método
- Programación orientada al contrato, no a la clase concreta
- `instanceof` implícito y casting explícito a la clase base
- Reutilización de código polimórfico
