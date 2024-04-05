import javax.swing.JOptionPane;

public class RaicesEcuacion2ºGrado {

    /**
     * Escribe una aplicación Java que calcule las raíces de una ecuación de 2º grado.
     * @param args
     */
    public static void main(String[] args) {
        String numeroleidoA = JOptionPane.showInputDialog("Dime el numero A");
        int numeroA = Integer.parseInt(numeroleidoA);

        String numeroleidoB = JOptionPane.showInputDialog("Dime el numero B");
        int numeroB = Integer.parseInt(numeroleidoB);

        String numeroleidoC = JOptionPane.showInputDialog("Dime el numero C");
        int numeroC = Integer.parseInt(numeroleidoC);

        double raizHecha = ((numeroB * numeroB)- 4 * numeroA * numeroC);


        if (raizHecha < 0) {
            JOptionPane.showMessageDialog(null, "Las raices son imaginarias");

        }else{
            double ec1 = (-numeroB + Math.sqrt(raizHecha))/ (2 * numeroA);
            double ec2 = (-numeroB - Math.sqrt(raizHecha))/ (2 * numeroA);
            System.out.printf("La solución de la ec1 es %.2f %n", ec1);
            System.out.printf("La solucion de la ec2 es %.2f %n", ec2);
        }
    }
}
