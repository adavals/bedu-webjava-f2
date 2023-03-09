public class Galleta implements Helado {

    private Helado helado;
    public Galleta (Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getItem() {
        return helado.getItem() + " con Galleta";
    }
    public int getPrice() {
        return helado.getPrice() + 15;
    }
}