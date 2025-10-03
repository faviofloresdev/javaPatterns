# Patrón Singleton

## Definición
El **Singleton** es un patrón de diseño que asegura que una clase tenga **una única instancia** y proporciona un **punto global de acceso** a ella.

---

## Estructura básica
```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {} // Constructor privado

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Usando el singleton");
    }
}
```
## Resultado obtenido
Al ejecutar Main, se espera que el hashCode de las instancias obtenidas tengan el mismo valor. Esto demuestra que a pesar de crear dos objetos de la clase Singleton, sigue siendo la misma instancia.
```
23:01:53.107 [main] INFO org.patterns.Main -- Instance 392292416 saying Hello from Singleton
23:01:53.113 [main] INFO org.patterns.Main -- Instance 392292416 saying Hello from Singleton
```
## Donde aplicarlo

| Caso de uso                         | Descripción                                                          |
| ----------------------------------- | -------------------------------------------------------------------- |
| **Gestión de configuración**        | Una clase que maneja configuración global de la app.                 |
| **Conexión a base de datos**        | Pool o conexión única que se comparte en toda la app.                |
| **Logging**                         | Registrar logs desde cualquier parte sin crear múltiples instancias. |
| **Cache global**                    | Almacén de datos compartido accesible desde cualquier clase.         |
| **Control de recursos compartidos** | Ej: administración de archivos, sockets, o hilos.                    |

## Ventajas
- Controla la cantidad de instancias, evitando duplicidad.
- Permite acceso global a la instancia.
- Facilita la gestión de recursos compartidos.
- Útil en objetos de estado global que deben ser únicos.

## Desventajas 
- Puede introducir acoplamiento fuerte y dependencia global.
- Dificulta pruebas unitarias, porque la instancia está fija.
- Puede generar problemas de concurrencia si no se implementa correctamente en entornos multihilo.
- A veces se considera un “anti-patrón” si se abusa de él.