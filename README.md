# Conversor de Monedas 💰
![Static Badge](https://img.shields.io/badge/2.11.0-GSON-blue)
![Static Badge](https://img.shields.io/badge/22.0.2-Java-red)

Con esta aplicación interactiva puedes convertir diferentes divisas en tiempo real. Este pequeño proyecto es un ejercicio práctico para demostrar mis habilidades básicas de backend en Java.

## Tecnologías utilizadas 🛠️

- **Java**: Lenguaje de programación principal.
- **Módulo `java.net.http`**: Para realizar solicitudes HTTP a la API.
- **Google Gson**: Para deserializar las respuestas JSON de la API.
- **ExchangeRate-API**: API utilizada para obtener tasas de cambio en tiempo real.

## ¿Qué usé habilidades usé en este proyecto? 🚀

- [x] **Diseño modular** con Programación Orientada a Objetos (POO).  
- [x] **Integración de APIs RESTful** para acceso a datos en tiempo real.  
- [x] **Consumo de datos JSON** con Gson.  
- [x] **Validación de entradas** para asegurar datos confiables.  
- [x] **Manejo de errores HTTP** para conexiones seguras y robustas.  

## Características principales ✨

- `Interfaz interactiva por consola con opciones dinámicas.`
- `Conversión de divisas entre Dólares, Soles y Pesos Mexicanos.`
- `Acceso a tasas de cambio en tiempo real usando una API externa.`
- `Validaciones sólidas para entradas y manejo de errores.`

## Cómo instalar y ejecutar 🔧

❗Recuerdar descargar [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson), colocar el .jar en la carpeta "/libs" y reemplazar el nombre del archivo en los siguientes pasos.

❗Recuerdar tener tu API Key de [ExchangeRate - API](https://www.exchangerate-api.com/).
   
1. **Clona este repositorio**:
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. **Coloca tu API Key**:

   Coloca tu API Key en la clase **ConsultarMonedas** en la variable **api_key**.
   
4. **Compila el código**:
   ```bash
   javac -d out -cp libs/gson-2.11.0.jar src/com/alura/conversorMonedas/*.java
   ```
5. **Ejecuta el proyecto**:
   ```bash
   java -cp "out;libs\gson-2.11.0.jar" com.alura.conversorMonedas.Main
   ```


## Imágenes 💻
