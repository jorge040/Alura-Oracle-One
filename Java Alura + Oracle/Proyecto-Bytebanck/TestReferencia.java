public class TestReferencia {
    public static void main(String[] args) {
        Cliente maria = new Cliente();
        maria.setNombre("Maria");
        maria.setDocumento("1ad61a56d");
        maria.setTelefono("51651451415");
        maria.setSexo("Mujer");
        System.out.println( " Hola  " + maria.getNombre());
        System.out.println( " Su documento es: " + maria.getDocumento());
        System.out.println( " Su telefono es: " + maria.getTelefono());
        System.out.println( " Su genero es: " + maria.getSexo());

        Cuenta CuentaDeMaria = new Cuenta(1);
        CuentaDeMaria.setTitular(maria);
        System.out.println(CuentaDeMaria.getTitular());

    }
}
