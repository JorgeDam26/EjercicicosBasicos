import javax.swing.JOptionPane;


public class ListaNumerosApp {

    /**
     * Escribe una aplicación Java que escriba en pantalla los números del 1 a un número
     * leído por teclado de 3 en 3. Al final mostrará la cantidad de números escritos.
     * @param args
     */
    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog("Dime un numero");
        int numMax = Integer.parseInt(numeroLeido);
        int contador = 0;
        int numSuma = 1;

        while (numSuma < numMax){
            System.out.println(numSuma);
            numSuma = numSuma + 3;
            contador++;
        }
        System.out.printf("------%n Total %d%n ", contador);
    }
}
