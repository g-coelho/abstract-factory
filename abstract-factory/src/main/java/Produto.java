public class Produto {
    private Teclado teclado;
    private Mouse mouse;

    public Produto(FabricaAbstrata fabrica){
        this.teclado = fabrica.createTeclado();
        this.mouse = fabrica.createMouse();
    }

    public String produzirTeclado(){
        return this.teclado.produzir();
    }

    public String produzirMouse(){
        return this.mouse.produzir();
    }

}
