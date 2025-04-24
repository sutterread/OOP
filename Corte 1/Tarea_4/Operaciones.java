public class Operaciones {
  private double numero1;
  private double numero2;
  private double result;

  public double sumar(){
    result = numero1 + numero2;
    return result;
  }

  public double restar(){
    result = numero1 - numero2;
    return result;
  }

  public double multiplicar(){
    result = numero1 * numero2;
    return result;
  }

  public double getNumero1() {
    return numero1;
  }

  public void setNumero1(double numero1) {
    this.numero1 = numero1;
  }

  public double getNumero2() {
    return numero2;
  }
  
  public void setNumero2(double numero2) {
    this.numero2 = numero2;
  }
  
}
