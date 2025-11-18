package parte2;
public class UsaGPS {
    public static void main(String[] args) {
        GPS gps1 = new GPS();

        gps1.defalt();
        gps1.ligarGPS();
        gps1.ligarGPS();
        gps1.desligarGPS();
        gps1.desligarGPS();
        gps1.definirRota("Rua das Flores, 123");
        gps1.ligarGPS();
        gps1.definirRota("Rua das Flores, 123");
        gps1.definirIdioma("Inglês");
        gps1.mostrarStatus();
    }
}