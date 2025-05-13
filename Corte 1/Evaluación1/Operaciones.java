public class Operaciones {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void consignar(double cantidad) {
        saldo = cantidad+saldo;
    }
    public void retirar(double cantidad){
        if (saldo>=cantidad){
            saldo = saldo-cantidad;
        }
        else{
            Vista.mostrarMensaje("Su saldo actual es insuficiente para realizar este retiro.");
        }
    }
}
