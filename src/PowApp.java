import javax.swing.JOptionPane;

public class PowApp {
    public static void main(String[] args){

        int pot = pow (2,3);

        System.out.println("El resultado es " +pot);

    }


    /**
     * Esto es un programa que a través de un metodo te hace la potencia de 2 numeros que tu le digas
     * @param base es la base (el numero que se va a multiplicar)
     * @param exp es el exponente (el numero que indica cuentas veces se va a multipliacar la base)
     * @return Este metodo te devuelve la potencia.
     */
    public static int pow (int base, int exp){
        int multi = 0;
        int result = 1;
        for (int i = 0;  i < exp; i++){

            multi = result * base;
            result = multi;
        }
        return multi;
    }
}
