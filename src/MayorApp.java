import javax.swing.JOptionPane;

public class MayorApp {

    /**
     * Escribe una aplicación Java que lea tres números enteros y escriba por consola cuál
     * de ellos es el mayor. En el caso de que dos o los tres sean iguales, se escribirá en
     * consola que no son los tres distintos.
     * @param args
     */
    public static void main(String[] args) {
        String numeroA = JOptionPane.showInputDialog("Dime el primer número");
        int numA = Integer.parseInt(numeroA);

        String numeroB = JOptionPane.showInputDialog("Dime el segundo número");
        int numB = Integer.parseInt(numeroB);

        String numeroC = JOptionPane.showInputDialog("Dime el tercer número");
        int numC = Integer.parseInt(numeroC);


        if (numA > numB && numA > numC){
            System.out.println(numA+ " es el mayor");
        }
        if (numB > numA && numB > numC){
            System.out.println(numB+ " es el mayor");
        }
        if (numC > numA && numC > numB){
            System.out.println(numA+ " es el mayor");
        }
    }
}
