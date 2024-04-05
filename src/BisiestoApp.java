import javax.swing.JOptionPane;


public class BisiestoApp {

    /**
     * Esto es un programa que te dice si un año es bisiesto o no
     * @param args
     */
    public static void main(String[] args) {
        String añoLeido = JOptionPane.showInputDialog("Dime un año");
        int año = Integer.parseInt(añoLeido);

        if (año % 4 ==0){
            System.out.println("El año " +año+ " es bisiesto");
        }else
            System.out.println("El año " +año+ " no es bisiesto");

    }
}
