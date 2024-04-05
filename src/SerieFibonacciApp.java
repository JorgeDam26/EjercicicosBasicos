import javax.swing.JOptionPane;

public class SerieFibonacciApp {


    /**
     * Escribe una aplicación Java que escriba en pantalla la serie de Fibonacci sin superar un
     * número que será pedido por teclad
     * @param args
     */

    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
        int NumMax = Integer.parseInt(numeroLeido);
        int numNuevo = 1;
        int numAnterior = 0;
        int suma = 0;

        System.out.println(numNuevo);

        while (suma < NumMax) {
            suma = numNuevo + numAnterior ;
            System.out.println(suma);
            numAnterior = numNuevo;
            numNuevo = suma;
        }
    }
}
