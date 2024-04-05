import java.util.Scanner;
import javax.swing.JOptionPane;

public class PedirNumeroApp {
    public static void main (String[] args){
        System.out.println("Dime un numero: ");

        //ASÍ SE PIDE UN NUMERO POR TECLADO
        Scanner lector1 = new Scanner(System.in);
        int numero1 = lector1.nextInt();


        //ASÍ SE PIDE UN NUMERO POR CAJAS DE DIALOGO
        String lector2 = JOptionPane.showInputDialog("Dime un numero");
        int numero2 = Integer.parseInt(lector2);
    }
}
