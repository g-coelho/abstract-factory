public class FabricaCorsair implements FabricaAbstrata{

    @Override
    public Mouse createMouse() {
        return new MouseCorsair();
    }

    @Override
    public Teclado createTeclado() {
        return new TecladoCorsair();
    }
}
