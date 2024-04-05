import javax.swing.JOptionPane;

public class TablaTrigonoApp {
    public static void main(String[] args) {
        int Angulogrados = 1;
        int contador = 1;

        while (contador <= 300){
            System.out.println("Los siguientes resultados son del angulo" +Angulogrados);
            double radianes = Angulogrados * Math.PI / 180;
            double seno = Math.sin(radianes);
            System.out.printf("El seno es %.4f %n", seno);

            double coseno = Math.cos(radianes);
            System.out.printf("El coseno es %.4f %n",coseno);

            double tangente = Math.tan(radianes);
            System.out.printf("La tangente es %.4f %n", tangente);

            System.out.println("");

            Angulogrados++;
            contador++;
        }
    }
}
