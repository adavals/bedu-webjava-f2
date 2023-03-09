public class Galleta extends HeladoSuaveDecorator{

    private HeladoSuave heladoSuave;

    public Galleta(HeladoSuave heladoSuaveConcreto){
        System.out.println("Agregar Galleta");
        this.heladoSuave = heladoSuaveConcreto;
    }
    @Override
    public float getPrecio() {
        return heladoSuave.getPrecio() + 15;
    }
}
