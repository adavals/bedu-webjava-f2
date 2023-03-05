public class DecoradorMermelada implements Helado{
    private Helado helado;

    public DecoradorMermelada(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " + Mermelada";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}
