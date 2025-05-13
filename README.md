# Ejercicio sobre Manejo de Compras con Tarjeta en JAVA (curso de Aula-Oracle-2025)

## 📌 Descripción

En este proyecto, se desarrollará una aplicación de **compras** que utilizará una tarjeta con un límite establecido inicialmente. A medida que se realicen compras, se registrarán los valores y las descripciones de cada transacción. Si el límite de la tarjeta se alcanza, la aplicación se detendrá y mostrará un resumen de las compras realizadas. De igual manera, la aplicación finalizará si el usuario decide dejar de realizar compras.

## 🚀 Instalación y Ejecución

### **1. Clonar el repositorio**

```sh
git clone https://github.com/jmikhaelz/ej-tarjeta.git
cd Ej-tarjeta
```

### **2. Configurar el entorno**

El proyecto requiere **Java 17** y **VS Code 1.99.3**. Si no tienes las versiones adecuadas, puedes instalarlas con:

```sh
sudo apt update
sudo apt install openjdk-17-jdk
```

Para verificar la instalación:

```sh
javac -version
java -version
```

### ✅ **3. Compilar el código fuente**

Usa el comando:

```sh
javac -d bin -sourcepath src src/mx/banco/Principal.java
```

📌 Esto hace lo siguiente:

* `javac:` Este es el compilador de Java que convierte los archivos .java (código fuente) en archivos .class **(bytecode).**
* `-d bin:` Esta opción especifica el directorio donde se guardarán los archivos .class compilados. En este caso, se guardarán en una carpeta llamada **bin/.**
* `-sourcepath src:` Esta opción le dice al compilador dónde buscar los archivos fuente .java que se utilizan en el proyecto. Aquí, se le indica que busque en la carpeta **src/.**
* `src/mx/banco/Principal.java:` Este es el archivo principal que quieres compilar. El compilador también buscará y compilará automáticamente cualquier otra clase que este archivo necesite, siempre y cuando estén en el sourcepath.

---

### ✅ **4. Ejecutar el programa**

Una vez compilado, puedes ejecutarlo con:

```sh
java -cp bin mx.banco.Principal
```

📌 Esto significa:
* `java:` Este es el intérprete de Java que ejecuta los archivos **.class.**
* `-cp bin`: usa `bin` como ruta donde están los `.class` ya compilados.
* `mx.banco.Principal`: es el nombre **completo del paquete + clase** con el método `main`.

---
## 📂 Estructura del Proyecto

```sh
Ej-tarjeta
├── README.md                               # Documentación
└── src                                     # Directorio Código fuente
    └── mx                                  # Paquete raíz
        └── banco
            ├── herramientas                # Manejo de Terminal
            │   └── LimpiarConsola.java
            ├── operaciones                 # Class de entorno
            │   ├── Compra.java
            │   └── Tarjeta.java
            └── Principal.java              #Archivo Main
```

## Uso de la Aplicación

1. **Inicializar la tarjeta**: Define el límite inicial de la tarjeta.
2. **Realizar compras**: Ingresa el valor y la descripción de cada compra.
3. **Resumen de compras**: La aplicación mostrará un resumen cuando se alcance el límite o se decida dejar de comprar.

## 🛠️ Entorno de Desarrollo

- **Lenguaje:** Java 17 (OpenJDK 17.0.14)
- **IDE:** Visual Studio Code 1.99.3
- **Paradigma:** Programación Orientada a Objetos
- **Gestión de código:** Git y GitHub
