package parte1;
public class UsaBomba {
    public static void main(String[] args) {
        FuncionamentoBomba bomba1 = new FuncionamentoBomba();

        bomba1.ligarBomba(6);
        bomba1.desligarBomba();
        bomba1.getStatus();
    }
}