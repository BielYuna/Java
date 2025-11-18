package parte2;

public class GPS {
    String idioma, rota;
    private boolean gps;

    public void defalt(){
        this.idioma = "Português";
        this.rota = "Defina a rota!";
    }
    public void ligarGPS(){
        if (gps) {
            System.out.println("O GPS já está ligado.");
        } else {
            this.gps = true;
            System.out.println("GPS ligado.");
        }
    }
    public void desligarGPS(){
        if (!gps) {
            System.out.println("O GPS já está desligado.");
        } else {
            this.gps = false;
            System.out.println("GPS desligado.");
        }
    }
    public void definirRota(String rota){
        try {
            Thread.sleep(1000);
            if (gps) {
            this.rota = rota;
            System.out.println("Rota definida para: " + rota);
        } else {
            System.out.println("Ligue o GPS para definir uma rota.");
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void definirIdioma(String idioma){
        try {
            Thread.sleep(1000);
             this.idioma = idioma;
        System.out.println("Idioma definido para: " + idioma);
        if (!gps) {
            System.out.println("Ligue o GPS para começar a navegação.");
        }else {
            System.out.println("GPS já está ligado. Pronto para navegação em " + idioma + ".");
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void mostrarStatus(){
        String statusGPS = gps ? "ligado" : "desligado";
        System.out.println("Status do GPS: " + statusGPS);
        System.out.println("Idioma: " + idioma);
        System.out.println("Rota: " + rota);
    }

}
