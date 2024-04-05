import javax.swing.JOptionPane;

public class CalculaSuperficieCirculo {
    public static void main (String[] args){

        double Superficie = calculaSuperficieCirculo (15);
        System.out.printf("La superficie del circulo es %.2f", Superficie);
    }


    /**
     * Implementar el método que CALCULE la superficie de un circulo.
     * La formula utilizada es "Área de un círculo = π r² "
     * @param radio Es el unico valor que necesitamos saber para calcular la superficie SE PONE EN METROS!!!
     * @return Devuelve el resultado de (la superficie)
     */

    public static double calculaSuperficieCirculo (double radio){
        double superficie = Math.PI * (radio * radio);
        return superficie;
    }
}
