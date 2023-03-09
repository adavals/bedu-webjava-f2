//Implementar a clase "principal"
public class Granola implements Helado {

    //Faltó agregar la clase "principal" como private
    //¿Por qué dos veces "helado"?
    private Helado helado;
    public Granola (Helado helado) {
    //No poner "new"
    this.helado = helado;
    }
    @Override
    //Return + clase "principal" + llamar método + agregar carac. de esta clase
    public String getItem() {
        return helado.getItem() + " con Granola";
    }
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}