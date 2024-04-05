import javax.swing.JOptionPane;


public class AdivinaClaveApp {

    /**
     * Escribe una aplicación Java que compruebe si el número tecleado coincide con el
     * elegido.
     * El número elegido es 9
     * @param args
     */
    public static void main (String [] args){
        final int clave = 9;
        int intentos = 1;


        while (intentos <= 3) {
            String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
            int num = Integer.parseInt(numeroLeido);

            if (num == clave){
                System.out.println("Enhorabuena!!! has encontrado la clave");
                intentos = intentos + 3;
            } else {
                System.out.println("Esta no es la clave");
                intentos++;
            }
        }
        System.out.println("Has agotado todos los intentos");
    }
}
