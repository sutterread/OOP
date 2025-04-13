public class Operations {
    
   private int a,b,r;
     // Métodos para operaciones matemáticas
    public void sumar() {
        r = a + b;
    }

    public void restar() {
        r = a - b;
    }

    public void multiplicar() {
        r = a * b; 
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
}
