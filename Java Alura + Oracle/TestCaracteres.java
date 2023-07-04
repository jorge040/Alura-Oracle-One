public class TestCaracteres {
    public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);

        // valor con tabla Unicode
        char valor = 65;
        System.out.println(valor);

        // No copila
        // valor = valor +1;
        // System.out.println(valor);

        // Se casteo para convertir en int a char
        valor = (char) (valor +1);
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
        palabra = palabra + " " + 2023;
        System.out.println(palabra);



    }
}
