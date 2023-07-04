public class TestDescuento {
    public static void main(String[] args) {
        double valorCompra = 300.00, descuento1, descuento2, descuento3;

        descuento1 = valorCompra - 10;
        descuento2 = valorCompra - 15;
        descuento3 = valorCompra - 20;
    

        if (valorCompra >= 100.00 && valorCompra <= 199.99) {
            System.out.println(" Su descuento es del 10% ");
            System.out.println( " Se aplico el descuento su total a pagar es de: " + descuento1);
        }
        if (valorCompra >= 200.00 && valorCompra <= 299.99) {
            System.out.println(" Su descuento es del 15% ");
            System.out.println( " Se aplico el descuento su total a pagar es de: " + descuento2);
        }
        if (valorCompra >= 300.00 && valorCompra <= 399.99) {
            System.out.println(" Su descuento es del 20% ");
            System.out.println( " Se aplico el descuento su total a pagar es de: " + descuento3);
        }
        if (valorCompra <= 99.99) {
            System.out.println(" No se le fue otorgado ningun descuento ");
        }

    }
}
