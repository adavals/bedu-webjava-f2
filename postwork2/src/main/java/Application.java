public class Application {
    public static void main(String[] args) {

        System.out.println("Cliente: Un Helado con todo porfavor!");
        System.out.println("Servidor: En seguida sale!");

        HeladoSuave heladoSuaveConcreto = new HeladoSuaveConcreto();

        heladoSuaveConcreto = new Cobertura(heladoSuaveConcreto);
        heladoSuaveConcreto = new Topping(heladoSuaveConcreto);
        heladoSuaveConcreto = new Granola(heladoSuaveConcreto);
        heladoSuaveConcreto = new Mermelada(heladoSuaveConcreto);
        heladoSuaveConcreto = new Galleta(heladoSuaveConcreto);

        System.out.println("Total: $" + heladoSuaveConcreto.getPrecio());

    }
}