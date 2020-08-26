public class Cliente {
    String nombre;
    String documento;
    int identificacion;
    Cuenta tipoCuenta;

    public Cliente(String nombre, String documento, int identificacion, Cuenta tipoCuenta) {
        this.nombre = nombre;
        this.documento = documento;
        this.identificacion = identificacion;
        this.tipoCuenta = tipoCuenta;
    }

    public double consultarSaldoCuenta(){
        System.out.println("El saldo es "+ this.tipoCuenta.saldo );
        return this.tipoCuenta.saldo;
    }

    public double retirar(double monto){
        if(monto<=this.tipoCuenta.saldo){
            this.tipoCuenta.saldo=this.tipoCuenta.saldo-monto;
            System.out.println("Transacción realizada,su saldo disponible es "+this.tipoCuenta.saldo);
        }else{
            System.out.println("Su saldo es insuficiente para realizar la transacción, su saldo es "+this.tipoCuenta.saldo);
        }
        return this.tipoCuenta.saldo;
    }


}
