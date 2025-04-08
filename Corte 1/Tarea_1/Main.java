public class Main {

    public static void main(String[] args) {
      Operations resultado = new Operations();
      resultado.sumar(3,2);
      System.out.println("la suma es igual a: "+resultado.r);
      resultado.restar(9, 3);
      System.out.println("la resta o diferencia equivale a: "+resultado.r);
      resultado.multiplicar(6, 3);
      System.out.println("la multiplicación da: "+resultado.r);
    }
    
}
