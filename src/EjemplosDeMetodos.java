import javax.swing.JOptionPane;

public class EjemplosDeMetodos {
    public static void main(String[] args) {
        // Escribe cuadrado de asteriscos
        for (int i=0; i<3; i++){
            pintaLinea (3);
        }
        System.out.println("");

        //Parametros formales
        // Escribe "escalera" de asteriscos
        pintaLinea (3, '*');
        pintaLinea (2, '-');
        pintaLinea (1, '/');
    }   //Fin main

    public static void pintaLinea(int num){
        // Quiero pintar una linea de N caracteres y tiene que ser '*'
        pintaLinea(num,'*');



        // Quiero calcular el IMC de Messi
        double indice = calcularIMC (90, 2);
        System.out.printf("IMC =  %.2f %n", indice);

    }



    // Parametros reales
    public static void pintaLinea(int num, char simbolo){
        // Esccribo una linea de N asteriscos, donde N me lo indican por parámetro
        for (int i=0; i<num; i++){
            System.out.print(simbolo);
        }
        System.out.println(""); // Salto de linea al final
        // Quiero pintar una linea de N caracteres y tiene que ser '*'
        //      pintaLinea(num,'*');
    }



// Metodo que calcula
    // IMC (indice de masa corporal) = peso (kg) / (altura (m)) * (altura (m))
    //double por que devuelve un numero con decimales

    /**
     * Metodo que calcula el INdice de Masa Corporal (IMC), dados el peso y la altura.
     * IMC = peso (kg) / (altura (m) al cuadrado).
     *
     * @param peso El peso en Kg.
     * @param altura La altura en metros.
     * @return EL indice de masa corporal.
     */
    static public double calcularIMC (double peso, double altura){

        double resultado = peso / (altura * altura);
        // Como en el metodo se ha pedido un double, necesitamos que haya una sentencia de retorno de esa variable
        return resultado;
    }
}
