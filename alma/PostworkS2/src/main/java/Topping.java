public class Topping implements Helado {

    private Helado helado;
    public Topping (Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getItem() {
        return helado.getItem() + " con Topping";
    }
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}