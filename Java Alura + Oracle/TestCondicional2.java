public class TestCondicional2 {
    public static void main(String[] args) {
        int edad = 18;
        int cantidadPersonas = 2;
        boolean acompañado = cantidadPersonas >= 2;

        if (edad >= 18 || acompañado) {
            System.out.println(acompañado);
            System.out.println(" Usted tiene " + edad + "  años. " + " Usted puede pasar por que es mayor de edad. ");
            System.out.println( " Usted es menor de edad " + " pero puede pasar por que su acompañante es mayor de edad. ");
        }else {
            System.out.println(
                    " Usted es menor de edad" + " Y no cuenta con ningun acompañante " + "se le niega la entrada. ");

        }
    }
}

