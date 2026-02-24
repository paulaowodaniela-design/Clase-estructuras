Actividades Prácticas
Estructuras de Datos en Java

Estudiante: Paula Prada
Asignatura: Estructuras de Datos – IS0288
Programa: Ingeniería de Sistemas

## 📑 Índice de Actividades

1. [Actividad 1 – TAD Playlist](./Actividad1_TAD)
2. [Actividad 2 – Arreglos Estáticos](./Actividad2_Arreglos)
3. [Actividad 3 – Vector](./Actividad3_Vector)
4. [Actividad 4 – Strings](./Actividad4_Strings)
5. [Actividad 5 – Matrices](./Actividad5_Matrices)
6. [Actividad 6 – ArrayList](./Actividad6_ArrayList)
7. [Actividad 7 – Stack](./Actividad7_Pila)
8. [Actividad 8 – Queue](./Actividad8_Queue)
9. [Actividad 9 – HashMap](./Actividad9_HashMap)

Actividad 1 – Diseño Conceptual (TAD Playlist)
En esta actividad se definió un Tipo Abstracto de Dato utilizando una interface en Java.
El objetivo fue comprender la abstracción y la separación entre especificación e implementación, enfocándose únicamente en las firmas de los métodos y documentación Javadoc.

Reflexión técnica:
Esta actividad permitió entender que una interfaz define el contrato de comportamiento sin especificar cómo se implementa internamente, reforzando el concepto de abstracción en programación orientada a objetos.

Actividad 2 – Arreglos Estáticos
Se implementó una clase que utiliza un arreglo primitivo double[] de tamaño fijo (24 posiciones) para almacenar temperaturas.

Reflexión técnica:
Se evidenció la naturaleza estática de los arrays en Java, el acceso directo en tiempo constante O(1) mediante índices y la importancia de manejar correctamente excepciones como ArrayIndexOutOfBoundsException.

Actividad 3 – Vector y Sincronización
Se utilizó la clase Vector para simular un sistema bancario con múltiples hilos.

Reflexión técnica:
Se comprendió que Vector es thread-safe debido a que sus métodos están sincronizados (synchronized), lo que garantiza integridad en entornos concurrentes, aunque con penalización en rendimiento frente a ArrayList.

Actividad 4 – Strings e Inmutabilidad
Se trabajó con la clase String y StringBuilder para demostrar la inmutabilidad de las cadenas en Java.

Reflexión técnica:
Se comprobó que las modificaciones sobre String generan nuevos objetos en memoria, mientras que StringBuilder permite modificaciones eficientes sin crear nuevas referencias.

Actividad 5 – Matrices
Se modeló una sala de cine utilizando una matriz bidimensional int[][].

Reflexión técnica:
Se reforzó el uso de bucles anidados, validación de índices y representación de datos estructurados en dos dimensiones.

Actividad 6 – ArrayList
Se implementó un carrito de compras dinámico utilizando ArrayList.

Reflexión técnica:
Se comprendió la diferencia entre capacidad y tamaño, el redimensionamiento interno automático y la importancia de sobrescribir el método equals() para búsquedas correctas.

Actividad 7 – Stack (Pila)
Se simuló el historial de un navegador utilizando Stack.

Reflexión técnica:
Se aplicó el principio LIFO (Last In, First Out) y se manejaron adecuadamente operaciones como push, pop y peek, validando estados vacíos para evitar errores.

Actividad 8 – Queue (Cola)
Se implementó un sistema de atención utilizando la interfaz Queue con LinkedList.

Reflexión técnica:
Se evidenció el comportamiento FIFO (First In, First Out) y la diferencia entre métodos como poll() y remove() en el manejo seguro de estructuras vacías.

Actividad 9 – HashMap
Se desarrolló un sistema de inventario utilizando HashMap para asociar claves y valores.

Reflexión técnica:
Se comprendió la estructura Key-Value, la unicidad de las claves y la eficiencia de búsqueda cercana a O(1), sin necesidad de recorrer todos los elementos

Conclusión General
Esta colección de actividades permitió comprender la diferencia entre estructuras estáticas y dinámicas, analizar eficiencia y rendimiento, y aplicar conceptos fundamentales como abstracción, inmutabilidad, sincronización y complejidad algorítmica en Java.
