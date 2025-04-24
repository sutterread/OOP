import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Operaciones operacion = new Operaciones();
        boolean salir = false;
        int opcion;
        String op, mensaje, primerInput, segundoInput;
        DecimalFormat formato = new DecimalFormat("0.###");
        while (!salir){
            op = JOptionPane.showInputDialog("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar. Ingrese 4 si desea salir");
            opcion = Integer.parseInt(op);
            double num1, num2;
            switch(opcion){
                case 1:
                JOptionPane.showMessageDialog(null, "En este caso, no importa el orden de los sumandos o números a sumar. Continúe.");
                primerInput = JOptionPane.showInputDialog("Ingrese el primer sumando");
                segundoInput = JOptionPane.showInputDialog("Ingrese el segundo sumando");
                num1 = Double.parseDouble(primerInput);
                num2 = Double.parseDouble(segundoInput);
                operacion.setNumero1(num1);
                operacion.setNumero2(num2);
                mensaje = String.format("La suma entre %s y %s equivale a %s", formato.format(operacion.getNumero1()),formato.format(operacion.getNumero2()),formato.format(operacion.sumar()));
                JOptionPane.showMessageDialog(null,mensaje);
                break;

                case 2:
                JOptionPane.showMessageDialog(null, "En este caso, SI importa el orden del minuendo (cantidad a la que se le resta) y sustraendo (cantidad que se le resta al minuendo).\nTenga en cuenta el orden al ingresarlos a continuación.");
                primerInput = JOptionPane.showInputDialog("Ingrese el minuendo");
                segundoInput = JOptionPane.showInputDialog("Ingrese el sustraendo");
                num1 = Double.parseDouble(primerInput);
                num2 = Double.parseDouble(segundoInput);
                operacion.setNumero1(num1);
                operacion.setNumero2(num2);
                mensaje = String.format("La resta o diferencia entre %s y %s equivale a %s", formato.format(operacion.getNumero1()),formato.format(operacion.getNumero2()),formato.format(operacion.restar()));
                JOptionPane.showMessageDialog(null,mensaje);
                break;

                case 3:
                JOptionPane.showMessageDialog(null, "En este caso, no importa el orden de los factores o números a multiplicar. Continúe.");
                primerInput = JOptionPane.showInputDialog("Ingrese el primer factor:");
                segundoInput = JOptionPane.showInputDialog("Ingrese el segundo factor:");
                num1 = Double.parseDouble(primerInput);
                num2 = Double.parseDouble(segundoInput);
                operacion.setNumero1(num1);
                operacion.setNumero2(num2);
                mensaje = String.format("El producto entre %s y %s equivale a %s", formato.format(operacion.getNumero1()),formato.format(operacion.getNumero2()),formato.format(operacion.multiplicar()));
                JOptionPane.showMessageDialog(null, mensaje);
                break;

                case 4:
                salir =true;
                break;

                default:
                mensaje = "La opción ingresada no es válida";
                JOptionPane.showMessageDialog(null,mensaje);
                break;
            }
        }
    }
}
