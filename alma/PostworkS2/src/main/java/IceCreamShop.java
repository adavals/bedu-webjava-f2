//Faltó crear una clase principal para contener todos los helados
public class IceCreamShop {
    public static void main(String[] args) {

        //Crear nuevo helado suave
        Helado suave = new HeladoSuave();

        //Usar helado suave, no "helado"
        suave = new Granola(suave);
        suave = new Granola(suave);
        suave = new Topping(suave);
        suave = new Cobertura(suave);
        suave = new Mermelada(suave);
        suave = new Galleta(suave);

        System.out.println("Tipo de helado: " + suave.getItem());
        System.out.println("Precio: $" + suave.getPrice());
    }

}