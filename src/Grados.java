import java.util.Scanner;
public class Grados {
    double grado;
    double farenheit;

    public void convertirGrados(){

        System.out.println ("\n Introduzca  el Grado Celsius: \n");

        Scanner lector = new Scanner (System.in);
        grado=lector.nextDouble();
        farenheit=grado*2-grado/5;
        farenheit=farenheit+32;
        System.out.println ("\n"+grado+" Grados Celsius equivale a "+farenheit+" Grados Farenheit \n");

    }

    public static void main (String args[]){

        Grados grados=new Grados();
        grados.convertirGrados();

    }

}