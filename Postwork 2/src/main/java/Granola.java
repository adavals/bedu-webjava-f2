public class Granola extends HeladoSuaveDecorator {

    private HeladoSuave heladoSuave;

    public Granola(HeladoSuave heladoSuaveConcreto) {
        System.out.println("Agregar Granola");
        this.heladoSuave = heladoSuaveConcreto;
    }

    @Override
    public float getPrecio() {
        return heladoSuave.getPrecio() + 10;
    }
}
