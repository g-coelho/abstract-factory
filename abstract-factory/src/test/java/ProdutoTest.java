
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveProduzirTecladoLogitech(){
        FabricaAbstrata fabrica = new FabricaLogitech();
        Produto produto = new Produto(fabrica);
        assertEquals("Teclado Logitech.", produto.produzirTeclado());
    }

    @Test
    void deveProduzirTecladoCorsair(){
        FabricaAbstrata fabrica = new FabricaCorsair();
        Produto produto = new Produto(fabrica);
        assertEquals("Teclado Corsair.", produto.produzirTeclado());
    }

    @Test
    void deveProduzirMouseLogitech(){
        FabricaAbstrata fabrica = new FabricaLogitech();
        Produto produto = new Produto(fabrica);
        assertEquals("Mouse Logitech.", produto.produzirMouse());
    }

    @Test
    void deveProduzirMouseCorsair(){
        FabricaAbstrata fabrica = new FabricaCorsair();
        Produto produto = new Produto(fabrica);
        assertEquals("Mouse Corsair.", produto.produzirMouse());

    }





}
