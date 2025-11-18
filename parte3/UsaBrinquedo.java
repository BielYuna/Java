package parte3;

public class UsaBrinquedo {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo();

        brinquedo1.setNome("Carrinho de Controle Remoto");
        brinquedo1.setFaixaEtaria("6 a 10");
        brinquedo1.setPreco(149.99f);
        brinquedo1.mostrarDados();

        System.out.println();

        Brinquedo brinquedo2 = new Brinquedo();
        brinquedo2.setNome("Boneca");
        brinquedo2.setFaixaEtaria("3 a 5");
        brinquedo2.setPreco(89.90f);
        brinquedo2.mostrarDados();

        System.out.println();

        Brinquedo brinquedo3 = new Brinquedo();
        brinquedo3.setNome("Quebra-Cabeça");
        brinquedo3.setFaixaEtaria("12 a 15"); // Faixa etária inválida
        brinquedo3.setPreco(39.50f);
        brinquedo3.mostrarDados();
    }
}
