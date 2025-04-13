public class Main {

    public static void main(String[] args) {
      Operations resultado = new Operations();
      resultado.setA(3);
      resultado.setB(2);
      resultado.sumar();
      System.out.println("la suma es igual a: "+resultado.getR());
      resultado.setA(9);
      resultado.setB(3);
      resultado.restar();
      System.out.println("la resta o diferencia equivale a: "+resultado.getR());
      resultado.setA(6);
      resultado.setB(3);
      resultado.multiplicar();
      System.out.println("la multiplicación da: "+resultado.getR());
    }
    
}
