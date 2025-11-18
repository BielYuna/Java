package parte4;

public class Robo implements Teste {
    @Override
    public void metodoAndar() {
        try {
        System.out.println("O robô está andando.");
            Thread.sleep(1000); // Simula o tempo de andar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void metodoVirar() {
        try {
            System.out.println("O robô está virando.");
            Thread.sleep(1000); // Simula o tempo de virar
            System.out.println("O robô virou.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void metodoParar() {
        try {
            System.out.println("O robô está parando.");
            Thread.sleep(1000); // Simula o tempo de parar
            System.out.println("O robô parou.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void metodoFalar() {
        try {
            System.out.println("O robô está se preparando para falar.");
            Thread.sleep(1000); // Simula o tempo de preparação para falar
            System.out.println("O robô está falando.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
