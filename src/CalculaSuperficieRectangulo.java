import javax.swing.JOptionPane;

public class CalculaSuperficieRectangulo {
    public static void main (String [] args){
        double superficie = superficieRectangulo (10, 5);

        System.out.printf("La superficie del rectangulo es %.2f", superficie);
    }


    /**
     * Implementar el metodo que CALCULE la superficie de un rectangulo.
     * La fomula utilizada es A = (base * altura)
     * @param base Es la base del rectangulo EN METROS
     * @param altura Es la altura del rectangulo EN METROS
     * @return Devuelve la solución de calcular la superficie
     */
    public static double superficieRectangulo (double base, double altura){
        double superficie = base * altura;
        return superficie;
    }
}
