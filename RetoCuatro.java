
package retocuatro;

public class RetoCuatro {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";

   
    public static void main(String[] args) {

        //TARJETA DE CREDITO
        //La tarjeta de crédito tiene saldo negativo
        
        TarjetaCredito tarjetaCredito = new TarjetaCredito(-1000, 200);
        System.out.println(ANSI_RED + "Tarjeta de Crédito." + ANSI_BLACK);
        System.out.println("La tarjeta de Crédito fue abierta con: $" + tarjetaCredito.apertura + " . ");
        System.out.println("Y usted acaba de abonar: $" + tarjetaCredito.cantidad + " . ");
        System.out.println("Por lo que el monto actual a la deuda es de: $" + tarjetaCredito.sumaInteres());
        //TARJETA DEBITO
        System.out.println(ANSI_RED + "Tarjeta de Débito." + ANSI_BLACK);
        TarjetaDebito tarjetaDebito = new TarjetaDebito(4000, 1000);
        System.out.println("La tarjeta de Débito fue abierta con: $" + tarjetaDebito.apertura + " . ");
        System.out.println("Y usted acaba de retirar: $" + tarjetaDebito.cantidad + " . ");
        System.out.println("Por lo que el monto actual de su tarjeta de débito es de: $" + tarjetaDebito.retirar());
        System.out.println(ANSI_RED + "Cuenta de Ahorro." + ANSI_BLACK);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(6000, 300);
        System.out.println("La Cuenta de Ahorro fue abierta con: $" + cuentaAhorro.apertura + " . ");
        System.out.println("Y usted acaba de depositar: $" + cuentaAhorro.cantidad + " para invertirlos. ");
        System.out.println("Por lo que el monto actual de su cuenta de ahorro es de: $" + cuentaAhorro.invertir());
        System.out.println(ANSI_RED + "¡GRACIAS POR SU PREFERENCIA!");
        
        

            
        
        
        
    }
    
}
