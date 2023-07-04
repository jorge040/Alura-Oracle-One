public class TestBucles {
    public static void main(String[] args) {
        
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int numero = 1; numero <= 10; numero++) {
                System.out.print(numero * multiplicador);
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
