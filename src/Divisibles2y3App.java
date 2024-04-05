import javax.swing.JOptionPane;

public class Divisibles2y3App {

    /**
     * En este programa tu tecleas un numero N y
     * empezando por 1 te muestra todos los numeros que son divisibles entre 2 y 3 hasta llegar a N.
     * @param args
     */
    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
        int numMax = Integer.parseInt(numeroLeido);
        int numDivision = 1;

        while (numDivision < numMax ){
            if (numDivision % 2 ==0 || numDivision % 3 == 0){
                System.out.println(numDivision);
            }
            numDivision++;
        }
    }
}
