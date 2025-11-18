package parte1;
public class UsaBomba {
    public static void main(String[] args) {
        FuncionamentoBomba bomba1 = new FuncionamentoBomba();

        bomba1.ligarBomba(5);
        bomba1.desligarBomba();
        bomba1.getStatus();
    }
}