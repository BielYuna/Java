public class FuncionamentoBomba {
    private boolean status;

    public FuncionamentoBomba() {
        this.status = false;
    }

    public void ligarBomba(int segundos) {
        if (!status) {
            status = true;
            System.out.println("Bomba ligada.");
            for (segundos = 5; segundos > 0; segundos--) {
                System.out.println("Bomba em funcionamento...");
                System.out.println("Desligando em " + segundos + " segundos.");
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
    public void getStatus() {
        if (status) {
            System.out.println("A bomba está ligada.");
        } else {
            System.out.println("A bomba está desligada.");
        }
    }
}