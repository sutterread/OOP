import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Vista {
    public static double solicitarNumero(String mensaje){
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
    public static int opcionMenu(String mensaje){
        String opcion = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(opcion);
    }
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static String formatearDouble(double numero){
        DecimalFormat formato = new DecimalFormat("#,###.##");
        return formato.format(numero);
    }
}
