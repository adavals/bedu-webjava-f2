public class DecoradorGranola implements Helado{
    private Helado helado;

    public DecoradorGranola(Helado helado){
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription() + " + Granola";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}
