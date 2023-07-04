public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta MiCuenta = new Cuenta();
        MiCuenta.depositar(300);
        MiCuenta.depositar(200);
        System.out.println(MiCuenta.getSaldo());
        MiCuenta.retirar(100);
        System.out.println(MiCuenta.getSaldo());

        Cuenta CuentaDeMaria = new Cuenta();
        CuentaDeMaria.depositar(1000);
        CuentaDeMaria.tranferir(400, MiCuenta);
        System.out.println(CuentaDeMaria.getSaldo());
        System.out.println(MiCuenta.getSaldo());


    }
}
