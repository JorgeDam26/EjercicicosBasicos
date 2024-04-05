import javax.swing.JOptionPane;
import java.util.Scanner;

public class PiramideApp {

    /**
     * Es un metodo que te hace una piramide, segun altura y caracter que tu le digas
     * @param args
     */
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime le numero de filas: ");
        int fila = teclado.nextInt();

        System.out.print("Dime el caracter: ");
        String caracter = teclado.next();


        for (int altura = 0; altura < fila; altura++) {

            for (int blanco = 0; blanco < fila - altura; blanco++){
                System.out.print(" ");
            }

            for (int asterisco = 0; asterisco < (altura * 2) - 1; asterisco++){
                System.out.print(caracter);

            }
            System.out.println();
        }
    }
}
