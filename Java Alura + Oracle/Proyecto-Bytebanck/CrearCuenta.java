public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta PrimeraCuenta = new Cuenta();
        PrimeraCuenta.depositar(1000);
        System.out.println( " Su saldo es de: " + PrimeraCuenta.getsaldo());

        Cuenta SegundaCuenta = new Cuenta();
        SegundaCuenta.depositar(500);
        System.out.println(" Su saldo es de: " + SegundaCuenta.getSaldo());
    }
    
}
