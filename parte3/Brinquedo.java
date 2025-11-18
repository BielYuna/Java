package parte3;

public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    public void Brinquedo() {
        this.nome = "Desconhecido";
        this.faixaEtaria = "“0 a 2”, “3 a 5”, “6 a 10” e “acima de 10”.";
        this.preco = 0.0f;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFaixaEtaria(String faixaEtaria) {
        try {
            Thread.sleep(1000);
            if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10") || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("Faixa etária inválida. Escolha uma faixa etária entre “0 a 2”, “3 a 5”, “6 a 10” e “acima de 10”.");
            this.faixaEtaria = "Desconhecido";
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public String getFaixaEtaria() {
        return faixaEtaria;
    }
    public float getPreco() {
        return preco;
    }

    public void mostrarDados() {
        System.out.println("Nome do Brinquedo: " + nome);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Preço: R$ " + preco);
    }
}
