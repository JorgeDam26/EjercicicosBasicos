import javax.swing.JOptionPane;

public class DiasPorMesApp {
    /**
     *  Esto es un programa que te dice cuantos dias tiene un mes que tu le dices por teclado
     * @param args
     */
    public static void main(String[] args) {

        int mes =0;
        do {
            String numeroMes = JOptionPane.showInputDialog("Dime el numero de un mes");
            mes = Integer.parseInt(numeroMes);
        } while (mes < 1 || mes > 12);

        int numDias = switch (mes){ //
            case 1,3,5,7,8,10,12 -> {
                yield(31);
            }

            case 4,6,9,11 -> {
                yield(30);
            }

            default ->  {
                yield(28);
            }

        };
        System.out.println("Este mes tiene " +numDias+ " dias");
    }
}
