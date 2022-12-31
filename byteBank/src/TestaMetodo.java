public class TestaMetodo {
    public static void main (String[] args){
        System.out.println();

        Conta contaDoPaulo = new Conta();
        System.out.println("Abriu conta do Paulo");
        contaDoPaulo.saldo = 100;
        System.out.println("Abriu conta com R$ "+ contaDoPaulo.saldo);
        contaDoPaulo.deposita(50);
        System.out.println("Depositou R$ 50,00");
        System.out.println("Saldo Conta do Paulo R$ "+ contaDoPaulo.saldo);

        System.out.println();
        boolean conseguiuRetirar = contaDoPaulo.saca(50);
        System.out.println("Conta do Paulo sacou R$ 50,00");
        System.out.println("Saldo conta do Paulo R$ "+ contaDoPaulo.saldo);
        System.out.println("Conseguiu sacar? "+ conseguiuRetirar);

        System.out.println();
        Conta contaDaMarcela = new Conta();
        System.out.println("Abriu conta da Marcela");
        contaDaMarcela.deposita(1000);
        System.out.println("Conta da Marcela deposita R$ 1.000,00");

        /* MARCELA VAI TRANSFERIR R$ 300,00 PARA O PAULO */
        System.out.println();
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
            if (sucessoTransferencia){
                System.out.println("Tranferência com sucesso!");
            } else {
                System.out.println("Faltou dinheiro");
            }

        System.out.println("Marcela Tranferiu 300,00 para o Paulo");
        System.out.println("Saldo da conta da Marcela R$ "+ contaDaMarcela.saldo);
        System.out.println("Saldo da conto do Paulo R$ "+ contaDoPaulo.saldo);
    }
}
