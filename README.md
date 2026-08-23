# Java POO - Fundamentos de Programación Orientada a Objetos

Ejercicios prácticos de programación orientada a objetos en Java, progresando desde herencia básica hasta polimorfismo, instanceof, reflexión y StringBuilder.

## Ejercicios

### [Ejercicio 01](./ejercicio01/) — Jerarquía de Personas
Jerarquía con `Persona`, `Empleado`, `Gerente` y `Cliente`. Herencia, constructores con super, toString() sobrescrito, setter de presupuesto en Gerente.

### [Ejercicio 02](./ejercicio02/) — Almacén y Verdulería
Jerarquía con `Producto`, `Fruta`, `Lacteo`, `Limpieza` y `NoPerecible`. Herencia, arrays polimórficos y reflexión con getClass() y getSuperclass().

### [Ejercicio 03](./ejercicio03TypeCasting/) — Animales (instanceof, cast, reflexión)
Clase abstracta `Animal` con `Perro`, `Gato` y `Vaca`. Métodos abstractos, instanceof + cast, reflexión y métodos propios por clase.

### [Ejercicio 04](com/adricodev/fundamentos/ejercicio04StringBuilder/) — Generador de Reportes (StringBuilder)
Clase abstracta `Reporte` con `ReporteFactura` y `ReporteListaTareas`. StringBuilder para armar reportes, método imprimir() cohesivo, polimorfismo.

### [Ejercicio 05](com/adricodev/fundamentos/ejercicio05/) — Electrodomésticos
Clase abstracta `Electrodomestico` con `Lavadora`, `Heladera` y `Microondas`. instanceof + cast, condicionales booleanos, setters dinámicos, reflexión.

### [Ejercicio 06](src/com/adricodev/poo/ejercicio06/) — Envíos y Paquetes
Enum `CategoriaEnvio` con recargos, clase abstracta `Paquete` con tres tipos (`Pequeno`, `Mediano`, `Grande`). ENUM como tipo de atributo, cálculos condicionales, arrays polimórficos.

### [Ejercicio 07](src/com/adricodev/poo/ejercicio07/) — Transferencias Bancarias
Sistema bancario con `Cuenta`, `CuentaAhorro` y `CuentaCorriente`. Herencia, sobrescritura de métodos, `transferir()` con objetos por parámetro, composición, condicionales con límite de descubierto, StringBuilder.

### [Ejercicio 08](src/com/adricodev/poo/ejercicio08/) — Instrumentos Musicales
Enum `TipoInstrumento`, clase abstracta `Instrumento` con `Guitarra`, `Piano` y `Bateria`. ENUM como tipo de atributo, arrays polimórficos, sobrescritura de toString().

### [Ejercicio 09](src/com/adricodev/poo/ejercicio09/) — Empleados con Sobrescritura
Clase base `Empleado` con `EmpleadoJornadaCompleta` y `EmpleadoJornadaParcial`. Sobrescritura de `calcularSalario()`, división con decimales, arrays polimórficos.

### [Ejercicio 10](src/com/adricodev/poo/ejercicio10/) — Vehículos
Enum `TipoCombustible`, clase abstracta `Vehiculo` con `Bicicleta` y `Coche`. instanceof + cast, filtrado por tipo, reflexión, métodos propios.

## Contenido cubierto

- Clases y objetos
- Atributos encapsulados (private/protected)
- Herencia con super()
- Sobrescritura de métodos (toString, métodos abstractos)
- Clases y métodos abstractos
- Polimorfismo con arrays
- instanceof y casting explícito
- Java Reflection API (getClass, getSuperclass, getSimpleName)
- StringBuilder (append, toString)
- Métodos cohesivos (imprimir)
- Condicionales con atributos booleanos
