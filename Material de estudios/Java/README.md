<h1> Hola Equipo de Alura y Oracle </h1>
<h2> Estudiemos Juntos: Java  </h2>

<h2> Pilares De La Programación Orientada a Objetos (POO). </h2>

<b>Abstracción:</b> La abstracción implica simplificar la complejidad modelando objetos del mundo real como entidades con características esenciales y omitiendo los detalles irrelevantes. En POO, puedes crear clases que representan tipos de objetos y definir propiedades (atributos) y comportamientos (métodos) asociados con esos objetos. La abstracción permite enfocarse en lo que hace un objeto y cómo interactúa con otros objetos, en lugar de preocuparse por su implementación interna.

<b>Encapsulación:</b> La encapsulación se refiere a ocultar los detalles internos de un objeto y proporcionar una interfaz clara y controlada a través de la cual otros objetos pueden interactuar con él. Esto se logra mediante la combinación de datos (atributos) y los métodos que operan sobre esos datos en una sola unidad llamada clase. La encapsulación promueve la seguridad y la modularidad, ya que los objetos externos solo pueden acceder a los datos y comportamientos a través de los métodos definidos en la interfaz pública de la clase.

<b>Herencia:</b> La herencia permite crear nuevas clases basadas en clases existentes, aprovechando y extendiendo sus propiedades y comportamientos. La clase existente se llama clase base o superclase, y la nueva clase se llama subclase. La herencia permite reutilizar código, evitando la duplicación y fomentando la jerarquía de clases. Las subclases heredan los atributos y métodos de la superclase y pueden agregar nuevos atributos y métodos o modificar los existentes.

<b>Polimorfismo:</b> El polimorfismo permite tratar diferentes objetos de manera uniforme mediante la definición de una interfaz común y la implementación de comportamientos específicos en las clases individuales. En otras palabras, objetos de diferentes clases pueden ser tratados como objetos de una clase base común. Esto se logra mediante la implementación de métodos con el mismo nombre en diferentes clases, pero con comportamientos específicos para cada clase. El polimorfismo facilita la extensibilidad y flexibilidad del código, ya que puedes agregar nuevas clases que implementen la misma interfaz y funcionen con código existente sin necesidad de cambiarlo.

<h2> Conceptos </h2>

<b>Java:</b> Java es un lenguaje de programación orientado a objetos desarrollado por Sun Microsystems (ahora Oracle). Es conocido por su portabilidad, seguridad y facilidad de uso.

<b>Clase:</b> Una clase en Java es un bloque de construcción fundamental que define un objeto. Contiene propiedades (variables) y métodos (funciones) que describen el comportamiento y las características del objeto.

<b>Objeto:</b> Un objeto es una instancia de una clase. Representa una entidad del mundo real y tiene un estado y un comportamiento definidos por su clase.

<b>Método:</b> Un método es un bloque de código que realiza una acción específica. Los métodos son utilizados para organizar la lógica y la funcionalidad de un programa. Pueden tomar argumentos y devolver un valor.

<b>Variable:</b> Una variable es un espacio de memoria que almacena un valor. En Java, debes declarar el tipo de variable antes de usarla. Ejemplos de tipos de variables son int (entero), double (decimal), boolean (verdadero/falso) y String (cadena de texto).

<b>Condicionales:</b> Las estructuras condicionales permiten tomar decisiones en función de una condición. Los condicionales más comunes en Java son if, else if y else. Estas estructuras permiten ejecutar diferentes bloques de código en función del resultado de una condición.

<b>Bucles:</b> Los bucles se utilizan para repetir un bloque de código varias veces. En Java, los bucles más comunes son el bucle while, el bucle do-while y el bucle for.

<b>Arreglos:</b> Un arreglo (array) es una estructura de datos que almacena un conjunto de elementos del mismo tipo. Los elementos están organizados en posiciones numeradas y se accede a ellos mediante un índice.

<b>Excepciones:</b> Las excepciones son eventos que ocurren durante la ejecución de un programa y que interrumpen su flujo normal. En Java, puedes usar bloques try-catch para capturar y manejar excepciones, evitando que el programa se detenga abruptamente.

<b>This:</b> es una referencia al propio objeto en el que se está trabajando. Se utiliza para acceder y distinguir los miembros (variables y métodos) de esa instancia específica de la clase.

<b>If:</b> El if se usa para ejecutar un bloque de código solo si una condición es verdadera (evaluada como true). Si la condición es falsa, el bloque no se ejecutará.

<b>Else:</b> El else se combina con un if y se utiliza para ejecutar un bloque de código cuando la condición del if es falsa. En otras palabras, si el if no se cumple, se ejecuta el código dentro del else

<b>Else if:</b> El else if se utiliza para comprobar múltiples condiciones en secuencia. Si la condición de un if no se cumple, se evalúa la siguiente condición en el else if. Esto permite manejar varias opciones diferentes.

<b>For:</b> El bucle for se utiliza para ejecutar un bloque de código un número específico de veces. Tiene tres partes: inicialización, condición y actualización. La inicialización se ejecuta una vez al principio, la condición se verifica antes de cada iteración y, si es verdadera, se ejecuta el bloque de código. Luego, se realiza la actualización y el ciclo continúa hasta que la condición sea falsa. 

<b>While:</b> El bucle while se utiliza para ejecutar un bloque de código mientras una condición sea verdadera. La condición se verifica antes de cada iteración. Si la condición es verdadera, el bloque de código se ejecuta y luego se vuelve a verificar la condición. El ciclo continúa hasta que la condición sea falsa.

<b>Do-while:</b> El bucle do-while es similar al bucle while, pero la condición se verifica después de cada iteración. Esto significa que el bloque de código se ejecuta al menos una vez, incluso si la condición es falsa desde el principio.

<h2> Como se Hace </h2>
<h4></h4>

<h3> - This </h3>


    public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Usando "this" para referirse a la variable de instancia
        this.edad = edad;     // Usando "this" para referirse a la variable de instancia
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre); // Usando "this" para acceder a la variable de instancia
        System.out.println("Edad: " + this.edad);     // Usando "this" para acceder a la variable de instancia
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        persona1.mostrarInformacion();
    }
    }

    

<h2> - If </h2>

    public class EjemploIf {
    public static void main(String[] args) {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
    }


<h2> - Else </h2>

    public class EjemploElse {
      public static void main(String[] args) {
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    }


<h2> - Else if </h2>

    public class EjemploElseIf {
      public static void main(String[] args) {
        int puntuacion = 85;
        if (puntuacion >= 90) {
            System.out.println("Tienes una puntuación excelente");
        } else if (puntuacion >= 70) {
            System.out.println("Tienes una buena puntuación");
        } else if (puntuacion >= 50) {
            System.out.println("Tu puntuación es aceptable");
        } else {
            System.out.println("Necesitas mejorar tu puntuación");
        }
    }
    }


<h2> - For </h2>

    public class EjemploFor {
      public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
    }
    }

<h2> - While </h2>

    public class EjemploWhile {
      public static void main(String[] args) {
        int contador = 0;
        
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
    }


<h2> - Do While </h2>

    public class EjemploDoWhile {
      public static void main(String[] args) {
        int numero = 5;
        
        do {
            System.out.println("Número: " + numero);
            numero--;
        } while (numero > 0);
    }
}


<h2> - Array </h2>

    public class EjemploArray {
    public static void main(String[] args) {
        // Declaración e inicialización de un array de enteros
        int[] numeros = new int[5];  // Crea un array de tamaño 5
        
        // Inicialización de elementos del array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acceso y uso de elementos del array
        System.out.println("Elemento en la posición 2: " + numeros[2]);
        
        // Iteración a través del array usando un bucle for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }
    }
    }
    
<h2> Extra Preguntas de entrevistas </h2>
<h4> Si va a tener pronto una entrevista no te alarmes te dejo algunas preguntas que me han hecho. </h4>

- ¿Qué es Java y cuáles son sus principales características?
<br>Java es un lenguaje de programación de alto nivel y orientado a objetos que se caracteriza por ser portátil, tener sintaxis sencilla, contar con un sistema de administración automática de memoria (garbage collector) y ser robusto y seguro.

- ¿Cuál es la diferencia entre una clase y un objeto en Java?
<br>En Java, una clase es una plantilla que define las propiedades y comportamientos de un objeto. Por otro lado, un objeto es una instancia de una clase, es decir, una representación concreta de esa clase en tiempo de ejecución.

- Explica el concepto de herencia en Java y cómo se implementa.
  <br>La herencia en Java permite que una clase herede los atributos y métodos de otra clase, conocida como clase padre o superclase. Se implementa utilizando la palabra clave 
  "extends" y permite la reutilización de código y la creación de jerarquías de clases.

- ¿Qué es una interfaz en Java y cómo se diferencia de una clase abstracta?
  <br>Una interfaz en Java es una colección de métodos abstractos (sin implementación) y constantes que una clase puede implementar. A diferencia de una clase abstracta, una 
  interfaz solo define la firma de los métodos, pero no proporciona una implementación. Una clase puede implementar múltiples interfaces, pero solo puede heredar de una clase.

- ¿Cuál es la diferencia entre una excepción verificada y una excepción no verificada en Java?
  <br>En Java, una excepción verificada es aquella que debe ser declarada en la firma del método o gestionada mediante un bloque try-catch. Un ejemplo de excepción verificada es 
  IOException. Por otro lado, una excepción no verificada es aquella que no necesita ser declarada en la firma del método ni ser capturada explícitamente. Un ejemplo de excepción 
  no verificada es NullPointerException.

- ¿Qué es la sobrecarga de métodos y cómo se implementa en Java
  <br>La sobrecarga de métodos en Java permite definir varios métodos con el mismo nombre pero con diferentes parámetros. Se implementa cambiando la firma del método, es decir, 
  modificando el número de parámetros, el tipo de los parámetros o el orden de los parámetros.

- ¿Qué es la anotación @Override en Java y cuál es su propósito?
  <br>La anotación @Override en Java se utiliza para indicar que un método en una clase hija está sobrescribiendo un método de la clase padre. Sirve como una verificación de 
  compilación para asegurarse de que el método realmente está sobrescribiendo uno existente en la clase padre.

- ¿Cuál es la diferencia entre una lista vinculada (LinkedList) y una lista de matrices (ArrayList) en Java?
  <br>LinkedList es una implementación de lista enlazada, lo que significa que los elementos se almacenan en nodos que están enlazados entre sí. Permite agregar y eliminar 
  elementos de manera eficiente, pero el acceso a elementos en posiciones específicas es más lento. ArrayList, por otro lado, es una implementación de lista basada en matrices, lo 
  que la hace más eficiente para el acceso aleatorio, pero menos eficiente para agregar y eliminar elementos en posiciones intermedias.

- ¿Qué es un hilo (Thread) en Java y cómo se crea y administra?
  <br>Un hilo (Thread) en Java es una unidad básica de ejecución dentro de un programa. Se utiliza para lograr la concurrencia y permite que diferentes partes del programa se 
  ejecuten de forma simultánea y asíncrona. Los hilos se crean extendiendo la clase Thread o implementando la interfaz Runnable.

- Explica el concepto de polimorfismo en Java y cómo se logra.
  <br>El polimorfismo en Java se refiere a la capacidad de un objeto de tomar muchas formas. Permite que una variable de un tipo de clase padre pueda referirse a objetos de 
  cualquiera de sus clases hijas. Esto se logra mediante la herencia y la implementación de métodos con la misma firma pero comportamientos diferentes en las clases hijas.

- ¿Qué es la serialización en Java y cómo se utiliza?
  <br>La serialización en Java es el proceso de convertir un objeto en una secuencia de bytes para su almacenamiento o transmisión. Se utiliza para guardar el estado de un objeto 
  y luego restaurarlo. Esto se hace implementando la interfaz Serializable y utilizando un flujo de objetos (ObjectInputStream y ObjectOutputStream).

- ¿Cuál es la diferencia entre una variable primitiva y una variable de objeto en Java?
  <br>Las variables primitivas en Java almacenan valores simples, como enteros, flotantes o caracteres. Se almacenan en la pila de memoria y ocupan un espacio fijo. Las variables 
  de objeto almacenan referencias a objetos en la memoria dinámica (el heap).

- ¿Qué es el recolector de basura (garbage collector) en Java y cómo funciona?
  <br>El recolector de basura (garbage collector) en Java es un componente que administra automáticamente la memoria liberando objetos que ya no son accesibles y recuperando el 
  espacio utilizado por ellos. Java utiliza un modelo de memoria gestionada, lo que significa que los programadores no tienen que preocuparse por liberar manualmente la memoria.

- ¿Cuál es la diferencia entre una clave y un valor en un mapa (Map) en Java?
  <br>En un mapa (Map) en Java, una clave se utiliza para identificar un valor asociado. Cada clave en un mapa es única y se utiliza para acceder al valor correspondiente. Los 
  mapas proporcionan una estructura para almacenar y recuperar datos de manera eficiente.

- Explica el concepto de concurrencia y cómo se maneja en Java mediante el uso de sincronización.
  <br>La concurrencia en Java se refiere a la ejecución simultánea de múltiples hilos. Java ofrece herramientas como la sincronización y los monitores para gestionar la 
  concurrencia y evitar problemas como las condiciones de carrera y la inconsistencia en los datos compartidos entre hilos.


