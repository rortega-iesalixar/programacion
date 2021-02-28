import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class holamundo {
  public static void main(String[] args) {
    Date date = new Date();
    DateFormat meshora = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    System.out.println(meshora.format(date));

    System.out.println("Hola Mundo");
  }
}
