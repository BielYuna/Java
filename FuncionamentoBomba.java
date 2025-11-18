public class FuncionamentoBomba {
    private boolean status;
    private double nivelAgua;

    public FuncionamentoBomba() {
        this.status = false;
        this.nivelAgua = 0.0;
    }

    public void ligarBomba() {
        if (!status) {
            status = true;
            System.out.println("Bomba ligada.");
            for (int i = 5; i > 0; i--) {
                System.out.println("Bomba em funcionamento...");
                System.out.println("Desligando em " + i + " segundos.");
            }
            status = false;
            System.out.println("Bomba desligada automaticamente!");
        } else {
            System.out.println("A bomba já está ligada.");
        }
    }

    public void desligarBomba() {
        if (status) {
            status = false;
            System.out.println("Bomba desligada.");
        } else {
            System.out.println("A bomba já está desligada.");
        }
    }

    public void adicionarAgua(double quantidade) {
        if (quantidade > 0) {
            nivelAgua += quantidade;
            System.out.println("Adicionado " + quantidade + " litros de água. Nível atual: " + nivelAgua + " litros.");
        } else {
            System.out.println("Quantidade inválida para adicionar água.");
        }
    }

    public void bombearAgua(double quantidade) {
        if (status) {
            if (quantidade > 0 && quantidade <= nivelAgua) {
                nivelAgua -= quantidade;
                System.out.println("Bombearam " + quantidade + " litros de água. Nível atual: " + nivelAgua + " litros.");
            } else {
                System.out.println("Quantidade inválida para bombear água.");
            }
        } else {
            System.out.println("A bomba está desligada. Não é possível bombear água.");
        }
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public boolean status() {
        return status;
    }
}