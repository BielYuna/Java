package parte1;
import javax.swing.JOptionPane;
public class UsaBomba {
    public static void main(String[] args) {
        FuncionamentoBomba bomba1 = new FuncionamentoBomba();
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em segundos para a bomba ficar ligada:"));

        bomba1.ligarBomba(tempo);
        bomba1.desligarBomba();
        bomba1.getStatus();
    }
}