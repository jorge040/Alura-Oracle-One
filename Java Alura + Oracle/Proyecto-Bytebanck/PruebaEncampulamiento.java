public class PruebaEncampulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Jorge");
        cliente.setDocumento("ff44");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getDocumento());

        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());

    }
}
