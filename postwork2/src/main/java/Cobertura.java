public class Cobertura extends HeladoSuaveDecorator{

    private HeladoSuave heladoSuave;

    public Cobertura(HeladoSuave heladoSuaveConcreto){
        System.out.println("Agregar Cobertura");
        this.heladoSuave = heladoSuaveConcreto;
    }
    @Override
    public float getPrecio() {
        return heladoSuave.getPrecio() + 20;
    }
}
