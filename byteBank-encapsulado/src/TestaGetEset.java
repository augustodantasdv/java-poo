public class TestaGetEset {
    public static void main(String[] args){
        System.out.println();
        Conta conta001 = new Conta();
        System.out.println("Criada Conta do Augusto: "+ conta001);

        Cliente cliente001 = new Cliente();
        System.out.println("Criado o primeiro cliente do banco: cliente 001 - "+ cliente001);
        cliente001.setNome("Augusto Dantas");
        System.out.println("Setado nome do cliente 001: "+ cliente001.getNome());

        System.out.println();
        conta001.setTitular(cliente001);
        System.out.println("Referenciado cliente "+ cliente001.getNome()+ " como titular da Conta do Augusto.");
        System.out.println();
        System.out.println(conta001.getTitular().getNome());
        System.out.println(cliente001.getNome());

        System.out.println();
        conta001.getTitular().setProfissao("Programador");
    }
}
