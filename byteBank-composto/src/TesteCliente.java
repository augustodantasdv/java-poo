public class TesteCliente {
    public static void main(String[] args){
        System.out.println();
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";


        System.out.println("Saldo conta da Marcela R$ "+ contaDaMarcela.saldo);
        System.out.println("Nome do Titular da conta da Marcela é : "+ contaDaMarcela.titular.nome);
    }
}
