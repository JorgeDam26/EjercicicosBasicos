import javax.swing.JOptionPane;

public class HoraApp {
    public static void main(String[] args) {
        String horaLeida = JOptionPane.showInputDialog("Dime la hora");
        int hora = Integer.parseInt(horaLeida);

        String minLeidos = JOptionPane.showInputDialog("Dime los minutos");
        int min = Integer.parseInt(minLeidos);

        String segLeidos = JOptionPane.showInputDialog("Dime los segundos");
        int seg = Integer.parseInt(segLeidos);

        boolean valida = horaValida (hora, min, seg);

        System.out.println("La hora es " +valida);
    }
    /**
     * Es un programa que me dice si la hora que le indico es verdadera o falsa (si existe o no)
     *
     * @param hora es la hora que quiero que me compruebe
     * @param min son los minutos que quiero que me compruebe
     * @param seg son los segundos que quiero que me compruebe
     * @return me debulve 'true' si la hora es válida. Me debuelve false si la hora es falsa
     */
    public static boolean horaValida (int hora, int min, int seg){
        boolean horas = true;
        if (hora < 0 || hora > 24 || min < 0 || min > 60 || seg < 0 || seg > 60){
            horas = false;
        }
        return horas;
    }
}
