public class TestCondicional {
    public static void main(String[] args) {
        int edad = 17;
        int cantidadPersonas = 1;

        if (edad >= 18) {
            System.out.println(" Usted tiene " + edad + "  años. " + " Usted puede pasar por que es mayor de edad. ");
        }
        if (cantidadPersonas >= 2) {
            System.out.println(
                    " Usted es menor de edad " + " pero puede pasar por que su acompañante es mayor de edad. ");

        } else {
            System.out.println(
                    " Usted es menor de edad" + " Y no cuenta con ningun acompañante " + "se le niega la entrada. ");

        }
    }

}
