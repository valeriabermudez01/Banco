import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    public void consultarSaldoCuenta(){
        Cliente cliente1 = new Cliente("Valeria","cedula",1193501571,new Cuenta(131431241,550));
        double saldo = cliente1.consultarSaldoCuenta();
        assertEquals(550,saldo,0.01);
    }

    @Test
    public void retirar(){
        Cliente cliente1 = new Cliente("Valeria","cedula",1193501571,new Cuenta(131431241,550));
        double saldo = cliente1.retirar(210.5);
        assertEquals(339.5,saldo,0.01);

    }

}