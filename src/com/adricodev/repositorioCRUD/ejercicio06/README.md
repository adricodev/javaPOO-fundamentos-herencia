# Ejercicio 06 — Repositorio de Libros con Búsquedas

## Enunciado

Ampliar el repositorio de libros con **consultas personalizadas**: además del `guardar()`, `actualizar()` y `remover()`, la interfaz define `porAutor(texto)` y `conPrecioMayor(minimo)`, que devuelven listados filtrados.

En el main, guardar varios libros, buscar por autor (sin importar mayúsculas/minúsculas), filtrar por precio, actualizar uno y eliminar otro.

## Clases

- `modelo/Libro` — entidad (id autogenerado, autor, precio)
- `interfaces/LibroInterfaceCrud` — CRUD + búsquedas personalizadas
- `implementacion/LibroInterfaceImpl` — implementación de las consultas
- `Main` — demostración de todas las operaciones

## Conceptos practicados

- Consultas filtradas en el contrato del repositorio
- Recorrido de colecciones con condiciones
- removeIf para eliminación por predicado
- Actualización por id dentro de una colección
