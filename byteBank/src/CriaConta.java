public class CriaConta {
    public static void main(String[] args){
        System.out.println();

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeiraConta é R$ "+ primeiraConta.saldo);

        System.out.println();

        primeiraConta.saldo += 100;
        System.out.println("O novo saldo da primeiraConta é R$ "+ primeiraConta.saldo);

        System.out.println();

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;
        System.out.println("Saldo da primeiroConta: R$ "+ primeiraConta.saldo);
        System.out.println("Saldo da segundaConta: R$ "+ segundaConta.saldo);
    }
}