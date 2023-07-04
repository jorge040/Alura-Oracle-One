public class Multiplo {
    static void MultiplosDeTresHastaCien(){
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        MultiplosDeTresHastaCien();
    }
}
