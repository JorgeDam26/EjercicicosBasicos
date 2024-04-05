import javax.swing.JOptionPane;

public class CuadradoApp {

    /**
     * Es una aplicación que te hace un cuadrado de lado N siendo N un numero que tu le dices por teclado
     *
     * @param args
     */
    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
        int num = Integer.parseInt(numeroLeido);

        int fila = 0;

        int asteriscos = 0;

        while (fila < num){
            while (asteriscos < num) {
                System.out.printf("*");
                asteriscos++;
            }
            System.out.println();
            fila++;
            asteriscos = 0;
        }
    }
}

