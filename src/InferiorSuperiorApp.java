import javax.swing.JOptionPane;

public class InferiorSuperiorApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String numeroLeido = JOptionPane.showInputDialog ("Dime el numero minimo");
        int numMin = Integer.parseInt (numeroLeido);

        String numeroLeido2 = JOptionPane.showInputDialog ("Dime un numero maximo");
        int numMax = Integer.parseInt (numeroLeido2);

        numerosEntre (9,13);

        numerosEntre (numMin, numMax);
    }

    /**
     * Metodo que escriba una serie de números entre uno inferior u otro superior
     * @param numMin Es el numero por el que va a empezar la serie (incluido)
     * @param numMax Es el numero donde va a terminar la seria (incluido)
     */

    public static void numerosEntre (int numMin, int numMax){
        for (;numMin <= numMax; numMin++){
            System.out.println(numMin);
        }
    }
}
