public class FabricaLogitech implements FabricaAbstrata{

    @Override
    public Mouse createMouse() {
        return new MouseLogitech();
    }

    @Override
    public Teclado createTeclado() {
        return new TecladoLogitech() {
        };
    }
}
