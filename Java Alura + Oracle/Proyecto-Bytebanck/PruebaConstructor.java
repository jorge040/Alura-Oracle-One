public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(233);
        System.out.println(cuenta.getAgencia());
        System.out.println(cuenta2.getAgencia());

    }
}
