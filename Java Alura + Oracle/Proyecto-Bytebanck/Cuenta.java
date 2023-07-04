class Cuenta {
    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total = 0;

    public Cuenta(){

    }
    // Constructor 
    public Cuenta(int agencia){ 
        
        if (agencia <= 0) {
            System.out.println(" No se permite 0 ");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total ++;
        System.out.println(" Se van creando " + total + " Cuentas ");
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean tranferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }

    }

    public double getsaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static int getTotal() {
        return Cuenta.total;
    }


}
