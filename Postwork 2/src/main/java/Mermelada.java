public class Mermelada extends HeladoSuaveDecorator{

    private HeladoSuave heladoSuave;

    public Mermelada(HeladoSuave heladoSuaveConcreto){
        System.out.println("Agregar Mermelada");
        this.heladoSuave = heladoSuaveConcreto;
    }
    @Override
    public float getPrecio() {
        return heladoSuave.getPrecio() + 10;
    }
}
