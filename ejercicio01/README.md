# Ejercicio 01 — Jerarquía de Personas
                                                                                                                                                        LSP                                     
     ## Enunciado                                                                                                                                       LSPs are disabled                       
                                                                                                                                                                                                
     Una compañía maneja empleados y clientes. Entre los empleados hay gerentes que manejan un presupuesto para su área (modificable). A todos los                                              
     empleados se les puede aumentar el sueldo.                                                                                                                                                 
                                                                                                                                                                                                
     Crear una jerarquía de clases tomando como base `Persona`, con constructores, getters, `toString()` sobrescrito, y un setter de presupuesto                                                
     solo en `Gerente`. Incluir un main con ejemplos que impriman todos los datos vía `toString()`.                                                                                             
                                                                                                                                                                                                
    ## Clases                                                                                                                                                                                  
                                                                                                                                                          ⬖ Getting started                ✕    
     - `Persona` — clase base (nombre, apellido, numeroFiscal, direccion)                                                                                                                       
     - `Empleado` — extends Persona (remuneracion, empleadoId)                                                                                              OpenCode includes free models       
     - `Gerente` — extends Empleado (presupuesto)                                                                                                           so you can start immediately.       
     - `Cliente` — extends Persona (clienteId)   

## Conceptos practicados

     - Clases y métodos abstractos                                                                                                                                                              
     - Herencia y super()                                                                                                                                                                       
     - Polimorfismo                                                                                                                                                                             
     - instanceof y casting explícito                                                                                                                     ⬖ Getting started                ✕    
     - Java Reflection API   