import java.io.File;

public class FUtil {
  /**
   * Es un método que te lee un fichero que te comprueba si 
   *  existe (devuelve true)
   *  no existe (devuelve false)
   * @param filename
   * @return
   */
  public static boolean existe(String filename){
    File file = new File(filename);
    
    if (file.exists()) {
    return true;
    }
    return false;
  }
}