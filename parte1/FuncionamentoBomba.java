package parte1;
public class FuncionamentoBomba {
    private boolean status;

    public void ligarBomba(int segundos) {
        try {
            if (!status) {
            status = true;
            System.out.println("Bomba ligada.");
            for (int i = segundos; segundos > 0; segundos--) {
                System.out.println("Desligando em " + segundos + " segundos.");
                Thread.sleep(1000);
            }
            desligarBomba();
        } else {
            System.out.println("A bomba já está ligada.");
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
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