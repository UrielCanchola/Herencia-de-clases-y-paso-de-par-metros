
package retocuatro;

public class CuentaBase {
    //creamos atributos los cuales van a ser heredados
    //tiene un modificador de acceso privado
    private double montoActual;
    double apertura;
    double cantidad;
    
    //Creamos constantes para los  intereses
    final double QUINCE_PORCIENTO = 0.15;
    final double DIEZ_PORCIENTO = 0.10;
    
    
    //Se crea un constructor para inicializar los atributos
    //para esto se le pide al usuario apertura y cantidad a agregar
  
    CuentaBase(double apertura, double cantidad){
        this.cantidad = cantidad;
        this.apertura = apertura;
    }
    
    //Se creamos los métodos SET Y GET para el atribúto montoActual. 
    //(encapsulado)
    public void setMontoActual(double montoActual){
        this.montoActual = montoActual;        
    }
    public double getMontoActual(){
        return montoActual;
    }
    //Se Crean  los métodos de los atributos no privados   
    
   
    double depositar(){
        return cantidad ;
    }
    //4to metodo
    public double sumaInteres(){
        //El método de sumarInterés aumenta el 15% del monto actual a la deuda.
        montoActual = (apertura + cantidad) * QUINCE_PORCIENTO;
        /*if (montoActual < 0){    
            return apertura + cantidad + montoActual ; ????           
        }*/
        return apertura + cantidad + montoActual ; 
    }
    public double retirar(){
        //El método retirar resta la cantidad indicada al monto actual.
        montoActual = apertura;
        return montoActual - cantidad;
    }
    public double invertir(){
        //El método invertir aumenta el 10% al monto actual.
        montoActual = (apertura + cantidad) * DIEZ_PORCIENTO;
        return apertura + cantidad + montoActual;
    }
    
    
    
    
    
   
}
