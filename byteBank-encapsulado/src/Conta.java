public class Conta {
    // ATRIBUTOS
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    // CONSTRUTORES
    public Conta(){

    }

    public Conta(int agencia, int numero){
        if(agencia > 0 && numero > 0) {
            this.agencia = agencia;
            this.numero = numero;
        }
        System.out.println("Estou criando uma conta.");
        totalDeContas++;
        System.out.println("Total de contas abertas: "+ totalDeContas);

    }


    // MÉTODOS
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    // GETERS & SETTERS


    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //GET E SET STATIC

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public static void setTotalDeContas(int totalDeContas) {
        Conta.totalDeContas = totalDeContas;
    }
}
