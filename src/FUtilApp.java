public class FUtilApp {
  public static void main(String[] args) {
    boolean existe = FUtil.existe("BisiestoApp.java");
    System.out.println(existe);
     
    existe = FUtil.existe("RiegoParcela");
    System.out.println(existe);

    existe = FUtil.existe("");
    System.out.println(existe);
  }
}
