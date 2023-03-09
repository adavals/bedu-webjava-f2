public class Cobertura implements Helado {

    private Helado helado;
    public Cobertura (Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getItem() {
        return helado.getItem() + " con Cobertura";
    }
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}