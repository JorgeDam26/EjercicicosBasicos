import javax.swing.JOptionPane;

public class RiegoParcela {
    /**
     * Escribe una aplicación Java que pida por teclado la
     * superficie de la parcela y calcule dos valores:
     *      a) la longitud en metros del brazo necesario para regarla (pivote).
     *      b) los metros de valla que necesitamos para rodear la parcela
     * @param args
     */
    public static void main(String[] args) {
        String numeroSuperficie = JOptionPane.showInputDialog("Dime el area de la parcela");
        int area = Integer.parseInt(numeroSuperficie); // Superficie = Area

        double radio = Math.sqrt(area / Math.PI);
        double perimetro = 2 * Math.PI * radio;

        System.out.printf("ELa longitud del brazo es %.2f metros. %n", radio);
        System.out.printf("La longitud de la vaya es %.2f metros. %n", perimetro);
    }
}
