public class Topping extends HeladoSuaveDecorator{

    private HeladoSuave heladoSuave;

    public Topping(HeladoSuave heladoSuaveConcreto){
        System.out.println("Agregar Topping");
        this.heladoSuave = heladoSuaveConcreto;
    }
    @Override
    public float getPrecio() {
        return heladoSuave.getPrecio() + 20;
    }
}
