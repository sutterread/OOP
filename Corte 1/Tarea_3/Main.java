import java.util.Scanner ;
public class Main {
  public static void main(String[] args) {
      try (Scanner entrada = new Scanner(System.in)){

      System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();

      System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();

      Operations resultado = new Operations();

      resultado.sumar(a,b);
      System.out.println("la suma es igual a: "+resultado.getR());

      resultado.restar(a,b);
      System.out.println("la resta o diferencia equivale a: "+resultado.getR());

      resultado.multiplicar(a,b);
      System.out.println("la multiplicación da: "+resultado.getR());
    }
  
  }
}
