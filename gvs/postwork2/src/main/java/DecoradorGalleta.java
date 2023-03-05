public class DecoradorGalleta implements Helado{
    private Helado helado;
    public DecoradorGalleta(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " + Galleta";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 15;
    }
}
