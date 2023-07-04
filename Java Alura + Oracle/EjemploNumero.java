public class EjemploNumero {
    // Ejercicio imprimir de 1 al 10 con los diferentes ciclos en java
    static void Ciclo1() { // Ciclo While
        // Declaracion de Variables
        int numero = 0;
        // Funcion
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
    }
    // Ciclo For
    static void Ciclo2() {
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        Ciclo2();
    }
}
