public class DecoradorTopping implements Helado{
    private Helado helado;

    public DecoradorTopping(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " + Topping";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}
