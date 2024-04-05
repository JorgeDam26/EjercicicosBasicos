import javax.swing.JOptionPane;

public class DiaMesApp {

    /**
     * Escribe una aplicación Java que lea un número de mes y escriba su nombre.
     * En caso de que el mes tecleado no sea válido, escribirá “Mes XX NO existe”
     * @param args
     */

    public static void main (String[] args){

        int mes =0;
        do {
            String numeroMes = JOptionPane.showInputDialog("Dime el numero de un mes");
            mes = Integer.parseInt(numeroMes);
        } while (mes < 1 || mes > 12);

        switch (mes){
            case 1 -> {
                System.out.println("El mes " +mes+ " es ENERO");
            }

            case 2 -> {
                System.out.println("El mes " +mes+ " es FEBRERO");
            }

            case 3 -> {
                System.out.println("El mes " +mes+ " es MARZO");
            }

            case 4 -> {
                System.out.println("El mes " +mes+ " es ABRIL");
            }

            case 5 -> {
                System.out.println("El mes " +mes+ " es MAYO");
            }

            case 6 -> {
                System.out.println("El mes " +mes+ " es JUNIO");
            }

            case 7 -> {
                System.out.println("El mes " +mes+ " es JULIO");
            }

            case 8 -> {
                System.out.println("El mes " +mes+ " es AGOSTO");
            }

            case 9 -> {
                System.out.println("El mes " +mes+ " es SEPTIEMBRE");
            }

            case 10 -> {
                System.out.println("El mes " +mes+ " es OCTUBRE");
            }

            case 11 -> {
                System.out.println("El mes " +mes+ " es NOVIEMBRE");
            }

            default -> {
                System.out.println("El mes " +mes+ " es DICIEMBRE");
            }

        }
    }
}
