import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    public void consultarSaldoCuenta(){
        Cliente cliente1 = new Cliente("Valeria","cedula",1193501571,new Cuenta(131431241,550));
        double p = cliente1.consultarSaldoCuenta();
        assertEquals(550,p,0.01);
    }

}