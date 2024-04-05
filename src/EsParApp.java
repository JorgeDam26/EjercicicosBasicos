import javax.swing.JOptionPane;


public class EsParApp {

    /**
     * Escribe una nueva aplicación que nos pida un número entero y escriba en consola si es PAR o es IMPAR.
     * @param args
     */
    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
        int numero = Integer.parseInt(numeroLeido);

        if (numero % 2 == 0){
            System.out.println("El numero " +numero+ " es par");
        }else {
            System.out.println("El numero " +numero+ " es impar ");
        }
    }
}
