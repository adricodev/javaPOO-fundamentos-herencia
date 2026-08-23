# Ejercicio 02 — Repositorio de Clientes

## Enunciado

Repetir el patrón repositorio con clientes: interfaz `ClienteRepositorio` e implementación `ClienteRepoImpl` sobre colecciones.

En el main, guardar varios clientes, listarlos, hacer consultas puntuales por id y eliminar uno comprobando que ya no existe.

## Clases

- `Cliente` — modelo (id autogenerado, nombre, email)
- `ClienteRepositorio` — interfaz (listar(), guardar(), eliminar())
- `ClienteRepoImpl` — implementación con ArrayList

## Conceptos practicados

- Patrón repositorio
- Separación entre modelo e interfaz de datos
- Colecciones y for-each
- Consultas por id
