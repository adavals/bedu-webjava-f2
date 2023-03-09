public class Mermelada implements Helado {

    private Helado helado;
    public Mermelada (Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getItem() {
        return helado.getItem() + " con Mermelada";
    }
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}