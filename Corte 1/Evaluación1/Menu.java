public class Menu {
     private String mensaje;
     public void menu(){
        boolean salir = false;
        Operaciones operacion = new Operaciones();
        while(!salir){
            switch(Vista.opcionMenu("Ingrese la opción según corresponda:\n1. Consignación.\n2. Retiro.\n3. Consulta de saldo.\n4. Salir.")){
            case 1:
            operacion.consignar(Vista.solicitarNumero("Ingrese la cantidad a consignar"));
            mensaje= String.format("Tras la consignación, su saldo actual es de: %s unidades monetarias",Vista.formatearDouble(operacion.getSaldo()));
            Vista.mostrarMensaje(mensaje);
            break;
            case 2:
            operacion.retirar(Vista.solicitarNumero("Ingrese la cantidad a retirar"));
            mensaje= String.format("Tras el retiro, su saldo actual es de: %s unidades monetarias", Vista.formatearDouble(operacion.getSaldo()));
            Vista.mostrarMensaje(mensaje);
            break;
            case 3:
            mensaje= String.format("Su saldo actual es de: %s unidades monetarias", Vista.formatearDouble(operacion.getSaldo()));
            Vista.mostrarMensaje(mensaje);
            break;
            case 4:
            salir = true;
            break;
            default:
            Vista.mostrarMensaje("Opción no valida, intente nuevamente");
            break;
            }
        }
    }
}
