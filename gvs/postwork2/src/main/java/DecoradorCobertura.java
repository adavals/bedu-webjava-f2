public class DecoradorCobertura implements Helado {
    private Helado helado;
    public DecoradorCobertura(Helado helado){
        this.helado=helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " + Cobertura";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}
