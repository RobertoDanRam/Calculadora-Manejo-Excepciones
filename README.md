# Calculadora con Manejo de Excepciones (Actividad 10)

Programa de consola en Java que implementa una calculadora de operaciones aritméticas básicas, diseñada específicamente para demostrar el uso correcto del bloque `try-catch-finally` y la gestión integral de errores en tiempo de ejecución.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **Operaciones Básicas:** Permite ejecutar sumas, restas, multiplicaciones y divisiones capturando los números y el operador de forma secuencial.
- **Manejo de Errores de Formato:** Utiliza `NumberFormatException` para evitar que el programa colapse si el usuario ingresa letras o símbolos en lugar de valores numéricos.
- **Validación Matemática:** Lanza y captura de forma explícita una `ArithmeticException` para impedir la división entre cero, mostrando un mensaje de error amigable.
- **Validación de Operadores:** Identifica el uso de operadores no reconocidos mediante una `IllegalArgumentException`.
- **Gestión de Recursos:** Implementa el bloque `finally` para asegurar que el objeto `Scanner` se cierre de manera segura en cualquier escenario, liberando los recursos del sistema independientemente de si ocurrió un error o no.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Control de flujo:** `switch`
- **Gestión de memoria y recursos:** Bloque `finally` y `Scanner`
- **Manejo de Excepciones:** `try-catch-finally`, `NumberFormatException`, `ArithmeticException`, `IllegalArgumentException` y `Exception` general.
- **Entorno de Desarrollo:** Visual Studio Code

## Estructura del Código

- `src/Main.java`: Archivo único que contiene toda la lógica de la aplicación[cite: 3]. Alberga la captura de datos (leyendo primero como cadenas para posteriormente convertirlas a valores de tipo `double`), el sistema de evaluación `switch` para el operador, y la estructura completa de anidación de capturas de excepciones.
