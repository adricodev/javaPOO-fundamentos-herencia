# Ejercicio 06 — Canales de Notificación

## Enunciado

Crear la interfaz `CanalNotificacion` con el método `enviar(mensaje, destinatario)`. Dos clases que la implementan: `NotificacionEmail` y `NotificacionSMS`, cada una con su propio formato de envío.

En el main, enviar una notificación por email y otra por SMS a través del mismo contrato.

## Clases

- `CanalNotificacion` — interfaz (enviar())
- `NotificacionEmail` — implements CanalNotificacion
- `NotificacionSMS` — implements CanalNotificacion

## Conceptos practicados

- Declaración e implementación de interfaces
- Un mismo contrato, distintas implementaciones
- Métodos con varios parámetros
